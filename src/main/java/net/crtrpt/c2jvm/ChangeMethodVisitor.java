package net.crtrpt.c2jvm;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.objectweb.asm.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.objectweb.asm.Opcodes.*;

/**
 * @author Admin
 */
public class ChangeMethodVisitor extends ClassVisitor {

    EvalVisitor visitor=null;
    ParseTree tree=null;

    ChangeMethodVisitor(ClassVisitor classVisitor, EvalVisitor visitor,ParseTree tree) {
        super(Opcodes.ASM5, classVisitor);
        this.visitor=visitor;
        this.tree=tree;
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodVisitor methodVisitor = super.visitMethod(access, name, descriptor, signature, exceptions);
        if ("run".equals(name)) {
            System.out.println("开始编译主 函数");
            System.out.printf("%s %s %s %s %s",access,name,descriptor,signature, Arrays.toString(exceptions));

            return new RunMethodAdapter(Opcodes.ASM5, methodVisitor, access, name, descriptor,visitor,tree);
        }
        return methodVisitor;
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        System.out.printf("%s %s %s %s %s",access,name,descriptor,signature,value);
        return super.visitField(access, name, descriptor, signature, value);
    }

    @Override
    public void visitEnd() {
        System.out.println("访问结束的时候");
        System.out.println(visitor.funcDecl);
        visitor.funcDecl.forEach((id, ctx) -> {
            System.out.println("构建函数"+id);
            List<TerminalNode> params = ctx.idList() != null ? ctx.idList().Identifier() : new ArrayList<TerminalNode>();
            ParseTree block = ctx.block();
            MethodVisitor mv = super.visitMethod(ACC_PUBLIC, id, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", null, null);
            visitor.visit(block);
        });
        super.visitEnd();
    }

}

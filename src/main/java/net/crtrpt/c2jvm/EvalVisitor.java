package net.crtrpt.c2jvm;


import net.crtrpt.gen.TLBaseVisitor;
import net.crtrpt.gen.TLParser;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

import java.util.HashMap;

import static org.objectweb.asm.Opcodes.INVOKESTATIC;
import static org.objectweb.asm.Opcodes.LSTORE;


public class EvalVisitor extends TLBaseVisitor<Object> {
    HashMap<String, TLParser.FunctionDeclContext> funcDecl = new HashMap<>();
    RunMethodAdapter ctx = null;
    MethodVisitor mv = null;

    public EvalVisitor() {
        System.out.println("初始化");
    }

    @Override
    public Object visitFunctionDecl(TLParser.FunctionDeclContext ctx) {
        String id = ctx.Identifier().getText();
        funcDecl.put(id, ctx);
        return new Object();
    }

    // assignment
    // : Identifier indexes? '=' expression
    // ;
    @Override
    public Object visitAssignment(TLParser.AssignmentContext ctx) {
        Object newVal = this.visit(ctx.expression());
        if (ctx.indexes() != null) {
            System.out.println("赋值1");
        } else {
            System.out.println("赋值");
        }
        return new Object();
    }

    // Number #numberExpression
    @Override
    public Object visitNumberExpression(TLParser.NumberExpressionContext ctx) {
        System.out.println("访问" + ctx.getText());

        int startTimeId = this.ctx.newLocal(Type.LONG_TYPE);
        //调用静态方法获取系统当前时间
        this.mv.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
        this.mv.visitIntInsn(LSTORE, startTimeId);

        return new Object();
    }

    // Bool  #boolExpression
    @Override
    public Object visitBoolExpression(TLParser.BoolExpressionContext ctx) {
        System.out.println("访问" + ctx.getText());
        int startTimeId = this.ctx.newLocal(Type.LONG_TYPE);
        //调用静态方法获取系统当前时间
        this.mv.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
        this.mv.visitIntInsn(LSTORE, startTimeId);
        return new Object();
    }

    // Null #nullExpression
    @Override
    public Object visitNullExpression(TLParser.NullExpressionContext ctx) {
        System.out.println("访问" + ctx.getText());
        return new Object();
    }

    @Override
    public Object visitStringExpression(TLParser.StringExpressionContext ctx) {
        System.out.println("访问字符串表达式" + ctx.getText());
        String text = ctx.getText();
        text = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
        Object val = text;
        return val;
    }

    public void setCtx(RunMethodAdapter runMethodAdapter, MethodVisitor mv) {
        this.ctx = runMethodAdapter;
        this.mv = mv;


    }
}

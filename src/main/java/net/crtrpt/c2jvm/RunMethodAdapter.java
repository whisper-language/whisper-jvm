package net.crtrpt.c2jvm;

import org.antlr.v4.runtime.tree.ParseTree;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.commons.AdviceAdapter;

class RunMethodAdapter extends AdviceAdapter {

    private String methodName = null;

    EvalVisitor visitor=null;

    ParseTree tree=null;

    RunMethodAdapter(int api, MethodVisitor mv, int access, String name, String desc, EvalVisitor visitor, ParseTree tree) {
        super(api, mv, access, name, desc);
        this.visitor=visitor;
        this.tree=tree;
        methodName = name;
    }

    //访问方法 进入
    @Override
    protected void onMethodEnter() {
        super.onMethodEnter();
    }

    //访问方法 退出
    @Override
    protected void onMethodExit(int opcode) {
        super.onMethodExit(opcode);
        //函数退出的时候执行
        visitor.setCtx(this,mv);
        visitor.visit(tree);
    }
}
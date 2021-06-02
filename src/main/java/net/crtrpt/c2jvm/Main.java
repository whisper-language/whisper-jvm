package net.crtrpt.c2jvm;


import net.crtrpt.gen.TLLexer;
import net.crtrpt.gen.TLParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] argv) throws IOException {

        TLLexer lexer = new TLLexer(CharStreams.fromFileName("src/main/resources/test1.pg"));
        TLParser parser = new TLParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true);
        ParseTree tree = parser.parse();
        EvalVisitor visitor = new EvalVisitor();

        FileInputStream fileInputStream = new FileInputStream("src/main/resources/WhisperClass.class");
        ClassReader reader = new ClassReader(fileInputStream);

        ClassWriter writer = new ClassWriter(reader, ClassWriter.COMPUTE_MAXS);

        ClassVisitor cv = new ClassVisitorImpl(writer, visitor, tree);

        reader.accept(cv, ClassReader.EXPAND_FRAMES);
        // 获取修改后的 class 文件对应的字节数组
        byte[] code = writer.toByteArray();

        try {
            // 将二进制流写到本地磁盘上
            FileOutputStream fos = new FileOutputStream("./target/classes/net/WhisperClassIns.class");
            fos.write(code);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

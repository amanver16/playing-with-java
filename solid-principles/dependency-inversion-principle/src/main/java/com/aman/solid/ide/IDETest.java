package com.aman.solid.ide;

public class IDETest {

    public static void main(String[] args) {
        
        Editor javaEditor = new JavaEditor();
        IDE ide = new IDE(javaEditor);
        ide.editCode();

        Editor cppEditor = new CPlusPlusEditor();
        IDE ide2 = new IDE(cppEditor);
        ide2.editCode();

    }

}
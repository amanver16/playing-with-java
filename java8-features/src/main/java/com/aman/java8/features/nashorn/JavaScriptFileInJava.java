package com.aman.java8.features.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Nashorn Script Engine provides way to execute JavaScript files in a Java file
 */
public class JavaScriptFileInJava {
    
    public static void main(String[] args) {

        // Creating Nashorn script engine
        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("Nashorn");

        // Reading java script file
        try {
            scriptEngine.eval(new FileReader("src/main/java/com/aman/java8/features/nashorn/javascript/hello.js"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Exception occurred while opening file : " + fileNotFoundException.getClass().getName());
            System.out.println(fileNotFoundException.getMessage());
        } catch (ScriptException scriptException) {
            System.out.println(
                    "Exception occurred while creating nashorn engine : " + scriptException.getClass().getName());
            System.out.println(scriptException.getMessage());
        }

    }

}
package com.aman.java8.features.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * We can embed javascript code in java file, but this is not good practice.
 * Javascript code should be in Javascript file
 */
public class EmbeddingJavaScript {

    public static void main(String[] args) {

        // Creating Nashorn script engine
        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("Nashorn");

        // Embedding Java Script code
        try {
            scriptEngine.eval("print('Hello World')");
        } catch (ScriptException scriptException) {
            System.out.println(
                    "Exception occurred while creating nashorn engine : " + scriptException.getClass().getName());
            System.out.println(scriptException.getMessage());
        }

    }

}
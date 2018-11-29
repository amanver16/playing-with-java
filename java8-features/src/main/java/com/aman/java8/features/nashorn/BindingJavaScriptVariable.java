package com.aman.java8.features.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * We can pass a variable to javascript file from java file. This feature is
 * called binding
 */
public class BindingJavaScriptVariable {

    public static void main(String[] args) {

        // Create Nashorn Script Engine
        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("Nashorn");

        // Binding script
        Bindings bindings = scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE);

        // Binds "Aman" to variable "name"
        bindings.put("name", "Aman");

        // Execute java script file
        try {
            scriptEngine.eval(new FileReader("src/main/java/com/aman/java8/features/nashorn/javascript/bind.js"));
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
package com.aman.java8.features.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * We can call javascript function from a java file
 */
public class CallJavaScriptFunction {

    public static void main(String[] args) {

        // Create Nashorn Script Engine
        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("Nashorn");

        // Invoke javascript function
        try {

            scriptEngine.eval(new FileReader("src/main/java/com/aman/java8/features/nashorn/javascript/function.js"));
            // Creating Invocable object
            Invocable invocable = (Invocable) scriptEngine;
            // Calling JavaScript function
            invocable.invokeFunction("sayHello");
            invocable.invokeFunction("sayHelloByName", "Aman");

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Exception occurred while opening file : " + fileNotFoundException.getClass().getName());
            System.out.println(fileNotFoundException.getMessage());
        } catch (ScriptException scriptException) {
            System.out.println(
                    "Exception occurred while creating nashorn engine : " + scriptException.getClass().getName());
            System.out.println(scriptException.getMessage());
        } catch (NoSuchMethodException noSuchMethodException) {
            System.out.println("Exception occurred while calling javascript function. : "
                    + noSuchMethodException.getClass().getName());
            System.out.println(noSuchMethodException.getMessage());
        }

    }

}
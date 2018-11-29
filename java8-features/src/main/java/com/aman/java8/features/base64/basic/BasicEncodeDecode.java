package com.aman.java8.features.base64.basic;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class BasicEncodeDecode {

    public static void main(String[] args) {

        String encodeString = "Aman";
        System.out.println("Original String : " + encodeString);

        // Get encoder object
        Encoder encoder = Base64.getEncoder();

        // Encode given string
        // encodeToString() takes bytes as input and returns encoded string
        String encodedString = encoder.encodeToString(encodeString.getBytes());
        System.out.println(encodeString + " encoded to " + encodedString);

        // Get Decoder object
        Decoder decoder = Base64.getDecoder();

        // Decode encoded string
        // decodeToString() takes encoded string as byte and decode it
        String decodedString = new String(decoder.decode(encodedString));
        System.out.println(encodedString + " decoded to " + decodedString);

    }

}
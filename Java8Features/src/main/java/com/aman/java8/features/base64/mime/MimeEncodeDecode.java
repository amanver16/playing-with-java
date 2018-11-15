package com.aman.java8.features.base64.mime;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class MimeEncodeDecode {

    public static void main(String[] args) {

        String encodeMessage = "Hi There !! What's Up ?";
        System.out.println("Original message : " + encodeMessage);

        // Get encoder object
        Encoder encoder = Base64.getMimeEncoder();

        // Encode given mime
        // encodeToString() takes bytes as input and returns encoded mime
        String encodedMessage = encoder.encodeToString(encodeMessage.getBytes());
        System.out.println(encodeMessage + " encoded to " + encodedMessage);

        // Get Decoder object
        Decoder decoder = Base64.getMimeDecoder();

        // Decode encoded Mime
        // decodeToString() takes encoded mime as byte and decode it
        String decodedMMessage = new String(decoder.decode(encodedMessage));
        System.out.println(encodedMessage + " decoded to " + decodedMMessage);

    }

}
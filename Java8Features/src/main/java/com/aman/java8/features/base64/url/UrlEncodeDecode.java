package com.aman.java8.features.base64.url;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class UrlEncodeDecode {

    public static void main(String[] args) {

        String encodeUrl = "https://www.aman.com";
        System.out.println("Original URL : " + encodeUrl);

        // Get encoder object
        Encoder encoder = Base64.getUrlEncoder();

        // Encode given url
        // encodeToString() takes bytes as input and returns encoded url
        String encodedUrl = encoder.encodeToString(encodeUrl.getBytes());
        System.out.println(encodeUrl + " encoded to " + encodedUrl);

        // Get Decoder object
        Decoder decoder = Base64.getUrlDecoder();

        // Decode encoded URL
        // decodeToString() takes encoded url as byte and decode it
        String decodedUrl = new String(decoder.decode(encodedUrl));
        System.out.println(encodedUrl + " decoded to " + decodedUrl);

    }

}
# Java 8: Base64 Encode Decode
Java 8 introduced Base64 class to deal with **Encryption** and **Decryption** in **java.util** package. 

![Base 64](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Base64%20Java%208.jpg)  

The Base64 class provides 3 different encoders and decoders to encrypt/decrypt information.

**Basic Encoding & Decoding :**  
It uses the Base64 alphabet specified by Java in RFC 4648 and RFC 2045 for encoding and decoding operations. The encoder does not add any line separator character. The decoder rejects data that contains characters outside the base64 alphabet.  

**URL Encoding & Decoding :**  
It uses the Base64 alphabet specified by Java in RFC 4648 for encoding and decoding operations. The encoder does not add any line separator character. The decoder rejects data that contains characters outside the base64 alphabet.  

**Mime Encoding & Decoding :**  
It uses the Base64 alphabet as specified in RFC 2045 for encoding and decoding operations. The encoded output must be represented in lines of no more than 76 characters each and uses a carriage return '\r' followed immediately by a linefeed '\n' as the line separator. No line separator is added to the end of the encoded output. All line separators or other characters not found in the base64 alphabet table are ignored in decoding operation.  

## About Project
The project describes uses of Base64 in different scenarios.  

## How to Run 
Compile and run using provided main classes.

## Base64 Nested Classes
| **Class** | **Description** |
| ------------- | --------------- |
| Base64.Decoder | This class implements a decoder for decoding byte data using the Base64 encoding scheme as specified in RFC 4648 and RFC 2045. |
| Base64.Encoder | This class implements an encoder for encoding byte data using the Base64 encoding scheme as specified in RFC 4648 and RFC 2045. |

## Base64 Class Methods
| **Method** | **Description** |
| ------------- | --------------- |
| public static Base64.Decoder getDecoder() | It returns a Base64.Decoder that decodes using the Basic type base64 encoding scheme. |
| public static Base64.Encoder getEncoder() | It returns a Base64.Encoder that encodes using the Basic type base64 encoding scheme. |
| public static Base64.Decoder getUrlDecoder() | It returns a Base64.Decoder that decodes using the URL and Filename safe type base64 encoding scheme. |
| public static Base64.Decoder getMimeDecoder() | It returns a Base64.Decoder that decodes using the MIME type base64 decoding scheme. |
| public static Base64.Encoder getMimeEncoder() | It Returns a Base64.Encoder that encodes using the MIME type base64 encoding scheme. |
| public static Base64.Encoder getMimeEncoder(int lineLength, byte[] lineSeparator) | It returns a Base64.Encoder that encodes using the MIME type base64 encoding scheme with specified line length and line separators. |
| public static Base64.Encoder getUrlEncoder() | It returns a Base64.Encoder that encodes using the URL and Filename safe type base64 encoding scheme. |  

## Base64.Decoder Class Methods
| **Method** | **Description** |
| ------------- | --------------- |
| public byte[] decode(byte[] src) | It decodes all bytes from the input byte array using the Base64 encoding scheme, writing the results into a newly-allocated output byte array. The returned byte array is of the length of the resulting bytes. |
| public byte[] decode(String src) | It decodes a Base64 encoded String into a newly-allocated byte array using the Base64 encoding scheme. |
| public int decode(byte[] src, byte[] dst) | It decodes all bytes from the input byte array using the Base64 encoding scheme, writing the results into the given output byte array, starting at offset 0. |
| public ByteBuffer decode(ByteBuffer buffer) | It decodes all bytes from the input byte buffer using the Base64 encoding scheme, writing the results into a newly-allocated ByteBuffer. |
| public InputStream wrap(InputStream is) | It returns an input stream for decoding Base64 encoded byte stream. |  

## Base64.Encoder Class Methods
| **Method** | **Description** |
| ------------- | --------------- |
| public byte[] encode(byte[] src) | It encodes all bytes from the specified byte array into a newly-allocated byte array using the Base64 encoding scheme. The returned byte array is of the length of the resulting bytes. |
| public int encode(byte[] src, byte[] dst) | It encodes all bytes from the specified byte array using the Base64 encoding scheme, writing the resulting bytes to the given output byte array, starting at offset 0. |
| public String encodeToString(byte[] src) | It encodes the specified byte array into a String using the Base64 encoding scheme. |
| public ByteBuffer encode(ByteBuffer buffer) | It encodes all remaining bytes from the specified byte buffer into a newly-allocated ByteBuffer using the Base64 encoding scheme. Upon return, the source buffer's position will be updated to its limit; its limit will not have been changed. The returned output buffer's position will be zero and its limit will be the number of resulting encoded bytes. |
| public OutputStream wrap(OutputStream os) | It wraps an output stream for encoding byte data using the Base64 encoding scheme. |
| public Base64.Encoder withoutPadding() | It returns an encoder instance that encodes equivalently to this one, but without adding any padding character at the end of the encoded byte data. |
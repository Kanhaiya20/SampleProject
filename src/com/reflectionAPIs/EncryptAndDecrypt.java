package com.reflectionAPIs;

import java.util.Base64;

public class EncryptAndDecrypt {
    public static void main(String[] args) {
        String name = "Kanhaiya Agarwal";
        String encryptName = EncryptName(name);
        System.out.println(encryptName);

        String ename = "S2FuaGFpeWEgQWdhcndhbA==";
        String decryptName = DecryptName(ename);
        System.out.println(decryptName);
    }

    public static String DecryptName(String e){
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decode = decoder.decode(e.getBytes());
        return new String(decode);
    }

    public static String EncryptName(String n){
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encode = encoder.encode(n.getBytes());
        return new String(encode);
    }

}

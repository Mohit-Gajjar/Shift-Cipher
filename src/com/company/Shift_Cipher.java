package com.company;

public class Shift_Cipher {
    String encryptedText = "", decryptedText = "";
    int keyCheck;
    public String encrypt(String plainText, int key){
        if (key<=26){
            keyCheck = key;
            int length = plainText.length();
            for (int i = 0; i < length; i++){
                char temp = plainText.charAt(i);
                char temp1  = (char) (temp + key);
                encryptedText += temp1;
            }
        }else{
            System.out.println("Enter the key bellow 26");
        }
        return encryptedText;
    }
    public String decrypt(String cipherText, int key){
        if (key<=26 && key == this.keyCheck){
            int length = cipherText.length();
            for (int i = 0; i < length; i++){
                char temp = cipherText.charAt(i);
                char temp1  = (char) (temp - key);
                decryptedText += temp1;
            }
            return decryptedText;
        }else{
            System.out.println("Invaid key or enter the key bellow 26");
        }
        return key == keyCheck? decryptedText:"Null" ;
    }
}

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shift_Cipher test = new Shift_Cipher();
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========================================================");
        System.out.println("TEXT ENCRYPTION");
        System.out.println("==========================================================");
        System.out.print("Enter the Plain Text: ");
        String plainText = scanner.next();
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();
        System.out.println("Encrypted Text: " + test.encrypt(plainText, key));
        System.out.println("==========================================================");
        System.out.println("TEXT DECRYPTION");
        System.out.println("==========================================================");
        System.out.print("Enter the Cipher Text: ");
        String decryptedText = scanner.next();
        System.out.print("Enter the key: ");
        int key1 = scanner.nextInt();
        System.out.println("Decrypted Text: " + test.decrypt(decryptedText, key1));
        System.out.println("==========================================================");
    }
}

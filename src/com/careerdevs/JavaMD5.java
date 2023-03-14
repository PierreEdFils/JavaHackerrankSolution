package com.careerdevs;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();

        try{
            System.out.println(convertToMD5(val));
        } catch (NoSuchAlgorithmException e){
            System.out.println(e);
        } finally{
            sc.close();
        }
    }

    public static String convertToMD5(String value) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5");

        byte[] mdBytes = md.digest(value.getBytes());
        // Convert bytes array to hex
        BigInteger mdBigInt = new BigInteger(1, mdBytes);
        String hashtext = mdBigInt.toString(16);

        while (hashtext.length() < md.getDigestLength()) {
            hashtext = "0" + hashtext; // Left-pad with 0
        }
        return hashtext;

    }
}

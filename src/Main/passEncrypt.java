/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.*;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 *
 * @author anoth
 */
public class passEncrypt {
    //paket variabel enkrip   
    private static final Random random = new SecureRandom();  
    private static final String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";  
    private static final int iterations = 10000;  
    private static final int keylength = 128;  
     /* Method to generate the salt value. */  
    public static String getSaltvalue(int length){  
        StringBuilder finalval = new StringBuilder(length);  
        for (int i = 0; i < length; i++){  
            finalval.append(characters.charAt(random.nextInt(characters.length())));  
        }  
        return new String(finalval);  
    } 
     /* Method to generate the hash value */  
    public static byte[] hash(char[] password, byte[] salt){  
        PBEKeySpec spec = new PBEKeySpec(password, salt, iterations, keylength);  
        Arrays.fill(password, Character.MIN_VALUE);  
        try {  
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");  
            return skf.generateSecret(spec).getEncoded();  
        }   
        catch (NoSuchAlgorithmException | InvalidKeySpecException e) {  
            throw new AssertionError("Error while hashing a password: " + e.getMessage(), e);  
        }   
        finally {  
            spec.clearPassword();  
        }  
    }  
     /* Method to encrypt the password using the original password and salt value. */  
    public static String generateSecurePassword(String password, String salt){  
        String finalval = null;  
        byte[] securePassword = hash(password.toCharArray(), salt.getBytes());  
        finalval = Base64.getEncoder().encodeToString(securePassword);  
        return finalval;  
    }  
}
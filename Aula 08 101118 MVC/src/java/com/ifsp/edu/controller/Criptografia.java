/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.edu.controller;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Elienai
 */
public class Criptografia {
    
    private static MessageDigest md;
    
    private static byte[] gerarHash(String texto,String algoritimo){
	
	try{
		 md =MessageDigest.getInstance(algoritimo);
		md.update(texto.getBytes());
		return md.digest();
	
	}catch (NoSuchAlgorithmException e){
		return null;
	}
        
    }
    
    
  private static char[] hexCodes(byte[] text) {
        char[] hexOutput = new char[text.length * 2];
        String hexString;
  
        for (int i = 0; i < text.length; i++) {
            hexString = "00" + Integer.toHexString(text[i]);
            hexString.getChars(hexString.length() - 2,
                                    hexString.length(), hexOutput, i * 2);
        }
        return hexOutput;
    }    
    
    public static String criptografar(String senha) {
        gerarHash(senha, "MD5");
        if (md != null) {
            return new String(hexCodes(md.digest(senha.getBytes())));
        }
        return null;
    }
	
    
}

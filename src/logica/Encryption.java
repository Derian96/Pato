/*
    Universidad Nacional de Costa Rica
    Sede Regional Chorotega, Campus Nicoya  
    Ingeniería en Sistemas de Información
    Programación II - EIF204
    Académica: Gloriana Peña Ramírez 

    PROYECTO PROGRAMADO - Facturación JAVA
                                                                                                                       
    Software: Econimic Sails                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    Grupo: Javafari Team

    Desarrolladores: 
    - Eddie Alfaro 
    - Derian Abarca
    - Diego Aguilar
 */

package logica;

import java.math.*;
import java.security.*;

/*  
    En la clase Encription encontraremos 
    los metodos que permitiran cifrar las
    contraseñas de los usuarios.
*/

public class Encryption {
    
    /*
        La funcion MD5 nos permite encriptar una contraseña
        con el algorítmo de cifrado MD5.
    */
    public static String MD5(String pass) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(pass.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hastext = number.toString(16);
            while ( hastext.length() < 32){
                hastext = "0" + hastext;
            }
            return hastext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }       
    }
    
    
    /*
        La funcion SHA1() nos permite encriptar una contraseña
        con el algorítmo de cifrado SHA1.
    */
    public static String SHA1(String pass){
        try {
            MessageDigest mDigest = MessageDigest.getInstance("SHA1");
            byte[] result = mDigest.digest(pass.getBytes());

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < result.length; i++){
                sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }  
    }
    
    /*
        La funcion encriptPassword nos permite encriptar una contraseña
        con el algorítmo de cifrado MD5 y SHA1.
    */
    public static String encriptPassword(String pass){
        String md5Password = MD5(pass);
        return SHA1(md5Password);
    }
}


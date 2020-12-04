package org.reshotel;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;


public class AESSymetricCrypto {
	
	static ResourceBundle myBundle = ResourceBundle.getBundle("MessagesBundle", Internacionalization.getCurrentLocale());
	   
	   public void encriptDesc() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		   
	// Generamos una clave de 128 bits adecuada para AES
      KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
      keyGenerator.init(128);
      Key key = keyGenerator.generateKey();
      
      // Alternativamente, una clave que queramos que tenga al menos 16 bytes
      // y nos quedamos con los bytes 0 a 15
      key = new SecretKeySpec("una clave de 16 bytes".getBytes(),  0, 16, "AES");
      
      
      // Texto a encriptar
      String text = (Menus.menuBoss2());

      // Se obtiene un cifrador AES
     Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");

      // Se inicializa para encriptacion y se encripta el texto, que debemos pasar como bytes.
      aes.init(Cipher.ENCRYPT_MODE, key);
      byte[] encriptado = aes.doFinal(text.getBytes());
      
      System.out.println("  ");
      System.out.println(myBundle.getString("criptboss"));
      System.out.println("  ");
      System.out.println("----------------------------------------------------");

      // Se escribe byte a byte en hexadecimal el texto encriptado 
      for (byte b : encriptado) {
         System.out.print(String.format("%02X", b));
      }
      System.out.println("");
      System.out.println("----------------------------------------------------");

      // Se iniciliza el cifrador para desencriptar, con la misma clave y se desencripta
      aes.init(Cipher.DECRYPT_MODE, key);
      byte[] desencriptado = aes.doFinal(encriptado);

      // Texto obtenido 
      System.out.println(new String(desencriptado));
	   }

      
   }

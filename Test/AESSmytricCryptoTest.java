package org.test;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.junit.jupiter.api.Test;
import org.reshotel.Menus;

class AESSmytricCryptoTest {

	@Test
	void testencriptDesc() throws NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
		
		//Resultado esperado
		String texto1 = "hola que tal";
		
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
	      keyGenerator.init(128);
	      Key key = keyGenerator.generateKey();

	      key = new SecretKeySpec("una clave de 16 bytes".getBytes(),  0, 16, "AES");
	      
	      String text = "Hola que tal";

	     Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");

	      try {
	    	  
			aes.init(Cipher.ENCRYPT_MODE, key);
		} catch (InvalidKeyException e) {
			
			e.printStackTrace();
		}
	      byte[] encriptado = aes.doFinal(text.getBytes());

	      for (byte b : encriptado) {
	    	  System.out.print(String.format("%02X", b));
	      }
	      System.out.println("");
	      System.out.println("----------------------------------------------------");

	      try {
	    	  aes.init(Cipher.DECRYPT_MODE, key);
	      } catch (InvalidKeyException e) {
	    	  e.printStackTrace();
	      }
	      byte[] desencriptado = aes.doFinal(encriptado);

	      System.out.println(new String(desencriptado));

	      //assertEquals(desencriptado, texto1);
	}

}

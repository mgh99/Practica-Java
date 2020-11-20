package org.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

class InternacionalizationTest {
	
	static ResourceBundle my_bundle = ResourceBundle.getBundle("MessagesBundle_fr_FR");

	@Test
	void test() {
		
		assertEquals("Enregistrer l'utilisateur", my_bundle.getString("id2"));
	}

}

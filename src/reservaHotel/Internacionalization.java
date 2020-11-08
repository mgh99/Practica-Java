package reservaHotel;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Internacionalization {
	
	//por defecto está en español
	private static Locale languages = new Locale("es", "ES");
	private static ResourceBundle introLabels;

	public static Locale getCurrentLocale() {
		return languages;
	}

	public static ResourceBundle getIntroLabels() {
		return introLabels;
	}

	
	//Para cambiar el idioma
	public static Locale selectLanguage(){
		

		System.out.println("1.- Español");
		System.out.println("2.- English");
		System.out.println("3.- Detusche");
		System.out.println("4.- Français");

		int select;		
		select = Read.factInt();

		if(select == 1) {
			
			languages = new Locale("MessagesBundle_es_ES");
			setIntroLabels(ResourceBundle.getBundle("MessagesBundle_es_ES", languages));
			System.out.println("Current Locale: " + Internacionalization.getCurrentLocale());
			
		} else if(select == 2) {
			
			languages = new Locale("en", "US");
			setIntroLabels(ResourceBundle.getBundle("MessagesBundle_en_US", languages));
			System.out.println("Current Locale: " + Internacionalization.getCurrentLocale());
			
		} else if (select == 3) {
			
			languages = new Locale("de", "DE");
			setIntroLabels(ResourceBundle.getBundle("MessagesBundle_de_DE", languages));
			System.out.println("Current Locale: " + Internacionalization.getCurrentLocale());
			Menus.menu1();
			
		}else if (select == 4) {
			
			languages = new Locale("fr", "FR");
			setIntroLabels(ResourceBundle.getBundle("MessagesBundle_fr_FR", languages));
			System.out.println("Current Locale: " + Internacionalization.getCurrentLocale());
			
		}else {
			System.out.println("Invalid Number");
		}
		
		return languages;

	}
	
	public static void setIntroLabels(ResourceBundle introLabels) {
		Internacionalization.introLabels = introLabels;
	}
}



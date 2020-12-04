package org.reshotel;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class ReadLineComands {
	
	public String readLine() {
		
		String email;
		
		LineNumberReader line = new LineNumberReader(new InputStreamReader(System.in));
		
		try{
			email = line.readLine();
		}
		catch(IOException e) {
			
			e.printStackTrace();
			email = "";
		}
		
		return email;
	}
	
	
}

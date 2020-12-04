package org.reshotel;

import java.io.*;
import java.util.*;
 
public class MyFileReader
{
    public static void main (String[] args) throws java.io.IOException
    {
 
        String s1;
        String s2;
 
        // Cargamos el buffer con el contenido del archivo
        try(BufferedReader br = new BufferedReader (new FileReader ("MyFileReader.txt"))) {
        	// Leemos la primera linea
        s1 = br.readLine();
 
        System.out.println ("La primera linea del archivo es: " + s1);
        System.out.println ("La linea tiene " + s1.length() + " caracteres");
 
        System.out.println ();
        System.out.println ("Separando la linea en trozos tenemos las siguientes palabras:");
 
        int numTokens = 0;
        StringTokenizer st = new StringTokenizer (s1);
 
        // bucle por todas las palabras
        while (st.hasMoreTokens())
        {
            s2 = st.nextToken();
            numTokens++;
            System.out.println ("    Palabra " + numTokens + " es: " + s2);
        }
        }
        
        
    }
}

package org.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HiloWorkTest {
	
	 @Test
	    public void iteraTest() {
	        for (int i = 0; i<10; i++) {
	            test();
	        }
	    }
	    
	    private void test() {
	        System.out.println("Probando el test");
	    }

}

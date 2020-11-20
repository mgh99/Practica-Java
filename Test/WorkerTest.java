package org.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WorkerTest {

	@Test
	final void testGetDni() {
		
		Worker workers = new Employee("71962630T", "María", "Herrera", "Soho Boutique Opera", "Recepcionista");
		
		assertEquals("71962630T", workers.getDni());
	}
	
	@Test
	final void testGetName() {
		
		Worker workers = new Employee("71962630T", "María", "Herrera", "Soho Boutique Opera", "Recepcionista");
		
		assertEquals("María", workers.getName());
	}
	
	@Test
	final void testSurname() {
		
		Worker workers = new Employee("71962630T", "María", "Herrera", "Soho Boutique Opera", "Recepcionista");
		
		assertEquals("Herrera", workers.getSurname());
	}
	
	@Test
	final void testGeNameHotel() {
		
		Worker workers = new Employee("71962630T", "María", "Herrera", "Soho Boutique Opera", "Recepcionista");
		
		assertEquals("Soho Boutique Opera", workers.getNameHotel());
	}
	
	@Test
	final void testGetJob() {
		
		Worker workers = new Employee("71962630T", "María", "Herrera", "Soho Boutique Opera", "Recepcionista");
		
		assertEquals("Recepcionista", workers.getJob());
	}

}

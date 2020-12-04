package org.reshotel;

public class ThreadsRead extends Thread {
	
	Client user;
	public ThreadsRead(Client user) {
		this.user = user;
	}
	
	@Override
	@SuppressWarnings("unused")
	public void run() {
		try {
			sleep(1000);
		}
		catch (InterruptedException e) {
			System.out.println("El cliente ya se ha registrado");
		}
		String valor = user.getEmail();
		System.out.println("El cliente se ha registrado correctamente");
	}
	

}

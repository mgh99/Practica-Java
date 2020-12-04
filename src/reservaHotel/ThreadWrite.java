package org.reshotel;

public class ThreadWrite extends ReadLineComands implements Runnable{
	
	Client user;
	ThreadsRead hilo;
	
	public void ThreadsWrite (Client user, ThreadsRead hilo) {
		this.user = user;
		this.hilo = hilo;
		
	}
	@Override
	public void run() {
		System.out.println("The user is being registered ");
		user.setEmail(this.hilo);
		hilo.interrupt();
	}

}

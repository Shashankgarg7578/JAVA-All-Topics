package Mutlithreading;

public class Wait_And_Notify_Examp_04 
{
	static public int balance=0;
	
  public void withdraw(int amount)
  {
		//synchronized is used with wait and notify methods to avoid the exception.
	synchronized(this)
	{
		if(balance<=0)
		{
			try 
			{
				System.out.println("wait for withdraw");
			   /* 1. Wait method is used for wait current thread and execute other thread
				and if we want to excute this thread after completing that thread so we call
				notify() or notifyaAll() method .
			
			    2. always use Synchrize blok with wait and notify method other wise it throw a exception.
			   */
				wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			balance = balance - amount;
			System.out.println("Withdraw is successful and now balance is: "+balance);
		 }
		else 
		{
			System.out.println("Orignal balance is: "+balance);
			balance = balance - amount;
			System.out.println("Withdraw is successful and now balance is: "+balance);
		}
	
	}
	
  }
	public void deposite(int amount)
	{
		System.out.println("deposite amount is: "+amount);
		balance = balance + amount;
	    System.out.println("Balance Amount is "+balance);
		/* 1. notify and notifyAll methods are used for free the waiting thread .
		   2. With both mehtod we should use the synchronized block to avoid the exception
		*/
		synchronized (this) {
			notify();	
		}
		
	}
	
   public static void main(String[] args) 
   {
	   Wait_And_Notify_Examp_04 app = new Wait_And_Notify_Examp_04();
	   
	   
	 Thread thread1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
		
			app.withdraw(1000);
		}
	});
	 thread1.setName("Thread-1");
	 thread1.start();
	 
	 
	 Thread thread2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		    app.deposite(1500);
			
		}
	});
	 thread2.setName("Thread-2");
	 thread2.start();

   }	

  
}

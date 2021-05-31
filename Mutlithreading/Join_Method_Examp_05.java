package Mutlithreading;

public class Join_Method_Examp_05 
{
	public int counter=0;
	
   public static void main(String[] args) 
   {
	   Join_Method_Examp_05 app = new Join_Method_Examp_05();
	   
	   //thread 1 initiated 
	   Thread thread1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
		
			for(int i=0 ; i<1000 ; i++)
			{
				app.counter++;
			}
		}
	});
  
	 //thread 2 initiated 
	   Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
	    /* 1.We use "Join method" for execute 2nd thread after 1st thread
	       2.and we use Join in sequence only 
	       3.now we want to stop main method and wants to execute main method after
	        the second thread executed so we join
	    */			
				
				try {
					thread1.join(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				for(int i=0 ; i<1000 ; i++)
				{
					app.counter++;
				}
			}
		});
	   
	   thread1.start();
	   thread2.start();
	
	   /*we stop the main method for some time because it give wrong result,
	    and we want execute 1 thread at time so we use "join method" as well
	    
	    1.  join method is used for when we want particular thread executed after the current running 
	    thread
	    2.with join method must use try catch block for avoid the exception. 
	    */
	   try {
		/*if we use this sleep method so main method stop execution for specific time and time consumption is more.
		Thread.sleep(2000);
		*/
		
		   //we use Join method to save our time
		thread2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   System.out.println("The value of counter: " + app.counter);
	
	   
   }
}

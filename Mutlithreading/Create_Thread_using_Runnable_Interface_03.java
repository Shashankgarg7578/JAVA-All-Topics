package Mutlithreading;

import java.util.Random;

class myCounter implements Runnable{
	private int threadNo;
	 
	public myCounter(int threadNo) {
		this.threadNo = threadNo;
	}
 
	@Override
	public void run() 
	{
		Random random = new Random();
		for(int i = 0;i<=9;i++)
		{
			try
			{
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("The value if i is: "+i+" and the thread number is: "+threadNo);
		}
	}
	
}


public class Create_Thread_using_Runnable_Interface_03
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new myCounter(1));
		Thread thread2 = new Thread(new myCounter(2));
		
		thread1.start();
		thread2.start();
	}

}

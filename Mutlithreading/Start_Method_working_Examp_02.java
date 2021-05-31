package Mutlithreading;

class MyCounters extends Thread
{
	private int threadNo;
 
	public MyCounters(int threadNo) {
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		countMe();
	}
	
	public void countMe(){
		for(int i=1; i<=9;i++){
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value if i is: "+i+" and the thread number is: "+threadNo);
		}
	}
	
}

public class Start_Method_working_Examp_02 
{
	public static void main(String[] args) throws InterruptedException {
		MyCounters counter1 = new MyCounters(1);
		MyCounters counter2 = new MyCounters(2);
		
		
		/*If we call 2 or more Start method then JVM will understand 2 or more threads are run  ,
		 and we also know that threads run simultaneously , thats why this program prints both together
		 */
	    long startTime = System.currentTimeMillis();
		counter1.start(); //Run should be called by JVM
		System.out.println("**************************");
		counter2.start(); //Run should be called by JVM
		Thread.sleep(4505);
		long endTime = System.currentTimeMillis();
		System.out.println("Total time required to process: "+(endTime-startTime));
	}
}

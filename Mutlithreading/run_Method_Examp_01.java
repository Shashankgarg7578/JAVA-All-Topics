package Mutlithreading;

	class MyyCounter extends Thread{
		private int threadNo;

		public MyyCounter(int threadNo) 
		{
			this.threadNo = threadNo;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
	     	countMe();
		}

		
		
		public void countMe() {
			for(int i=1 ; i<=9 ; i++)
			{
				try {
					sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				System.out.println("The value if i is: "+i+" and the thread number is: "+threadNo);
			}
		}
		
	}


	public class run_Method_Examp_01 
	{
	   public static void main(String[] args) 
	   {
		    MyyCounter counter1 = new MyyCounter(1);
			MyyCounter counter2 = new MyyCounter(2);
			
			//Run method run like simple method so first method will executes 
			//and  print 1stmethod and then print 2nd method.
		    long startTime = System.currentTimeMillis();
		    System.out.println("StartTime: "+startTime);
			counter1.run(); //Run should be called by JVM
			
			System.out.println("**************************");
			
			counter2.run(); //Run should be called by JVM
			long endTime = System.currentTimeMillis();
			System.out.println("Total time required to process: "+(endTime-startTime));
			System.out.println("Endtime: "+endTime);
			
	   }
	}

// Execution of two or more threads occurs in a random order. The keyword ‘synchronized’
// in Java is used to control the execution of thread in a strict sequence. In the following, the
// program is expected to print some numbers. Do the necessary use of ‘synchronized’
// keyword, so that, the program prints the output in the following order:
// -----------------OUTPUT-------------------
// 5 10 15 20 25 30 35 40 45 50

class Execution
{

synchronized void print(int n)
{
   for(int i=1;i<=10;i++)
   {  
     System.out.println(n*i);  
     try
     {  
      Thread.sleep(400);  
     }
     catch(Exception e)
     {
        System.out.println(e);
     }  
   }
 }
 }// Ending Execute class
 
 class Thread1 extends Thread{  
	Execution t;  
	Thread1(Execution t){  
		this.t=t;  
	}  
	public void run(){  
		t.print(5);  
	} 
}  


  
class main{  
	public static void main(String args[]){  
		Execution obj = new Execution();//only one object  
		Thread1 t1=new Thread1(obj);  
  
		t1.start();  
		 
	}  
}
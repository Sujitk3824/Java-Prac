// a. Create a class Solution. It will be given two integers x and y as input, you have to
// compute x/y. If x and y are not 32 bit signed integers or if y is zero, an exception
// will occur and you have to report it.

// b. Create a method named validate() that accepts an integer as a parameter. If the
// age is less than 18, we are throwing the ArithmeticException otherwise print a
// message welcome to vote.

class Solution
{

 public static void divide(int x,int y) 
 			{ 
				try{

      				if(y==0)
      				  {

							throw new Exception(" Exception! Y is carry 0 Value. ");

         				}

        			int result= x/y;

              		System.out.println(" Division of "+ x + " And " + y +" is: "+result);
      				 }

      		 
				catch( Exception e)
					{

						System.out.println("Exception Occur: "+ e.getMessage());

					}
		}



	public static void Validate(int age)

{

	try{


		if(age < 18)
		{
			throw new ArithmeticException("You are note elligible");

		}

	

		System.out.println("welcome to vote.");

	}
	catch(ArithmeticException e)
	{
		System.out.println("Exception!  " + e.getMessage());
	}



}

public static void main(String [] argv)

   {
	Solution S1 = new Solution();

	S1.divide(25,5);
	System.out.println("   ");
	S1.Validate(20);


   }



}
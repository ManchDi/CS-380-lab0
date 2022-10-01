package packageTest;

public class lab1 {

	public static void main(String[] args)   
	{  
	int number = 12345;
	int rnum = 0;  
	 
	while(number != 0)   
	{  
	int remainder = number % 10;  
	rnum = rnum * 10 + remainder;  
	number = number/10;  
	}  
	System.out.println("The reverse of the given number is: " + rnum);  
//testing comment
	}
}

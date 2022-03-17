/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

class myException extends Exception{
    myException(){
       
    }
}

public class ArithmeticOperations
{
    static int calculation(char operator,int a,int b)throws myException{
        switch(operator){
            case '+': {return a+b; }
            case '-': {return a-b;}
            case '/': {return a/b;}
            case '*': {return a*b;}
            default:{ throw new myException();}
        }
        
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    while(true){
	        try{
            int operand1= sc.nextInt();
        	char operator = sc.next().charAt(0);
        	if(Character.getNumericValue(operator) != -1) throw new myException();
		    int operand2= sc.nextInt(); 
		    int result= calculation(operator,operand1,operand2);
		  System.out.println("Output: "+ result);
          sc.close();
		  break;
		  
	}
	catch(InputMismatchException e){
	    System.out.println("Please enter valid Operands");
	            sc.next();
	}
	catch(myException e){
        System.out.println("Please enter valid Operator");
	            sc.next();
	}
	catch (ArithmeticException e) {
			System.out.println("Division by zero is not possible");
			continue;
		}
	}
	    }
	   
}



import java.util.Scanner;
import java.util.Stack;

public class CheckBalancedParanthesis {
    public static void CheckValidBrackets(String input){
        Stack<Character> st= new Stack<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='(' || input.charAt(i)=='[' || input.charAt(i)=='{') st.push(input.charAt(i));
            else{
                if(st.isEmpty()) return ;
                switch(input.charAt(i)){
                    case '}':{
                           if(st.peek()=='{') {st.pop();continue;}
                           else break ;
                    }
                    case ')':{
                        if(st.peek()=='(') {st.pop();continue;}
                        else break ;
                 }
                 case ']':{
                    if(st.peek()=='[') {st.pop();continue;}
                    else break;
             }
                }
            }
        }
        if(st.isEmpty()){
            System.out.println("Balanced"); 
        }
        else{
            while(!st.isEmpty()){
                switch(st.pop()){
                        case '(': {input+=')';break;}
                        case '{': {input+='}';break;}
                        case '[': {input+=']';break;}
                }
            }
            System.out.println(input);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
       CheckValidBrackets(input);
   
    }
}

import java.util.Scanner;
import java.util.Stack;

public class CheckBalancedParanthesis {
    public static String addBrackets(String prefix,char middle,String suffix) {
        String output="";
        switch(middle){
            case '}': {output=prefix+"{";break;}
            case ')': {output=prefix+"(";break;}
            case ']': {output=prefix+"[";break;}
        }
        return output+suffix;
        
    }
    public static void CheckValidBrackets(String input){
        Stack<Character> st= new Stack<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='(' || input.charAt(i)=='[' || input.charAt(i)=='{') st.push(input.charAt(i));
            else{
                if(st.isEmpty())  {input=addBrackets(input.substring(0, i),input.charAt(i),input.substring(i));i++;}
               else{
                    switch(input.charAt(i)){
                    case '}':{
                           if(st.peek()=='{') {st.pop();continue;}
                           else {
                               input=addBrackets(input.substring(0, i),input.charAt(i),input.substring(i));
                               i++;
                               break;
                            }
                    }
                    case ')':{
                        if(st.peek()=='(') {st.pop();continue;}
                        else {
                            input=addBrackets(input.substring(0, i),input.charAt(i),input.substring(i));
                            // flag=0;
                            i++;
                            break;
                         }
                 }
                 case ']':{
                    if(st.peek()=='[') {st.pop();continue;}
                    else {
                        input=addBrackets(input.substring(0, i),input.charAt(i),input.substring(i));
                        i++;
                        break;
                     }
             }
                }
            }
        }}
        if(st.isEmpty()){
            System.out.println(input); 
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

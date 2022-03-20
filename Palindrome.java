
import java.util.Scanner;


public class Palindrome {
    static boolean CheckPalindrome(String str){
        if(str.length()==1){ 
            return true;
        }
        if (str.length()==0) return false;
        int start=0;
        int end=str.length()-1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    static void ConvertToPalindrome(int OddorEven){
           
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputString=sc.nextLine();
        if(inputString.length()==0){ 
            System.out.println("Invalid Input");
            return;
        }
        if(CheckPalindrome(inputString)) System.out.println("It is a Palindrome"); 
        else{
            int curr=inputString.length()-2;
            for(int i=0;i<inputString.length();i++){
                if(CheckPalindrome(inputString.substring(i))) {curr=i-1;break;}
            }
            int i=curr;
            while(i>=0){
                inputString+=inputString.charAt(i);
                i--;
            }
            System.out.println(inputString);
            System.out.println(curr+1);
        }
        
    }
}

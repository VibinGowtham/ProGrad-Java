import java.util.Scanner;
public class PerfectString {
    static boolean checkPerfect(char[] charArray){
        char current = charArray[0];
        char next;
        if(current=='P') next='R';
        else if(current=='R') next='P';
        else return false; //
        /**
         * P R P R P
         * curr=P   next=R 
         * i=1
         * check 'R'=next 
         * if yes change curr=R and next=P
         * i=2
         * check 'P'=next
         * if yes change curr=P and next=R
         */
        for(int i=1;i<charArray.length;i++)  
        {
                if(charArray[i]==next) {      
                    next=current;
                    current=charArray[i];
                }
                else return false;
        }
         return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        char[] charArray=input.toUpperCase().toCharArray();
        if(checkPerfect(charArray)) System.out.println("Perfect");
        else System.out.println("False");
    }
}

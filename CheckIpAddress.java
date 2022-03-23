import java.util.Scanner;

public class CheckIpAddress {
public static int count(String ipAddress) {
    int count=0,index=0;
    index=ipAddress.indexOf('.');
    while(ipAddress.indexOf('.')!=-1){ count++;ipAddress=ipAddress.substring(index+1);}
    return count;
}
public static boolean ValidateIpAddress(String ipAddress){
    System.out.println(count(ipAddress));
    if(count(ipAddress)!=3) return false;
    String[] Splittedindividuals=ipAddress.split("\\.");
    System.out.println(Splittedindividuals.length);
    try{
        int lastElement = Integer.parseInt(Splittedindividuals[Splittedindividuals.length-1]);
        if(lastElement==0 || lastElement==255) return false; 
       for(String str:Splittedindividuals)
       {
           System.out.println(str);
        if(Integer.parseInt(str)<=255 && Integer.parseInt(str)>=0 ) continue;
        else break;
      }
    }
    catch(NumberFormatException e){
        System.out.println("Enter only valid integer values");
        return false;
 }
 return true;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String IpAddress=sc.nextLine();
        // ValidateIpAddress(IpAddress);
            if(ValidateIpAddress(IpAddress)) System.out.println("Valid Ip");
            else System.out.println("Invalid");
      
     }
}

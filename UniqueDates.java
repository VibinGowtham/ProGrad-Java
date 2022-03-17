
import java.util.*;
public class UniqueDates
{
    static boolean CheckValidDate(int current,int position ){
        switch(position){
                case 0 : {
                    if(current>00 && current<=31) return true;
                    else break;
                }
                case 1 : {
                    if(current>00 && current<=12) return true;
                    else break;
                }
                case 2 : {
                    if(current>1000 && current<=9999) return true;
                    else break;
                }
          }
          return false;
    }
    static int IntegerConvertedStrings(String []Stringarray) throws NumberFormatException{
        String temp="";
        if(Stringarray.length!=3) return 0;
        if(Stringarray[1].length()!=2) return 0;
        for(int i=0;i<Stringarray.length;i++){
            int currentIntegerValue=Integer.parseInt(Stringarray[i]);
               if(CheckValidDate(currentIntegerValue,i)) temp+=Stringarray[i];
               else return 0;
        }
        return Integer.parseInt(temp);
    }
    static void splitStrings(String Paragraph){

        HashSet<Integer> DateSet=new HashSet<>();
        String[] SplittedStrings=Paragraph.split(" ");
            for(String str:SplittedStrings) {
             if(str.contains("-")){
                 String [] arr=str.split("-");
                 try{
                     int DateNumber=IntegerConvertedStrings(arr);
                     if(DateNumber!=0) DateSet.add(DateNumber);
                 } catch(NumberFormatException e)
                 {
                     continue;
                 }
             }
         }
      System.out.println(DateSet.size());
         Iterator<Integer>it=DateSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Paragraph:");
		String input=sc.nextLine();
	splitStrings(input);
		
	}
}




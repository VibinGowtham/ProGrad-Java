import java.util.*;

public class AlternateSwap {
    // static void swap(int curr,int next){
        
    // }
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	 ArrayList<Integer> arrlist= new ArrayList<Integer>(n);
	 
	 for(int i=0;i<n;i++) arrlist.add(sc.nextInt());
	 
	 for(int i=1;i<n;i+=2){
	     //Collections.swap(arrlist,i,i-1);
	     int currentValue=arrlist.get(i-1);
	     arrlist.set(i-1,arrlist.get(i));
	     arrlist.set(i,currentValue);
	 }
	 sc.close();
	 System.out.println(arrlist);
	}
}


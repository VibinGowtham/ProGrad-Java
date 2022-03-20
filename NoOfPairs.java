import java.util.Arrays;
import java.util.Scanner;
public class NoOfPairs {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int numberOfElements=sc.nextInt();
    int start=0,count=0,k;
    int last=numberOfElements-1;
    int[] arr=new int[numberOfElements];
    for(int i=0;i<numberOfElements;i++) arr[i]=sc.nextInt();
    k=sc.nextInt();
    Arrays.sort(arr);
    while(start<=last){
        int product=arr[start]*arr[last];
        if(product==k) {count++;start++;}
        else if(product>k) last--;
        else if(product<k) start++;
    }
    System.out.println(count);
    // for(int element:arr) System.out.print(element+" ");
}
    
}
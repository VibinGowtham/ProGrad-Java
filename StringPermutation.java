import java.util.*;
public class StringPermutation
{
    static int Factorial(int n){
        int output=1;
        for(int i=n;i>0;i--){
            output*=i;
        }
        return output;
    }
    static void permutation(String inputString){
        int numerator=Factorial(inputString.length());
        int denominator=1;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:inputString.toCharArray()){
            if(hm.get(ch)!=null)  hm.put(ch,hm.get(ch)+1);
            else hm.put(ch,1);
        }
        for(Map.Entry<Character,Integer> iterator:hm.entrySet()){
            int count=iterator.getValue();
              if(count>1){
                  denominator*=Factorial(count);
              }
        }
        System.out.println(numerator/denominator);
    }
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);    
	String str= sc.nextLine();
	permutation(str);
    sc.close();
	}
}



import java.util.*;

public class Anagram {
    static int totalAnagrams=0;
    static void IsAnagram(String base,String test){
        if(base.length()!=test.length()) return ;
             HashMap<Character,Integer> hm1=new HashMap<Character,Integer>();
             HashMap<Character,Integer> hm2=new HashMap<Character,Integer>();
        for(char ch:base.toCharArray()){
            if(hm1.get(ch)!=null)  hm1.put(ch,hm1.get(ch)+1);
            else hm1.put(ch,1);
        }
        for(char ch:test.toCharArray()){
            if(hm2.get(ch)!=null)  hm2.put(ch,hm2.get(ch)+1);
            else hm2.put(ch,1);
        }
          if(hm1.equals(hm2)) totalAnagrams++;   
    }
      public static void main(String[] args) {
      Scanner sc=new Scanner(System.in); 

        String baseString;
        System.out.println("Enter Base String");
        baseString=sc.next();
        System.out.println("Enter the number of Testing Strings");
        int numberOfTestStrings=sc.nextInt();
        String[] testingStringsArray=new String[numberOfTestStrings];
        for(int i=0;i<numberOfTestStrings;i++){
            testingStringsArray[i]=sc.next();
        }
        for(String testString:testingStringsArray){
            IsAnagram(baseString, testString);
        }
        System.out.println(totalAnagrams);
    //    if(IsAnagram(str1,str2)) System.out.println("Strings are Anagram");
    //    else System.out.println("Strings are not Anagram");
       sc.close();
    } 
}

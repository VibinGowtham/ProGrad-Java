import java.util.*;
import java.io.*;
class Student{
   private String Name;
   private String RegisterNumber;
   private String Dept;

    Student(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of the Student:");
        this.Name=sc.nextLine();
        System.out.println("Enter Register Number of the Student:");
        this.RegisterNumber=sc.nextLine();
        System.out.println("Enter Department of the Student:");
        this.Dept=sc.nextLine();
        //  sc.close();
    }
    String get(){
        return Name+" "+RegisterNumber+" "+Dept;
    }
    
}
public class StudentDetails
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Number of Students:");
	    int totalStudents=sc.nextInt();
	    Student[] objects=new Student[totalStudents];
        for(int i=0;i<totalStudents;i++){
             objects[i]=new Student();
        }
		 try{
	        File myfile=new File("Student_Details.txt");
	        if(myfile.exists())
	        {
	            System.out.println("Already Found");
	            myfile=new File("Test.txt");
	        }
	       if(myfile.createNewFile()) 
	       {
	        if(myfile.canWrite())
	        {
	            String name=myfile.getName();
	        FileWriter writeobj=new FileWriter(name);
            for(int i=0;i<totalStudents;i++){
                writeobj.write(objects[i].get()+"\n");   
            }
             writeobj.close();
	        } else {System.out.println("Write is not possible");}
	        
	        if(myfile.canRead())
	        {
	        Scanner fileScanner=new Scanner(myfile);
	        while(fileScanner.hasNextLine()) {System.out.println(sc.nextLine());}
	         fileScanner.close();
	        }
	    }
	    else System.out.println("Failed!!");
	    }
	    catch (FileNotFoundException e) {
      System.out.println("File Not Found");
        }
        catch (IOException e) {
      System.out.println("Cannot be created");
        }
        sc.close();
	 }

}



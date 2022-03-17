import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

// import javax.swing.text.html.HTMLDocument.RunElement;

import org.junit.*;
class Car{
    String Model_Name;
    int Year_Of_Production;
    Car(String Name,int Number){
           this.Model_Name=Name;
           this.Year_Of_Production=Number;
    }
    public static boolean verify(Car c1,Car c2){
        if(c1==null || c2==null) return false;
         else  return c1.Year_Of_Production==c2.Year_Of_Production;
    }
}
public class Junittest {
        @Test
        public void testyear(){
            // Car c1=new Car("Swift",2022);
            Car c2=new Car("City",2022);
            Car c3=new Car("Rapid",2018);
          assertTrue(Car.verify(c2,c3));
          //  assertFalse(Car.verify(c1,c3));  
        }
        @Test
        public void testyear1(){
            Car c1=new Car("Swift",2022);
             Car c2=new Car("City",2022);
            // Car c3=new Car("Rapid",2018);
           assertFalse(Car.verify(c1,c2));  
        }
    
}

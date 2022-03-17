class Holiday {
    private String name;
    private int day;
    private String month;
    Holiday(String name,int day,String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }
    static boolean inSameMonth(Holiday Obj1,Holiday Obj2) {
        return Obj1.month==Obj2.month;
    }
    static double avgDate(Holiday arr[]) {
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i].day;
        }
        return sum/arr.length;
    }
    }
    public class HolidayAverage
    {
        public static void main(String[] args) {
           Holiday h1=new Holiday("New Year",29,"Jan");
           Holiday h2=new Holiday("Diwali",19,"Feb");
           System.out.println(Holiday.inSameMonth(h1,h2));
           Holiday[] arry={h1,h2};
            System.out.println(Holiday.avgDate(arry));
    // 		System.out.println("Hello World");
        }
    }
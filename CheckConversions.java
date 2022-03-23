
public class CheckConversions {

public static double covertToCentimetres(String lengthInMetreOrKm)
{
String[] splittedlengthInMetreOrKmArray = lengthInMetreOrKm.split(" ");
double doubleConvertedLength=Double.parseDouble(splittedlengthInMetreOrKmArray[0]);
String unitOfInputLength = splittedlengthInMetreOrKmArray[1].toLowerCase();
switch(unitOfInputLength){
    case "m" : return doubleConvertedLength*100;
    case "km" : return doubleConvertedLength*1000*100;
    case "cm" : return doubleConvertedLength;
}
return -1;
}
public static boolean checkDistanceIsEqualOrNot(String lengthOne,String lengthTwo)
{
    double IntegerlengthOne=covertToCentimetres(lengthOne);
    double IntegerlengthTwo=covertToCentimetres(lengthTwo);
    return IntegerlengthOne==IntegerlengthTwo;
}
public static double convertCentimetreToUnitOfLengthOne(Double doubleValueOfLengthTwoInCms,String unitOfLengthOne) 
{
    switch(unitOfLengthOne)
    {
        case "m": return doubleValueOfLengthTwoInCms/100;
        case "km": return doubleValueOfLengthTwoInCms/100000;
        case "cm": return doubleValueOfLengthTwoInCms;
    }
    return -1;
}
public static String addTwoLengths(String lengthOne,String lengthTwo) {
    String[] stringArrayOfLengthOne=lengthOne.split(" ");

    double doubleValueOfLengthOne=Double.parseDouble(stringArrayOfLengthOne[0]);
    double doubleValueOfLengthTwoInCms=covertToCentimetres(lengthTwo);

    String unitOfLengthOne=stringArrayOfLengthOne[1];

    double doubleValueOfLengthTwo= convertCentimetreToUnitOfLengthOne(doubleValueOfLengthTwoInCms, unitOfLengthOne);
   
    return doubleValueOfLengthOne+doubleValueOfLengthTwo+" "+unitOfLengthOne;
}
public static String subractTwoLengths(String lengthOne,String lengthTwo) {
    String[] stringArrayOfLengthOne=lengthOne.split(" ");

    double doubleValueOfLengthOne=Double.parseDouble(stringArrayOfLengthOne[0]);
    double doubleValueOfLengthTwoInCms=covertToCentimetres(lengthTwo);

    String unitOfLengthOne=stringArrayOfLengthOne[1];

    double doubleValueOfLengthTwo= convertCentimetreToUnitOfLengthOne(doubleValueOfLengthTwoInCms, unitOfLengthOne);
   
    return doubleValueOfLengthOne- doubleValueOfLengthTwo+" "+unitOfLengthOne;
}
public static double covertToGrams(String weightInGramsOrKg) {
    String[] splittedWeightInGramsOrKgArray = weightInGramsOrKg.split(" ");
double doubleConvertedLength=Double.parseDouble(splittedWeightInGramsOrKgArray[0]);
String unitOfInputLength = splittedWeightInGramsOrKgArray[1].toLowerCase();
System.out.println(unitOfInputLength);
switch(unitOfInputLength){
    case "g" : return doubleConvertedLength;
    case "kg" : return doubleConvertedLength*1000;
}
return -1;
}
public static double covertToCelcius(String temperatureInKelvinOrFahrenheit) {
    String[] splittedTemperatureInKelvinOrFahrenheit = temperatureInKelvinOrFahrenheit.split(" ");
double doubleConvertedTemperature=Double.parseDouble(splittedTemperatureInKelvinOrFahrenheit[0]);
String unitOfInputTemperature = splittedTemperatureInKelvinOrFahrenheit[1].toLowerCase();

switch(unitOfInputTemperature){
    case "c" : return doubleConvertedTemperature;
    case "f" : return (doubleConvertedTemperature-32)*5/9;
    case "k" : return doubleConvertedTemperature-273.15;
}
return -1;
}
public static boolean checkWeightIsEqualOrNot(String weightOne,String weightTwo)
{
    double doubleWeightOne=covertToGrams(weightOne);
    double doubleWeightTwo=covertToGrams(weightTwo);
    return doubleWeightOne==doubleWeightTwo;
}
public static double convertGramsToUnitOfWeightOne(Double doubleValueOfWeightTwoInGrams,String unitOfWeightOne) 
{
    switch(unitOfWeightOne)
    {
        case "g": return doubleValueOfWeightTwoInGrams;
        case "kg": return doubleValueOfWeightTwoInGrams/1000;
    }
    return -1;
}
public static String addTwoWeights(String weightOne,String weightTwo) {
    String[] stringArrayOfWeightOne=weightOne.split(" ");

    double doubleValueOfWeightOne=Double.parseDouble(stringArrayOfWeightOne[0]);
    double doubleValueOfWeightTwoInGrams=covertToGrams(weightTwo);

    String unitOfWeightOne=stringArrayOfWeightOne[1];

    double doubleValueOfWeightTwo= convertGramsToUnitOfWeightOne(doubleValueOfWeightTwoInGrams, unitOfWeightOne);
   
    return doubleValueOfWeightOne+doubleValueOfWeightTwo+" "+unitOfWeightOne;
}
public static String subractTwoWeights(String weightOne,String weightTwo) {
    String[] stringArrayOfWeightOne=weightOne.split(" ");

    double doubleValueOfWeightOne=Double.parseDouble(stringArrayOfWeightOne[0]);
    double doubleValueOfWeightTwoInGrams=covertToGrams(weightTwo);

    String unitOfWeightOne=stringArrayOfWeightOne[1];

    double doubleValueOfWeightTwo= convertGramsToUnitOfWeightOne(doubleValueOfWeightTwoInGrams, unitOfWeightOne);
   
    return doubleValueOfWeightOne-doubleValueOfWeightTwo+" "+unitOfWeightOne;
}
public static boolean checkTemperatureIsEqualOrNot(String temperatureOne,String temperatureTwo)
{
    double doubleTemperatureOne=covertToCelcius(temperatureOne);
    double doubleTemperatureTwo=covertToCelcius(temperatureTwo);
    return doubleTemperatureOne==doubleTemperatureTwo;
}
public static void main(String[] args) {
    System.out.println("Main");
}
}

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckConversionsTest {

    @Test
    public void checkTwosLenghtsAreEqualWithSameUnits(){
        assertTrue(CheckConversions.checkDistanceIsEqualOrNot("1 cm", "1 cm"));
    }
    @Test
    public void checkTwosLenghtsAreEqualWithDifferentUnits(){
        assertTrue(CheckConversions.checkDistanceIsEqualOrNot("1 m", "100 cm"));
        assertTrue(CheckConversions.checkDistanceIsEqualOrNot("100 cm", "0.001 km"));
    }
    @Test
    public void addTwoLenghtsOfEqualUnits(){
        assertEquals("11.0 cm", CheckConversions.addTwoLengths("10 cm", "1 cm"));
    }
    @Test
    public void addTwoLenghtsOfDifferentUnits(){
        assertEquals("2.0 m", CheckConversions.addTwoLengths("1 m", "100 cm"));
        assertEquals("100200.0 cm", CheckConversions.addTwoLengths("200 cm", "1 km"));
    }
    @Test
    public void subractTwoLenghtsOfEqualUnits(){
        assertEquals("9.0 cm", CheckConversions.subractTwoLengths("10 cm", "1 cm"));
    }
    @Test
    public void subractTwoLenghtsOfDifferentUnits(){
        assertEquals("0.5 m", CheckConversions.subractTwoLengths("1 m", "50 cm"));
        assertEquals("1900.0 cm", CheckConversions.subractTwoLengths("2000 cm", "1 m"));
    }
    @Test
    public void checkTwosWeightsAreEqualWithSameUnits(){
        assertTrue(CheckConversions.checkWeightIsEqualOrNot("1 g", "1 g"));
    }
    @Test
    public void checkTwosWeightssAreEqualWithDifferentUnits(){
        assertTrue(CheckConversions.checkWeightIsEqualOrNot("0.1 kg", "100 g"));
    }
    @Test
    public void addTwoWeightsOfEqualUnits(){
        assertEquals("150.0 g", CheckConversions.addTwoWeights("100 g", "50 g"));
    }
    @Test
    public void addTwoWeightsOfDifferentUnits(){
        assertEquals("1010.0 g", CheckConversions.addTwoWeights("10 g", "1 kg"));
    }
    @Test
    public void subractwoWeightsOfDifferentUnits(){
        assertEquals("1.0 kg", CheckConversions.subractTwoWeights("1.5 kg", "500 g"));
    }
    @Test
    public void checkTwoTemperaturesWithDifferentUnitsAreEqual(){
        assertTrue(CheckConversions.checkTemperatureIsEqualOrNot("0 c", "32 f"));
        assertFalse(CheckConversions.checkTemperatureIsEqualOrNot("0 k", "-273 c"));
    }


}

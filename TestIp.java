import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestIp {
   @Test
   public void testTrue(){
       assertTrue(CheckIpAddress.ValidateIpAddress("12.1.221.1"));
       assertTrue(CheckIpAddress.ValidateIpAddress("12.1.221.54"));
       assertTrue(CheckIpAddress.ValidateIpAddress("12.1.221.25"));
   }
   @Test
   public void testFalse(){
       assertFalse(CheckIpAddress.ValidateIpAddress("258.1.221.255"));
        assertFalse(CheckIpAddress.ValidateIpAddress("12.1.-1.0"));
        assertFalse(CheckIpAddress.ValidateIpAddress("1.1.221.2"));
   }
}

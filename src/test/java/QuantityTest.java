import com.quantitymeasurementtddproblem.services.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void Convert_FeetValue_IntoInches(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double feet = 1.0;
        double inches = quantityMeasurement.convert(feet);
        Assert.assertEquals(12, inches,0.0);
    }

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

}
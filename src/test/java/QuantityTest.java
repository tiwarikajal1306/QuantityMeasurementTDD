import com.quantitymeasurementtddproblem.services.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    Feet reference1 = new Feet();

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

    @Test
    public void givenOneNullObject_ShouldReturnFalse() {
            Feet feet = new Feet(0.0);
            Assert.assertFalse(feet.equals(null));
    }

    @Test
    public void givenOneNullObject_ShouldThrowException() throws NullPointerException {
        try {
            Feet feet1 = new Feet(0.0);
            Feet feet2 = new Feet(null);
            Assert.assertEquals(feet1, feet2);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenReferenceObject_WhenEqual_ShouldReturnTrue() {
        Feet reference2 = new Feet(0.0);
        Assert.assertEquals(reference1,reference2);
    }
}
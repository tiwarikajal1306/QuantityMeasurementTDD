import com.quantitymeasurementtddproblem.services.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    Unit reference1 = new Unit();
    QuantityMeasurement quantityMeasurement;

    @Test
    public void Convert_FeetValue_IntoInches(){
       quantityMeasurement = new QuantityMeasurement();
        double feet = 1.0;
        double inches = quantityMeasurement.convert(feet);
        Assert.assertEquals(12, inches,0.0);
    }

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Unit unit1 = new Unit(Unit.UnitType.FEET,0.0);
        Unit unit2 = new Unit(Unit.UnitType.FEET,0.0);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void givenOneNullObject_ShouldReturnFalse() {
            Unit unit = new Unit(Unit.UnitType.FEET,0.0);
            Assert.assertFalse(unit.equals(null));
    }

    @Test
    public void givenOneNullObject_ShouldThrowException() throws NullPointerException {
        try {
            Unit unit1 = new Unit(Unit.UnitType.FEET,0.0);
            Unit unit2 = new Unit(Unit.UnitType.FEET,null);
            Assert.assertEquals(unit1, unit2);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenReferenceObject_WhenEqual_ShouldReturnTrue() {
        Unit reference2 = new Unit(Unit.UnitType.FEET,0.0);
        Assert.assertEquals(reference1,reference2);
    }

    @Test
    public void givenSameTypeWhenCompare_ShouldReturnNotEqual() {
        quantityMeasurement = new QuantityMeasurement();
        Unit unit1 = new Unit(Unit.UnitType.FEET,1.0);
        Assert.assertNotEquals(unit1.getClass(), quantityMeasurement.getClass());
    }
    @Test
    public void givenDifferentValue_ShouldNotReturnEqual() {
        Unit unit1 = new Unit(Unit.UnitType.FEET,1.0);
        Unit unit2 = new Unit(Unit.UnitType.FEET,0.0);
        Assert.assertNotEquals(unit1, unit2);
    }
    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Unit unit1 = new Unit(Unit.UnitType.INCH,0.0);
        Unit unit2 = new Unit(Unit.UnitType.INCH,0.0);
        Assert.assertEquals(unit1, unit2);
    }
}
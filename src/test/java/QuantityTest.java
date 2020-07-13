import com.quantitymeasurementtddproblem.exception.QuantityMeasurementException;
import com.quantitymeasurementtddproblem.services.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    //Unit reference1 = new Unit();
    QuantityMeasurement quantityMeasurement;

    @Test
    public void Convert_FeetValue_IntoInches(){
       quantityMeasurement = new QuantityMeasurement();
        double feet = 1.0;
        double inches = quantityMeasurement.convert(feet);
        Assert.assertEquals(12, inches,0.0);
    }

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() throws QuantityMeasurementException {
        Unit unit1 = new Unit(Unit.UnitType.FEET,0.0);
        Unit unit2 = new Unit(Unit.UnitType.FEET,0.0);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void givenOneNullObject_ShouldReturnException() throws QuantityMeasurementException {
        try {
            Unit unit = new Unit(Unit.UnitType.FEET, 0.0);
            Unit unit2 = new Unit(Unit.UnitType.FEET, null);
        }catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenReferenceObject_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Unit feet1 = new Unit(Unit.UnitType.FEET,0.0);
        Unit feet2 = new Unit(Unit.UnitType.FEET,0.0);
        Assert.assertNotEquals(feet1, equals(feet2));
    }

    @Test
    public void givenSameTypeWhenCompare_ShouldReturnNotEqual() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement();
        Unit unit1 = new Unit(Unit.UnitType.FEET,1.0);
        Assert.assertNotEquals(unit1.getClass(), quantityMeasurement.getClass());
    }
    @Test
    public void givenDifferentValue_ShouldNotReturnEqual() throws QuantityMeasurementException {
        Unit unit1 = new Unit(Unit.UnitType.FEET,1.0);
        Unit unit2 = new Unit(Unit.UnitType.FEET,0.0);
        Assert.assertNotEquals(unit1, unit2);
    }
    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() throws QuantityMeasurementException {
        Unit unit1 = new Unit(Unit.UnitType.INCH,0.0);
        Unit unit2 = new Unit(Unit.UnitType.INCH,0.0);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void givenInchOneNullObject_ShouldReturnException() throws QuantityMeasurementException {
        try {
            Unit unit = new Unit(Unit.UnitType.INCH, 0.0);
            Unit unit2 = new Unit(Unit.UnitType.INCH, null);
        }catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenInchReferenceObject_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Unit feet1 = new Unit(Unit.UnitType.INCH,0.0);
        Unit feet2 = new Unit(Unit.UnitType.INCH,0.0);
        Assert.assertNotEquals(feet1, equals(feet2));
    }

    @Test
    public void givenInchSameTypeWhenCompare_ShouldReturnNotEqual() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement();
        Unit unit1 = new Unit(Unit.UnitType.INCH,1.0);
        Assert.assertNotEquals(unit1.getClass(), quantityMeasurement.getClass());
    }
    @Test
    public void givenDifferentInchValue_ShouldNotReturnEqual() throws QuantityMeasurementException {
        Unit unit1 = new Unit(Unit.UnitType.INCH,1.0);
        Unit unit2 = new Unit(Unit.UnitType.INCH,0.0);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void givenFeet_AndYard_ShouldReturnConvertedResult() throws QuantityMeasurementException {
        Unit feet = new Unit(Unit.UnitType.FEET,3.0);
        Unit yard = new Unit(Unit.UnitType.YARD,1.0);
       boolean result = yard.convert(feet);
        Assert.assertTrue(result);
    }

    @Test
    public void givenOneFeet_AndOneYard_ShouldReturnFalseResult() throws QuantityMeasurementException {
        Unit feet = new Unit(Unit.UnitType.FEET,1.0);
        Unit yard = new Unit(Unit.UnitType.YARD,1.0);
        boolean result = yard.convert(feet);
        Assert.assertFalse(result);
    }

    @Test
    public void givenOneInch_AndOneYard_ShouldReturnFalseResult() throws QuantityMeasurementException {
        Unit inch = new Unit(Unit.UnitType.INCH,1.0);
        Unit yard = new Unit(Unit.UnitType.YARD,1.0);
        boolean result = yard.convert(inch);
        Assert.assertFalse(result);
    }

    @Test
    public void givenOneYard_AndThirtySixInch_ShouldReturnTrueResult() throws QuantityMeasurementException {
        Unit inch = new Unit(Unit.UnitType.INCH,36.0);
        Unit yard = new Unit(Unit.UnitType.YARD,1.0);
        boolean result = yard.convert(inch);
        Assert.assertTrue(result);
    }
}
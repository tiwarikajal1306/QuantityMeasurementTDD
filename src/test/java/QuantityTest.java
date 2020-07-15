import com.quantitymeasurementtddproblem.exception.QuantityMeasurementException;
import com.quantitymeasurementtddproblem.model.Length.Units;
import com.quantitymeasurementtddproblem.model.Volume;
import com.quantitymeasurementtddproblem.services.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;


public class QuantityTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    /**
     * Test case for Feet to Inch
     *
     * @throws QuantityMeasurementException
     */
    @Test
    public void givenOneFeet_And12Inch_ShouldReturnConvertedResult() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 12.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 0.0);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.FEET, 0.0);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenOneNullObject_ShouldReturnException() {
        try {

            QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 0.0);
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.FEET, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenReferenceObject_WhenEqual_ShouldReturnTrue() {
        Assert.assertEquals(quantityMeasurement, quantityMeasurement);
    }

    @Test
    public void givenSameTypeWhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 0.0);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.FEET, 0.0);
        Assert.assertEquals(quantityMeasurement.getClass(), quantityMeasurement1.getClass());
    }

    @Test
    public void givenSameType2WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement.unitConversion(Units.FEET, 0.0);
        Integer value1 = 34;
        Assert.assertNotEquals(quantityMeasurement.getClass(), value1.getClass());
    }

    @Test
    public void givenDifferentValue_ShouldNotReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 0.0);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.FEET, 1.0);
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurement1);
    }

    /**
     * Test for Inch
     *
     * @throws QuantityMeasurementException
     */
    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.INCH, 0.0);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.INCH, 0.0);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenInchOneNullObject_ShouldReturnException() {
        try {
            double value1 = quantityMeasurement.unitConversion(Units.INCH, 0.0);
            double value2 = quantityMeasurement.unitConversion(Units.INCH, null);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenInchReferenceObject_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement();
        Assert.assertNotEquals(quantityMeasurement, equals(quantityMeasurement2));
    }

    @Test
    public void givenReferenceInchObject_WhenEqual_ShouldReturnTrue() {
        Assert.assertEquals(quantityMeasurement, quantityMeasurement);
    }

    @Test
    public void givenSameTypeWhenCompare_ShouldReturnEqual() throws QuantityMeasurementException {
        quantityMeasurement.unitConversion(Units.INCH, 0.0);
        quantityMeasurement.unitConversion(Units.INCH, 0.0);
        Assert.assertEquals(quantityMeasurement.getClass(), quantityMeasurement.getClass());
    }

    @Test
    public void givenDifferentInchValue_ShouldNotReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.INCH, 0.0);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.INCH, 1.0);
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurement1);
    }

    /**
     * Test case for Feet to yard conversion
     *
     * @throws QuantityMeasurementException
     */


    @Test
    public void givenSameYardValue_ShouldReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.YARD, 0.0);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.YARD, 0.0);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenOneYARD_AndThreeFeet_ShouldReturnConvertedResult() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.YARD, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET, 3.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneFeet_AndOneYard_ShouldReturnFalseResult() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneInch_AndOneYard_ShouldReturnFalseResult() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneYard_AndThirtySixInch_ShouldReturnTrueResult() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.YARD, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 36.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenThirtySixInch_AndOneYard_ShouldReturnTrueResult() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 36.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenThreeFeet_AndOneYard_ShouldReturnConvertedResult() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 3.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Test case for Inch to centimeter
     *
     * @throws QuantityMeasurementException
     */

    @Test
    public void givenTwoInchAndFiveCentimeter_WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM, 5.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenZeroCentimeterAndZeroCentimeterValue_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.CM, 0.0);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.CM, 0.0);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenNullCentimeterValue_ShouldReturnFalse() {
        try {
            double value1 = quantityMeasurement.unitConversion(Units.CM, 0.0);
            double value2 = quantityMeasurement.unitConversion(Units.CM, null);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenTwoInchAndTwoInch_WhenAdded_ShouldReturnFourInch() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        double result = quantityMeasurement.addUnit(value1,value2);
        Assert.assertEquals(4,result,0.0);
    }

    @Test
    public void givenOneFeetAndTwoInch_WhenAdded_ShouldReturnFourteenInch() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        double result = quantityMeasurement.addUnit(value1,value2);
        Assert.assertEquals(14, result, 0.0);
    }

    @Test
    public void givenOneFeetAndOneFeet_WhenAdded_ShouldReturnTwentyFourInch() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET, 1.0);
        double result = quantityMeasurement.addUnit(value1,value2);
        Assert.assertEquals(24, result, 0.0);
    }
    @Test
    public void givenTwoInchAndTwoAndHalfCentimeter_WhenAdded_ShouldReturnThreeInch() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM, 2.5);
        double result = quantityMeasurement.addUnit(value1,value2);
        Assert.assertEquals(3,result, 0.0);
    }
}
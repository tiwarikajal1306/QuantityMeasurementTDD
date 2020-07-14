import com.quantitymeasurementtddproblem.exception.QuantityMeasurementException;
import com.quantitymeasurementtddproblem.model.Units;
import com.quantitymeasurementtddproblem.services.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    /**
     *  Test case for Feet to Inch
     * @throws QuantityMeasurementException
     */
    @Test
    public void givenOneFeet_And12Inch_ShouldReturnConvertedResult() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH,1.0);
        Assert.assertEquals(12, value1 ,0.0);
    }

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH,0.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH,0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenOneNullObject_ShouldReturnException() {
        try {
            double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH,0.0);
            double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH,null);
        }catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenReferenceObject_WhenEqual_ShouldReturnTrue() {
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void givenSameTypeWhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
         quantityMeasurement.unitConversion(Units.FEET_TO_INCH,0.0);
         quantityMeasurement.unitConversion(Units.FEET_TO_INCH,0.0);
        Assert.assertEquals(quantityMeasurement.getClass(), quantityMeasurement.getClass());
    }

    @Test
    public void givenDifferentValue_ShouldNotReturnEqual() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH,0.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH,1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Test for Inch
     * @throws QuantityMeasurementException
     */
    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.INCH,0.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH,0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenInchOneNullObject_ShouldReturnException()  {
        try {
            double value1 = quantityMeasurement.unitConversion(Units.INCH,0.0);
            double value2 = quantityMeasurement.unitConversion(Units.INCH,null);
        }catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenInchReferenceObject_WhenNotEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement, quantityMeasurement2);
    }

    @Test
    public void givenReferenceInchObject_WhenEqual_ShouldReturnTrue() {
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void givenInchSameTypeWhenCompare_ShouldReturnNotEqual() throws QuantityMeasurementException {
        quantityMeasurement.unitConversion(Units.INCH,0.0);
        quantityMeasurement.unitConversion(Units.INCH,0.0);
        Assert.assertEquals(quantityMeasurement.getClass(), quantityMeasurement.getClass());
    }
    @Test
    public void givenDifferentInchValue_ShouldNotReturnEqual() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.INCH,0.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH,1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Test case for Feet to yard conversion
     * @throws QuantityMeasurementException
     */
    @Test
    public void givenOneYARD_AndThreeFeet_ShouldReturnConvertedResult() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.YARD_TO_FEET,1.0);
        Assert.assertEquals(3, value1 ,0.0);
    }

    @Test
    public void givenOneFeet_AndOneYard_ShouldReturnFalseResult() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneInch_AndOneYard_ShouldReturnFalseResult() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneYard_AndThirtySixInch_ShouldReturnTrueResult() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 36.0);
        Assert.assertEquals(value1, value2, 0.0);
    }
    @Test
    public void givenThirtySixInch_AndOneYard_ShouldReturnTrueResult() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 36.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenThreeFeet_AndOneYard_ShouldReturnConvertedResult() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 3.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Test case for Inch to centimeter
     * @throws QuantityMeasurementException
     */

    @Test
    public void givenTwoInchAndFiveCentimeter_WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM_TO_INCH, 5.0);
        Assert.assertEquals(value1, value2, 0.0);
    }
    @Test
    public void givenZeroCentimeterAndZeroCentimeterValue_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        double value1 = quantityMeasurement.unitConversion(Units.CM_TO_INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM_TO_INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }
    @Test
    public void givenNullCentimeterValue_ShouldReturnFalse() {
        try {
            double value1 = quantityMeasurement.unitConversion(Units.CM_TO_INCH,0.0);
            double value2 = quantityMeasurement.unitConversion(Units.CM_TO_INCH,null);
        }catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }
}
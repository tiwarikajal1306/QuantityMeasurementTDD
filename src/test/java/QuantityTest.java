import com.quantitymeasurementtddproblem.exception.QuantityMeasurementException;
import com.quantitymeasurementtddproblem.model.UnitQuantity;
import com.quantitymeasurementtddproblem.model.Units;
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
        UnitQuantity unitQuantity = new UnitQuantity(1.0, Units.FEET);
        UnitQuantity unitQuantity2 = new UnitQuantity(12.0, Units.INCH);
        Assert.assertEquals(unitQuantity,unitQuantity2);
    }

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() throws QuantityMeasurementException {

        UnitQuantity unitQuantity = new UnitQuantity(0.0, Units.FEET);
        UnitQuantity unitQuantity2 = new UnitQuantity(0.0, Units.FEET);
        Assert.assertEquals(unitQuantity, unitQuantity2);
    }

    @Test
    public void givenOneNullObject_ShouldReturnException() {
        try {

            UnitQuantity unitQuantity = new UnitQuantity(null, Units.FEET);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenReferenceObject_WhenEqual_ShouldReturnTrue() {
        Assert.assertEquals(quantityMeasurement, quantityMeasurement);
    }

    @Test
    public void givenSameTypeWhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {

        UnitQuantity unitQuantity = new UnitQuantity(0.0, Units.FEET);
        UnitQuantity unitQuantity2 = new UnitQuantity(0.0, Units.FEET);
        Assert.assertEquals(unitQuantity2, unitQuantity);
    }

    @Test
    public void givenSameType2WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(0.0, Units.FEET);
        Integer value1 = 34;
        Assert.assertNotEquals(unitQuantity.getClass(), value1.getClass());
    }

    @Test
    public void givenDifferentValue_ShouldNotReturnEqual() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(0.0, Units.FEET);
        UnitQuantity unitQuantity2 = new UnitQuantity(1.0, Units.FEET);
        Assert.assertNotEquals(unitQuantity, unitQuantity2);
    }

    /**
     * Test for Inch
     *
     * @throws QuantityMeasurementException
     */
    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(0.0, Units.INCH);
        UnitQuantity unitQuantity2 = new UnitQuantity(0.0, Units.INCH);
        Assert.assertEquals(unitQuantity, unitQuantity2);
    }

    @Test
    public void givenInchOneNullObject_ShouldReturnException() {
        try {

            UnitQuantity unitQuantity = new UnitQuantity(null, Units.INCH);
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
        UnitQuantity unitQuantity = new UnitQuantity(0.0, Units.INCH);
        UnitQuantity unitQuantity2 = new UnitQuantity(0.0, Units.INCH);
        Assert.assertEquals(unitQuantity.getClass(), unitQuantity2.getClass());
    }

    @Test
    public void givenDifferentInchValue_ShouldNotReturnEqual() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(0.0, Units.INCH);
        UnitQuantity unitQuantity2 = new UnitQuantity(2.0, Units.INCH);
        Assert.assertNotEquals(unitQuantity, unitQuantity2);
    }

    /**
     * Test case for Feet to yard conversion
     *
     * @throws QuantityMeasurementException
     */


    @Test
    public void givenSameYardValue_ShouldReturnEqual() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(0.0, Units.YARD);
        UnitQuantity unitQuantity2 = new UnitQuantity(0.0, Units.YARD);
        Assert.assertEquals(unitQuantity, unitQuantity2);
    }

    @Test
    public void givenOneYARD_AndThreeFeet_ShouldReturnConvertedResult() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(1.0, Units.YARD);
        UnitQuantity unitQuantity2 = new UnitQuantity(3.0, Units.FEET);
        Assert.assertEquals(unitQuantity, unitQuantity2);
    }

    @Test
    public void givenOneFeet_AndOneYard_ShouldReturnFalseResult() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(1.0, Units.FEET);
        UnitQuantity unitQuantity2 = new UnitQuantity(1.0, Units.YARD);
        Assert.assertNotEquals(unitQuantity, unitQuantity2);
    }

    @Test
    public void givenOneInch_AndOneYard_ShouldReturnFalseResult() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(1.0, Units.INCH);
        UnitQuantity unitQuantity2 = new UnitQuantity(1.0, Units.YARD);
        Assert.assertNotEquals(unitQuantity, unitQuantity2);
    }

    @Test
    public void givenOneYard_AndThirtySixInch_ShouldReturnTrueResult() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(1.0, Units.YARD);
        UnitQuantity unitQuantity2 = new UnitQuantity(36.0, Units.INCH);
        Assert.assertEquals(unitQuantity, unitQuantity2);
    }

    @Test
    public void givenThirtySixInch_AndOneYard_ShouldReturnTrueResult() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(36.0, Units.INCH);
        UnitQuantity unitQuantity2 = new UnitQuantity(1.0, Units.YARD);
        Assert.assertEquals(unitQuantity, unitQuantity2);
    }

    @Test
    public void givenThreeFeet_AndOneYard_ShouldReturnConvertedResult() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(3.0, Units.FEET);
        UnitQuantity unitQuantity2 = new UnitQuantity(1.0, Units.YARD);
        Assert.assertEquals(unitQuantity, unitQuantity2);
    }

    /**
     * Test case for Inch to centimeter
     *
     * @throws QuantityMeasurementException
     */

    @Test
    public void givenTwoInchAndFiveCentimeter_WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(2.0, Units.INCH);
        UnitQuantity unitQuantity2 = new UnitQuantity(5.0, Units.CM);
        Assert.assertEquals(unitQuantity, unitQuantity2);
    }

    @Test
    public void givenZeroCentimeterAndZeroCentimeterValue_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(0.0, Units.CM);
        UnitQuantity unitQuantity2 = new UnitQuantity(0.0, Units.CM);
        Assert.assertEquals(unitQuantity, unitQuantity2);
    }

    @Test
    public void givenNullCentimeterValue_ShouldReturnFalse() {
        try {

            UnitQuantity unitQuantity = new UnitQuantity(null, Units.CM);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenTwoInchAndTwoInch_WhenAdded_ShouldReturnFourInch() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(2.0, Units.INCH);
        UnitQuantity unitQuantity2 = new UnitQuantity(2.0, Units.INCH);
        double result = quantityMeasurement.addUnit(unitQuantity,unitQuantity2);
        Assert.assertEquals(4,result,0.0);
    }

    @Test
    public void givenOneFeetAndTwoInch_WhenAdded_ShouldReturnFourteenInch() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(1.0, Units.FEET);
        UnitQuantity unitQuantity2 = new UnitQuantity(2.0, Units.INCH);
        double result = quantityMeasurement.addUnit(unitQuantity,unitQuantity2);
        Assert.assertEquals(14, result, 0.0);
    }

    @Test
    public void givenOneFeetAndOneFeet_WhenAdded_ShouldReturnTwentyFourInch() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(1.0, Units.FEET);
        UnitQuantity unitQuantity2 = new UnitQuantity(1.0, Units.FEET);
        double result = quantityMeasurement.addUnit(unitQuantity,unitQuantity2);
        Assert.assertEquals(24, result, 0.0);
    }
    @Test
    public void givenTwoInchAndTwoAndHalfCentimeter_WhenAdded_ShouldReturnThreeInch() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(2.0, Units.INCH);
        UnitQuantity unitQuantity2 = new UnitQuantity(2.5, Units.CM);
        double result = quantityMeasurement.addUnit(unitQuantity,unitQuantity2);
        Assert.assertEquals(3,result, 0.0);
    }
    @Test
    public void givenOneGallonAndLitreValue_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(1.0, Units.GALLON);
        UnitQuantity unitQuantity2 = new UnitQuantity(3.78, Units.LITRES);
        Assert.assertEquals(unitQuantity,unitQuantity2);

    }

    @Test
    public void givenOneLitresAndOneThousandValue_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(1.0, Units.LITRES);
        UnitQuantity unitQuantity2 = new UnitQuantity(1000.0, Units.MILLILITERS);
        Assert.assertEquals(unitQuantity, unitQuantity2);
    }

    @Test
    public void givenGallonAndLitre_WhenAdded_ShouldEqualToGivenLitreValue() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(1.0, Units.GALLON);
        UnitQuantity unitQuantity2 = new UnitQuantity(3.78, Units.LITRES);
        UnitQuantity unitQuantity3 = new UnitQuantity(7.57, Units.LITRES);
        double result = quantityMeasurement.addUnit(unitQuantity,unitQuantity2);
        Assert.assertEquals(unitQuantity3.value, result, 0.1);
    }
    @Test
    public void givenOneLitreAndThousandML_WhenAdded_ShouldEqualToGivenLitreValue() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(1.0, Units.LITRES);
        UnitQuantity unitQuantity2 = new UnitQuantity(1000.0, Units.MILLILITERS);
        UnitQuantity unitQuantity3 = new UnitQuantity(2.0, Units.LITRES);
        double result = quantityMeasurement.addUnit(unitQuantity,unitQuantity2);
        Assert.assertEquals(unitQuantity3.value, result, 0.1);
    }
    @Test
    public void givenOneKilogramAndOneThousandGrams_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(1.0, Units.KILOGRAMS);
        UnitQuantity unitQuantity2 = new UnitQuantity(1000.0, Units.GRAMS);
        Assert.assertEquals(unitQuantity.value, unitQuantity2.value);
    }
    @Test
    public void givenOneTonneAndOneThousandKilograms_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(1.0, Units.TONNE);
        UnitQuantity unitQuantity2 = new UnitQuantity(1000.0, Units.KILOGRAMS);
        Assert.assertEquals(unitQuantity.value, unitQuantity2.value);
    }
    @Test
    public void givenOneTonneAndOneThousandGrams_WhenAdded_ShouldReturnOneThousandOneKilograms() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(1.0, Units.TONNE);
        UnitQuantity unitQuantity2 = new UnitQuantity(1000.0, Units.GRAMS);
        UnitQuantity unitQuantity3 = new UnitQuantity(1001.0, Units.KILOGRAMS);
        double result = quantityMeasurement.addUnit(unitQuantity,unitQuantity2);
        Assert.assertEquals(unitQuantity3.value, result, 0.1);
    }
}
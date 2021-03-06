import com.quantitymeasurementtddproblem.exception.QuantityMeasurementException;
import com.quantitymeasurementtddproblem.services.Converter;
import com.quantitymeasurementtddproblem.services.MeasurementQuantity;
import com.quantitymeasurementtddproblem.enums.Units;
import org.junit.Assert;
import org.junit.Test;


public class QuantityTest {

    MeasurementQuantity measurementQuantity = new MeasurementQuantity();
    Converter converter = new Converter();

    @Test
    public void givenOneFeet_And12Inch_ShouldReturnConvertedResult() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(1.0, Units.FEET);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(12.0, Units.INCH);
        Assert.assertEquals(measurementQuantity, measurementQuantity2);
    }

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() throws QuantityMeasurementException {

        MeasurementQuantity measurementQuantity = new MeasurementQuantity(0.0, Units.FEET);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(0.0, Units.FEET);
        Assert.assertEquals(measurementQuantity, measurementQuantity2);
    }

    @Test
    public void givenOneNullObject_ShouldReturnException() {
        try {

            MeasurementQuantity measurementQuantity = new MeasurementQuantity(null, Units.FEET);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenReferenceObject_WhenEqual_ShouldReturnTrue() {
        Assert.assertEquals(converter, converter);
    }

    @Test
    public void givenSameTypeWhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(0.0, Units.FEET);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(0.0, Units.FEET);
        Assert.assertEquals(measurementQuantity2, measurementQuantity);
    }

    @Test
    public void givenSameType2WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(0.0, Units.FEET);
        Converter value1 = new Converter();
        Assert.assertNotEquals(measurementQuantity, value1);
    }

    @Test
    public void givenDifferentValue_ShouldNotReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(0.0, Units.FEET);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(1.0, Units.FEET);
        Assert.assertNotEquals(measurementQuantity, measurementQuantity2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(0.0, Units.INCH);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(0.0, Units.INCH);
        Assert.assertEquals(measurementQuantity, measurementQuantity2);
    }

    @Test
    public void givenInchOneNullObject_ShouldReturnException() {
        try {

            MeasurementQuantity measurementQuantity = new MeasurementQuantity(null, Units.INCH);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenInchReferenceObject_WhenNotEqual_ShouldReturnFalse() {
       MeasurementQuantity measurementQuantity2 = new MeasurementQuantity();
        Assert.assertNotEquals(measurementQuantity, equals(measurementQuantity2));
    }

    @Test
    public void givenReferenceInchObject_WhenEqual_ShouldReturnTrue() {
        Assert.assertEquals(measurementQuantity, measurementQuantity);
    }

    @Test
    public void givenSameTypeWhenCompare_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(0.0, Units.INCH);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(0.0, Units.INCH);
        Assert.assertEquals(measurementQuantity, measurementQuantity2);
    }

    @Test
    public void givenDifferentInchValue_ShouldNotReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(0.0, Units.INCH);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(2.0, Units.INCH);
        Assert.assertNotEquals(measurementQuantity, measurementQuantity2);
    }

    @Test
    public void givenSameYardValue_ShouldReturnEqual() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(0.0, Units.YARD);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(0.0, Units.YARD);
        Assert.assertEquals(measurementQuantity, measurementQuantity2);
    }

    @Test
    public void givenOneYARD_AndThreeFeet_ShouldReturnConvertedResult() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(1.0, Units.YARD);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(3.0, Units.FEET);
        Assert.assertEquals(measurementQuantity, measurementQuantity2);
    }

    @Test
    public void givenOneFeet_AndOneYard_ShouldReturnFalseResult() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(1.0, Units.FEET);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(1.0, Units.YARD);
        Assert.assertNotEquals(measurementQuantity, measurementQuantity2);
    }

    @Test
    public void givenOneInch_AndOneYard_ShouldReturnFalseResult() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(1.0, Units.INCH);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(1.0, Units.YARD);
        Assert.assertNotEquals(measurementQuantity, measurementQuantity2);
    }

    @Test
    public void givenOneYard_AndThirtySixInch_ShouldReturnTrueResult() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(1.0, Units.YARD);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(36.0, Units.INCH);
        Assert.assertEquals(measurementQuantity, measurementQuantity2);
    }

    @Test
    public void givenThirtySixInch_AndOneYard_ShouldReturnTrueResult() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(36.0, Units.INCH);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(1.0, Units.YARD);
        Assert.assertEquals(measurementQuantity, measurementQuantity2);
    }

    @Test
    public void givenThreeFeet_AndOneYard_ShouldReturnConvertedResult() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(3.0, Units.FEET);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(1.0, Units.YARD);
        Assert.assertEquals(measurementQuantity, measurementQuantity2);
    }

    @Test
    public void givenTwoInchAndFiveCentimeter_WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(2.0, Units.INCH);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(5.0, Units.CM);
        Assert.assertEquals(measurementQuantity, measurementQuantity2);
    }

    @Test
    public void givenZeroCentimeterAndZeroCentimeterValue_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(0.0, Units.CM);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(0.0, Units.CM);
        Assert.assertEquals(measurementQuantity, measurementQuantity2);
    }

    @Test
    public void givenNullCentimeterValue_ShouldReturnFalse() {
        try {

            MeasurementQuantity measurementQuantity = new MeasurementQuantity(null, Units.CM);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenTwoInchAndTwoInch_WhenAdded_ShouldReturnFourInch() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(2.0, Units.INCH);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(2.0, Units.INCH);
        double result = converter.addUnit(measurementQuantity, measurementQuantity2);
        Assert.assertEquals(4,result,0.0);
    }

    @Test
    public void givenOneFeetAndTwoInch_WhenAdded_ShouldReturnFourteenInch() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(1.0, Units.FEET);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(2.0, Units.INCH);
        double result = converter.addUnit(measurementQuantity, measurementQuantity2);
        Assert.assertEquals(14, result, 0.0);
    }

    @Test
    public void givenOneFeetAndOneFeet_WhenAdded_ShouldReturnTwentyFourInch() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(1.0, Units.FEET);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(1.0, Units.FEET);
        double result = converter.addUnit(measurementQuantity, measurementQuantity2);
        Assert.assertEquals(24, result, 0.0);
    }
    @Test
    public void givenTwoInchAndTwoAndHalfCentimeter_WhenAdded_ShouldReturnThreeInch() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(2.0, Units.INCH);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(2.5, Units.CM);
        double result = converter.addUnit(measurementQuantity, measurementQuantity2);
        Assert.assertEquals(3,result, 0.0);
    }
    @Test
    public void givenOneGallonAndLitreValue_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(1.0, Units.GALLON);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(3.78, Units.LITRES);
        Assert.assertEquals(measurementQuantity, measurementQuantity2);

    }

    @Test
    public void givenOneLitresAndOneThousandValue_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(1.0, Units.LITRES);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(1000.0, Units.MILLILITERS);
        Assert.assertEquals(measurementQuantity, measurementQuantity2);
    }

    @Test
    public void givenGallonAndLitre_WhenAdded_ShouldEqualToGivenLitreValue() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(1.0, Units.GALLON);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(3.78, Units.LITRES);
        MeasurementQuantity measurementQuantity3 = new MeasurementQuantity(7.57, Units.LITRES);
        double result = converter.addUnit(measurementQuantity, measurementQuantity2);
        Assert.assertEquals(measurementQuantity3.value, result, 0.1);
    }
    @Test
    public void givenOneLitreAndThousandML_WhenAdded_ShouldEqualToGivenLitreValue() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(1.0, Units.LITRES);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(1000.0, Units.MILLILITERS);
        MeasurementQuantity measurementQuantity3 = new MeasurementQuantity(2.0, Units.LITRES);
        double result = converter.addUnit(measurementQuantity, measurementQuantity2);
        Assert.assertEquals(measurementQuantity3.value, result, 0.1);
    }
    @Test
    public void givenOneKilogramAndOneThousandGrams_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(1.0, Units.KILOGRAMS);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(1000.0, Units.GRAMS);
        Assert.assertEquals(measurementQuantity.value, measurementQuantity2.value);
    }
    @Test
    public void givenOneTonneAndOneThousandKilograms_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(1.0, Units.TONNE);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(1000.0, Units.KILOGRAMS);
        Assert.assertEquals(measurementQuantity.value, measurementQuantity2.value);
    }
    @Test
    public void givenOneTonneAndOneThousandGrams_WhenAdded_ShouldReturnOneThousandOneKilograms() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(1.0, Units.TONNE);
        MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(1000.0, Units.GRAMS);
        MeasurementQuantity measurementQuantity3 = new MeasurementQuantity(1001.0, Units.KILOGRAMS);
        double result = converter.addUnit(measurementQuantity, measurementQuantity2);
        Assert.assertEquals(measurementQuantity3.value, result, 0.1);
    }
    @Test
    public void givenCelsiusTemperature0_ShouldReturnThirtyTwoFahrenheit() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(0.0, Units.CELSIUS);
        Assert.assertEquals( 32.0, measurementQuantity.value, 0.0);
    }

    @Test
    public void givenTwoHundredTwelveFahrenheitTemperature_ShouldReturnHundredCelsius() throws QuantityMeasurementException {
        MeasurementQuantity measurementQuantity = new MeasurementQuantity(212.0, Units.FAHRENHEIT);
        Assert.assertEquals( 100.0, measurementQuantity.value, 0.0);
    }

    @Test
    public void givenOneFeetAndTwoGallon_WhenAdded_ShouldReturnFourteenInch() {
        try {
            MeasurementQuantity measurementQuantity = new MeasurementQuantity(1.0, Units.FEET);
            MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(2.0, Units.GALLON);
            double result = converter.addUnit(measurementQuantity, measurementQuantity2);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.TYPE_MISTMATCH, e.type);
        }
    }

    @Test
    public void givenNegativeCentimeterValue_ShouldReturnFalse() {
        try {

            MeasurementQuantity measurementQuantity = new MeasurementQuantity(-8.0, Units.CM);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }
    @Test
    public void givenOneLitre_And12Inch_ShouldReturnConvertedResult()  {
        try {
            MeasurementQuantity measurementQuantity = new MeasurementQuantity(1.0, Units.LITRES);
            MeasurementQuantity measurementQuantity2 = new MeasurementQuantity(12.0, Units.INCH);
            boolean result = measurementQuantity.comparing(measurementQuantity, measurementQuantity2);
            Assert.assertTrue(result);
        } catch (QuantityMeasurementException e){
            System.out.println(e.getMessage());
        }
    }
}
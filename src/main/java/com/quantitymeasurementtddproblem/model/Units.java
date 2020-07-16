package com.quantitymeasurementtddproblem.model;

public enum Units {
    INCH(1.0, MeasurementType.LENGTH), FEET(12.0, MeasurementType.LENGTH),
    YARD( 36.0, MeasurementType.LENGTH), CM(1/2.5, MeasurementType.LENGTH),
    GALLON(3.78, MeasurementType.VOLUME), LITRES(1.0, MeasurementType.VOLUME),
    MILLILITERS(0.001, MeasurementType.VOLUME),  KILOGRAMS(1.0, MeasurementType.WEIGHT ),
    GRAMS(0.001, MeasurementType.WEIGHT),
    TONNE(1000.0, MeasurementType.WEIGHT), FAHRENHEIT(5.0/9.0, MeasurementType.TEMPERATURE, 32),
    CELSIUS(9.0/5.0, MeasurementType.TEMPERATURE, 32);

    public int factor;
    public MeasurementType type;
    public Double constantValue;

        Units(Double constantValue, MeasurementType type) {
            this.constantValue = constantValue;
            this.type = type;
        }

    Units(double constantValue, MeasurementType type, int factor) {
        this.constantValue = constantValue;
        this.type = type;
        this.factor = factor;
    }
}


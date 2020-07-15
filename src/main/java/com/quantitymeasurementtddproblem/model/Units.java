package com.quantitymeasurementtddproblem.model;

public enum Units {
    INCH(1.0, MeasurementType.LENGTH), FEET(12.0, MeasurementType.LENGTH),
    YARD( 36.0, MeasurementType.LENGTH), CM(1/2.5, MeasurementType.LENGTH),
    GALLON(3.78, MeasurementType.VOLUME), LITRES(1.0, MeasurementType.VOLUME),
    MILLILITERS(0.001, MeasurementType.VOLUME);

    public MeasurementType type;
    public Double constantValue;

        Units(Double constantValue, MeasurementType type) {
            this.constantValue = constantValue;
            this.type = type;
        }
    }


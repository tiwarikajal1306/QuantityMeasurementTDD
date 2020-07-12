package com.quantitymeasurementtddproblem.services;

public class QuantityMeasurement {
private final int FEET_TO_INCH_CONVERSION_FACTOR = 12;
    public double convert(double feet) {
        return feet * FEET_TO_INCH_CONVERSION_FACTOR;
    }
}

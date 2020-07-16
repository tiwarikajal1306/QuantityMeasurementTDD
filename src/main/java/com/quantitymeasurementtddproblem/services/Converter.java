package com.quantitymeasurementtddproblem.services;

import com.quantitymeasurementtddproblem.model.MeasurementQuantity;
import com.quantitymeasurementtddproblem.enums.Units;

public class Converter {

    public double convertUnit(Double value, Units units) {
        switch (units) {
            case FAHRENHEIT:
                return (value - units.factor) * units.constantValue;
            case CELSIUS:
                return (value * units.constantValue) + units.factor;
            default:
                return value * units.constantValue;
        }
    }

    public double addUnit(MeasurementQuantity value, MeasurementQuantity value2) {
        double result = value.value + value2.value;
        return result;
    }
}

package com.quantitymeasurementtddproblem.services;

import com.quantitymeasurementtddproblem.exception.QuantityMeasurementException;
import com.quantitymeasurementtddproblem.model.Units;

public class QuantityMeasurement {

    public double unitConversion(Units units, Double value) throws QuantityMeasurementException {
        try{
            return value * units.unit;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null value");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (this.getClass() == obj.getClass()) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return super.equals(obj);
    }
}

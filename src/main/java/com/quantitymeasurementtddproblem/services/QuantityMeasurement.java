package com.quantitymeasurementtddproblem.services;

import com.quantitymeasurementtddproblem.exception.QuantityMeasurementException;
import com.quantitymeasurementtddproblem.model.Units;

import java.util.Objects;

public class QuantityMeasurement {

   public Double value;
   public Units units;

    public QuantityMeasurement() {

    }

    public QuantityMeasurement(Units units, Double value) throws QuantityMeasurementException {
        try {
            this.units = units;
            this.value = value;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null value");
        }
    }

    public double unitConversion(Units units, Double value) throws QuantityMeasurementException {
        try {
            return value * units.constantValue;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null value");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Objects.equals(value, that.value) &&
                units == that.units;
    }
}

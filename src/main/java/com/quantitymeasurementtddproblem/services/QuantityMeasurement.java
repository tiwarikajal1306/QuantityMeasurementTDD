package com.quantitymeasurementtddproblem.services;

import com.quantitymeasurementtddproblem.exception.QuantityMeasurementException;
import com.quantitymeasurementtddproblem.model.Length;

import java.util.Objects;

public class QuantityMeasurement {

   public Length.Units units;
    public Double value;
  // public Units units;

    public QuantityMeasurement() {

    }

    public QuantityMeasurement(Length.Units units, Double value) throws QuantityMeasurementException {
        try {
            this.units = units;
            this.value = value;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null value");
        }
    }

    public double unitConversion(Length.Units units, Double value) throws QuantityMeasurementException {
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

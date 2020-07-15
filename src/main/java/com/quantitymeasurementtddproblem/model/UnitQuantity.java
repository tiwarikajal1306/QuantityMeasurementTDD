package com.quantitymeasurementtddproblem.model;

import com.quantitymeasurementtddproblem.exception.QuantityMeasurementException;

import java.util.Objects;

public class UnitQuantity {
    public Units units;
    public Double value;
    public MeasurementType type;
    public UnitQuantity() {
    }

    public double convertUnit(Double value, Units units){
        double result = value * units.constantValue;
        return result;
    }

    public UnitQuantity(Double value, Units units ) throws QuantityMeasurementException {
        try {

            this.value = convertUnit(value, units);
            this.type = units.type;
        } catch (NullPointerException e){
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null value");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitQuantity that = (UnitQuantity) o;
        return units == that.units &&
                Objects.equals(value, that.value) &&
                type == that.type;
    }

}

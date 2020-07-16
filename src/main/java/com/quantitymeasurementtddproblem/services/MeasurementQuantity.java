package com.quantitymeasurementtddproblem.services;
import com.quantitymeasurementtddproblem.exception.QuantityMeasurementException;
import com.quantitymeasurementtddproblem.model.MeasurementType;
import com.quantitymeasurementtddproblem.model.Units;
import java.util.Objects;

public class MeasurementQuantity {
    public Double value;
    public MeasurementType type;
    public MeasurementQuantity() {
    }

    public MeasurementQuantity(Double value, Units units ) throws QuantityMeasurementException {
        try {
            this.value = convertUnit(value, units);
            this.type = units.type;
        } catch (NullPointerException e){
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null value");
        }
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeasurementQuantity that = (MeasurementQuantity) o;
        return Objects.equals(value, that.value) &&
                type == that.type;
    }
}

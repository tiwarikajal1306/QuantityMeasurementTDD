package com.quantitymeasurementtddproblem.model;
import com.quantitymeasurementtddproblem.enums.MeasurementType;
import com.quantitymeasurementtddproblem.enums.Units;
import com.quantitymeasurementtddproblem.exception.QuantityMeasurementException;
import com.quantitymeasurementtddproblem.services.Converter;

import java.util.Objects;

public class MeasurementQuantity {

    Converter converter = new Converter();

    public Double value;
    public MeasurementType type;
    public MeasurementQuantity() {
    }

    public MeasurementQuantity(Double value, Units units ) throws QuantityMeasurementException {
        try {
            this.value = converter.convertUnit(value, units);
            this.type = units.type;
        } catch (NullPointerException e){
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null value");
        }
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

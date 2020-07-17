package com.quantitymeasurementtddproblem.model;

import com.quantitymeasurementtddproblem.enums.MeasurementType;
import com.quantitymeasurementtddproblem.enums.Units;
import com.quantitymeasurementtddproblem.exception.QuantityMeasurementException;
import com.quantitymeasurementtddproblem.services.Converter;

import java.util.Objects;

public class MeasurementQuantity {

    public Double value;
    public MeasurementType type;
    Converter converter = new Converter();

    public MeasurementQuantity() {
    }

    public MeasurementQuantity(Double value, Units units) throws QuantityMeasurementException {
        try {
            if (value < 0)
                throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE, "Negative value");
            this.value = converter.convertUnit(value, units);
            this.type = units.type;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null value");
        }
    }

    public boolean comparing(MeasurementQuantity value1, MeasurementQuantity value2) throws QuantityMeasurementException {
        if(value1.type != value2.type)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.TYPE_MISTMATCH, "type not same");
        return Double.compare(value1.value, value2.value) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeasurementQuantity that = (MeasurementQuantity) o;
        return type == that.type &&
                Objects.equals(value, that.value);
    }
}
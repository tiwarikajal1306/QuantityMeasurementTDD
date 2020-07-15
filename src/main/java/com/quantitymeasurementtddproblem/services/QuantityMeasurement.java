package com.quantitymeasurementtddproblem.services;

import com.quantitymeasurementtddproblem.exception.QuantityMeasurementException;
import com.quantitymeasurementtddproblem.model.Units;

import java.util.Objects;

public class QuantityMeasurement {

    public enum UnitSet {
        INCH, CM, YARD, FEET
    }
    UnitSet unitSet;
    Double value;
    public QuantityMeasurement() {

    }
    public QuantityMeasurement(UnitSet unitSet, Double value) throws QuantityMeasurementException {
        try {
            this.unitSet = unitSet;
            this.value = value;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null value");
        }
        }


    public double unitConversion(Units units, Double value) throws QuantityMeasurementException {
        try{
            return value * units.constantValue;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null value");
        }
    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }


    //    @Override
//    public boolean equals(Object obj) {
//        if(this == obj) return true;
//        //if (this.getClass() == obj.getClass()) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        return super.equals(obj);
//    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        QuantityMeasurement that = (QuantityMeasurement) o;
//        return unitSet == that.unitSet;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return unitSet == that.unitSet &&
                Objects.equals(value, that.value);
    }

}

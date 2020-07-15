package com.quantitymeasurementtddproblem.model;

public enum Units {
    INCH(1.0), FEET(12.0), YARD( 36.0), CM(1/2.5),
    GALLON(3.78), LITRES(1.0), MILLILITERS(0.001);;

        public Double constantValue;

        Units(Double constantValue) {
            this.constantValue = constantValue;
        }
    }


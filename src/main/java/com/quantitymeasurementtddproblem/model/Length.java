package com.quantitymeasurementtddproblem.model;

public class Length {

    public enum Units {
        INCH(1.0), FEET(12.0), YARD(36.0), CM(1 / 2.5);

        public Double constantValue;

        Units(Double constantValue) {
            this.constantValue = constantValue;

        }
    }
}
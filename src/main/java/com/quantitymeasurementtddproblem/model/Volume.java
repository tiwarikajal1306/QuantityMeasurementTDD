package com.quantitymeasurementtddproblem.model;

public class Volume {

    public enum Units {
        GALLON(3.78), LITER(1.0), ML(1/1000.0);
        public Double constantValue;

        Units(Double constantValue) {
            this.constantValue = constantValue;
        }
    }
}

package com.quantitymeasurementtddproblem.model;

public enum Units {
    INCH(1.0), FEET_TO_INCH(1 * 12.0), YARD_TO_INCH(1 * 36.0), CM_TO_INCH(1/2.5), YARD_TO_FEET(1 * 3.0);

    public Double unit;

    Units(Double unit) {
        this.unit = unit;
    }
}

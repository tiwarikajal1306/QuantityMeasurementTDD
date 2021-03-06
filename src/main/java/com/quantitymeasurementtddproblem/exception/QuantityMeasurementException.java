package com.quantitymeasurementtddproblem.exception;

public class QuantityMeasurementException extends Exception {
    public enum ExceptionType {
        NULL_VALUE, TYPE_MISTMATCH, NEGATIVE_VALUE
    }

    public ExceptionType type;

    public QuantityMeasurementException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}

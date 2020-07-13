import com.quantitymeasurementtddproblem.exception.QuantityMeasurementException;

public class Unit {
    int ONE_YARD_TO_FEET = 3;

    public enum UnitType {
        INCH,FEET,YARD
    }
        private double value;
        public UnitType unitType;
        public Unit(UnitType unitType,Double value) throws QuantityMeasurementException {
            try{
                this.value = value;
            } catch (NullPointerException e) {
                throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null value");
            }

            this.unitType = unitType;
        }

    public Unit() {
    }

    public boolean convert(Unit type) {

        if (this.unitType.equals(UnitType.YARD) && type.unitType.equals(UnitType.FEET)) {
            return Double.compare(this.value * ONE_YARD_TO_FEET, type.value) == 0;
        }
        return false;
    }

    @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Unit unit = (Unit) o;
            return Double.compare(unit.value, value) == 0;
        }
}

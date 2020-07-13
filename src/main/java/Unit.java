public class Unit {

    public enum UnitType {
        INCH,FEET
    }
        private double value;
        public UnitType unitType;
        public Unit(UnitType unitType,Double value) {
            this.value = value;
            this.unitType = unitType;
        }

    public Unit() {
    }


    @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Unit unit = (Unit) o;
            return Double.compare(unit.value, value) == 0;
        }
}

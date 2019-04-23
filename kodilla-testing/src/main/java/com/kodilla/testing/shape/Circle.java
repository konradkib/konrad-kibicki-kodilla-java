package com.kodilla.testing.shape;

public class Circle implements Shape {

        private String shapeName;
        private double r;

        public Circle(String shapeName, double r) {
            this.shapeName = shapeName;
            this.r = r;
        }

        @Override
        public String getShapeName() {
            return shapeName;
        }

        @Override
        public double getField() {
            return Math.PI*Math.pow(r,2);
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "shapeName='" + shapeName + '\'' +
                    ", r=" + r +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            com.kodilla.testing.shape.Circle circle = (com.kodilla.testing.shape.Circle) o;

            if (Double.compare(circle.r, r) != 0) return false;
            return shapeName.equals(circle.shapeName);

        }

        @Override
        public int hashCode() {
            int result = shapeName.hashCode();
            long temp = Double.doubleToLongBits(r);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }
    }



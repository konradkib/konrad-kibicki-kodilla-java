package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private String shapeName;
    private double sideLength;
    private double height;

    public Triangle(String shapeName, double sideLength, double height) {
        this.shapeName = shapeName;
        this.sideLength = sideLength;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return 0.5*sideLength*height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", sideLength=" + sideLength +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.sideLength, sideLength) != 0) return false;
        if (Double.compare(triangle.height, height) != 0) return false;
        return shapeName.equals(triangle.shapeName);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        temp = Double.doubleToLongBits(sideLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}


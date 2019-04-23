package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {


    private ArrayList<Shape> figures = new ArrayList<>();

    public ArrayList getFigures() {
        return this.figures;
    }

    public void addFigure(Shape shape){
        //do nothing
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (figures.contains(shape)){
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        return figures.get(n);
    }

    public void showFigures(){
        for(Shape i : figures){
            System.out.println(i.getShapeName());
        }
    }
}


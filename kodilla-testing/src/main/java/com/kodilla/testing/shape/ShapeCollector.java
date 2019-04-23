package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private Shape shape;
    ArrayList<Shape> figureList = new ArrayList<>();

    public ArrayList getFigureList() {
        return this.figureList;
    }

    public void addFigure(Shape shape){
        //do nothing
        figureList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (figureList.contains(shape)){
            figureList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        return figureList.get(n);
    }

    public void showFigures(){
        for(Shape i : figureList){
            System.out.println(i.getShapeName());
        }
    }
}


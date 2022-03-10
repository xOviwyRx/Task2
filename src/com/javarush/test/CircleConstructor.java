package com.javarush.test;

public class CircleConstructor {
    private float centerX, centerY, radius, width;
    private String color;

    public CircleConstructor(float _centerX, float _centerY, float _radius){
        this.centerX = _centerX;
        this.centerY = _centerY;
        this.radius = _radius;
    }

    public CircleConstructor(float _centerX, float _centerY, float _radius, float _width){
        this.centerX = _centerX;
        this.centerY = _centerY;
        this.radius = _radius;
        this.width = _width;
    }

    public CircleConstructor(float _centerX, float _centerY, float _radius, float _width, String _color){
        this.centerX = _centerX;
        this.centerY = _centerY;
        this.radius = _radius;
        this.width = _width;
        this.color = _color;
    }

}

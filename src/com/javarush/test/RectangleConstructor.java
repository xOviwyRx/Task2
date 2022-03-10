package com.javarush.test;

public class RectangleConstructor {
    private float top, left, width, height;
    public RectangleConstructor(float top, float left, float width, float height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public RectangleConstructor(float top, float left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public RectangleConstructor(float top, float left, float width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public RectangleConstructor(RectangleConstructor rect){
        this.top = rect.top;
        this.left = rect.left;
        this.width = rect.width;
        this.height = rect.width;
    }
}

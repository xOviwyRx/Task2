package com.javarush.test;

public class Solution25 {
    public static class Dog{
        private String name;
        private int heigth;
        private int width;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHeigth() {
            return heigth;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeigth(int heigth) {
            this.heigth = heigth;
        }
    }
    public static class Cat{
        private String name;
        private int heigth;
        private int width;
        Cat(String name, int height, int width){
            this.name = name;
            this.heigth = height;
            this.width = width;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHeigth() {
            return heigth;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeigth(int heigth) {
            this.heigth = heigth;
        }
    }
    public static class Mouse{
        private String name;
        private int heigth;
        private int width;

        Mouse(String name, int height, int width){
            this.name = name;
            this.heigth = height;
            this.width = width;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHeigth() {
            return heigth;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeigth(int heigth) {
            this.heigth = heigth;
        }
    }
    public static void main(String[] args){
        Mouse jerryMouse = new Mouse("Джерри", 12, 5);
        Cat cat = new Cat("Том", 30, 10);

    }
}

package com.company.oop;

public class Point {
    private float x;
    private float y;
    private String color;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(float x, float y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Point(String color) {
        this.color = color;
    }

    public float getDistance(Point endPoint) {
        double dX = endPoint.x - this.x;
        double dY = endPoint.y - this.y;

        float result = (float) Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));

        return result;
    }

    public int getQuarter() {
        int result = -1;
        if (x >= 0 && y >= 0) {
            result = 0;
        } else if (x >= 0 && y < 0) {
            result = 1;
        } else if (x < 0 && y < 0) {
            result = 2;
        } else if (x < 0 && y >= 0) {
            result = 3;
        }
        return result;
    }

    public boolean isSameQuarter(Point point) {
        boolean result = this.getQuarter() == point.getQuarter();
        return result;
    }

    @Override
    public boolean equals(Object point) {
        boolean result = false;
        Point temp = (Point) point;
        if (this.x == temp.x && this.y == temp.y && this.color.equals(temp.color)) {
            result = true;
        }

        return result;
    }
}

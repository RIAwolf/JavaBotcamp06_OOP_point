package com.company.oop;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public float length() {
        float result = this.start.getDistance(this.end);
        return result;
    }

    public int getStartQuarter() {
        return this.start.getQuarter();
    }

    public int getEndQuarter() {
        return this.end.getQuarter();
    }
}

package com.company;

import com.company.oop.Line;
import com.company.oop.Point;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Point a = new Point(4,3,"raudona");
        Point b = new Point(4,3,"raudona");
        Line line = new Line(a,b);

        System.out.println("Linija prasideda:"+line.getStartQuarter());
        System.out.println("Linija baigiasi:"+line.getEndQuarter());
        System.out.println("Linijos ilgis:"+line.length());
        System.out.println("Ar taskai tame paciame ketvirtyje:"+a.isSameQuarter(b));
        System.out.println("Ar taskai vienodi:"+a.equals(b));
    }
}

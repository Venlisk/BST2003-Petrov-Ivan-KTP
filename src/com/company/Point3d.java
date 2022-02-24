package com.company;


import static java.lang.Math.sqrt;
public class Point3d extends Point2d{

    private double zCoord;

    public Point3d (double x, double y, double z){
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d (){
        this (0.0, 0.0, 0.0);
    }


    public double getZ(){
        return zCoord;
    }

    public void setZ(double dote){
        zCoord = dote;
    }

    public double distanceTo(Point3d anotherPoint){
        return sqrt(Math.pow((this.xCoord - anotherPoint.getX()),2)
                +Math.pow(this.yCoord - anotherPoint.getY(),2)
                +Math.pow(this.zCoord - anotherPoint.getZ(),2));
    }

    public boolean compare(Point3d anotherPoint){
        return this.xCoord == anotherPoint.getX()
                && this.yCoord == anotherPoint.getY()
                && this.zCoord == anotherPoint.getZ();
    }
}

package com.company;

import java.util.Scanner;
public class Lab1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты по x первой точки: ");
        double x = in.nextDouble();
        System.out.println("Введите координаты по y первой точки: ");
        double y = in.nextDouble();
        System.out.println("Введите координаты по z первой точки: ");
        double z = in.nextDouble();
        Point3d dote3d = new Point3d(x, y, z);

        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите координаты по x второй точки: ");
        double x1 = in1.nextDouble();
        System.out.println("Введите координаты по y второй точки: ");
        double y1 = in1.nextDouble();
        System.out.println("Введите координаты по z второй точки: ");
        double z1 = in1.nextDouble();
        Point3d dote3d_1 = new Point3d(x1, y1, z1);

        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите координаты по x третьей точки: ");
        double x2 = in2.nextDouble();
        System.out.println("Введите координаты по y третьей точки: ");
        double y2 = in2.nextDouble();
        System.out.println("Введите координаты по z третьей точки: ");
        double z2 = in2.nextDouble();
        Point3d dote3d_2 = new Point3d(x2, y2, z2);

        if (dote3d.compare(dote3d_1)
                ||dote3d_1.compare(dote3d_2)
                ||dote3d_2.compare(dote3d)){
            System.out.println("Введены одинаковые значения " +
                    "координат точек, невозможно посчитать площадь");
        }
        else
        {
            System.out.printf("Площадь равна: "
                    +("%.2f"), computeArea(dote3d, dote3d_1, dote3d_2));
        }
    }

    public static double computeArea(Point3d dote3d,
                                     Point3d dote3d_1,
                                     Point3d dote3d_2){
        double a = dote3d.distanceTo(dote3d_1);
        double b = dote3d_1.distanceTo(dote3d_2);
        double c = dote3d_2.distanceTo(dote3d);
        double p = (a+b+c)/2;
        double s = Math.sqrt((p*(p-a)*(p-b)*(p-c)));
        return s;
    }
}

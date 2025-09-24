package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1
        float bobSalary = 95000;
        float garySalary = 87500;
        float highestSalary;
        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: " + highestSalary);

        //Question 2
        float carPrice = 95000;
        float truckPrice = 87500;
        float lowestPrice;
        lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is: " + lowestPrice);

        //Question 3
        float radiusCircle = 7.25;
        float circleArea = (float) (Math.pow(radiusCircle, 2) * Math.PI);
        System.out.println("The circle area is: " + circleArea);

        //Question 4

    }
}

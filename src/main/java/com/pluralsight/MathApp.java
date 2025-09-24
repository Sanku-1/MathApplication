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
        float radiusCircle = (float) 7.25;
        float circleArea = (float) (Math.pow(radiusCircle, 2) * Math.PI);
        System.out.println("The circle area is: " + circleArea);

        //Question 4
        float variableOne = (float) 5.0;
        float squareRootVariable = (float) Math.sqrt(variableOne);
        System.out.println("The square root of " + variableOne + " is: " + squareRootVariable);

        //Question 5
        int distanceXCoordinates = 5 - 85;
        int distanceYCoordinates = 10 - 50;
        float distanceBetweenPoints = (float) Math.hypot(distanceXCoordinates, distanceYCoordinates);
        System.out.println("The distance between the points at (5,10) and (85,50) is: " + distanceBetweenPoints);

        //Question 6
        float variableTwo = (float) -3.8;
        float absValueVariableTwo = (float) Math.abs(variableTwo);
        System.out.println("The absolute value of " + variableTwo + " is: " + absValueVariableTwo);

    }
}

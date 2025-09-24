package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1 Solution
        float bobSalary = 95000;
        float garySalary = 87500;
        float highestSalary;
        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("1. The highest salary is: " + highestSalary);

        //Question 2 Solution
        float carPrice = 95000;
        float truckPrice = 87500;
        float lowestPrice;
        lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("2. The lowest price is: " + lowestPrice);

        //Question 3 Solution
        float radiusCircle = (float) 7.25;
        float circleArea = (float) (Math.pow(radiusCircle, 2) * Math.PI);
        System.out.println("3. The circle area is: " + circleArea);

        //Question 4 Solution
        float variableOne = (float) 5.0;
        float squareRootVariable = (float) Math.sqrt(variableOne);
        System.out.println("4. The square root of " + variableOne + " is: " + squareRootVariable);

        //Question 5 Solution
        int distanceXCoordinates = 5 - 85;
        int distanceYCoordinates = 10 - 50;
        float distanceBetweenPoints = (float) Math.hypot(distanceXCoordinates, distanceYCoordinates);
        System.out.println("5. The distance between the points at (5,10) and (85,50) is: " + distanceBetweenPoints);

        //Question 6 Solution
        float variableTwo = (float) -3.8;
        float absValueVariableTwo = (float) Math.abs(variableTwo);
        System.out.println("6. The absolute value of " + variableTwo + " is: " + absValueVariableTwo);

        //Question 7 Solution
        double randomNumber = Math.random();
        System.out.println("7. The random number is: " + randomNumber);

        //Question 8 Solution
        byte countDays = 24;
        int countHours = countDays * 24;
        int countMinutes = countHours * 60;
        int countSeconds = countMinutes * 60;
        int countMilliseconds = countSeconds * 1000;

        System.out.println("8. The number of minutes in " + countDays + " days is " + countMinutes + " and the number of milliseconds is " + countMilliseconds);
    }
}

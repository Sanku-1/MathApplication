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
    }
}

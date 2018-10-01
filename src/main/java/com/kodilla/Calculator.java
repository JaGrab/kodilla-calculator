package com.kodilla;

public class Calculator {
    private double acumulator;

    public Calculator() {
        acumulator = 0;
    }
    public double getAcumulator() {
        return acumulator;
    }
    public void setAcumulator(double acumulator) {
        this.acumulator = acumulator;
    }
    public void add(double number) {
        acumulator += number;
    }
    public void subtract(double number) {
        acumulator -= number;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setAcumulator(-2.8);
        calculator.add(12.5);
        calculator.subtract(7.3);
        System.out.println("Calculator result: " + calculator.getAcumulator());
    }
}

package workshop.tests.exercises;

import service.MathService;

public class MathApp {

    private MathService mathService;

    public void setMathService(MathService mathService) {
        this.mathService = mathService;
    }

    public double multiply(int a, int b) {
        return mathService.multiply(a, b);
    }

    public double add(int a, int b) {
        return mathService.add(a, b);
    }

    public double minus(int a, int b) {
        return mathService.minus(a, b);
    }

    public double aggregate(int a, int b) {
        return mathService.multiply(a,b) - mathService.multiply(a,b);
    }

    public double addTimesTwo(int a, int b) {
        return mathService.add(a , b) + mathService.minus(a, b);
    }
}

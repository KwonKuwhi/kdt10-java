package _07_generic;


import _05_class._02_access_modifier._pack2.C;

class Calculator <T extends Number>{
    private T num1;
    private T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }



    public double add(){
        return num1.doubleValue() + num2.doubleValue();
    }


}
public class GenericPrac2 {
    public static void main(String[] args) {
        Calculator<Integer> integerCalculator = new Calculator<>(3,5);
        System.out.println("Integer Sum: " + integerCalculator.add());
        System.out.println("===========================================");
        Calculator<Double> doubleCalculator = new Calculator<>(3.0033,5.030);
        System.out.println("Double Sum: " + doubleCalculator.add());


    }
}

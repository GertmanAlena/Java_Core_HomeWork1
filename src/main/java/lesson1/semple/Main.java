package lesson1.semple;

import lesson1.mathOperations.*;

/**
 * вход в программу
 */
public class Main {
    public static void main(String[] args) {
        int resultDel = mathOper.del(10, 5);
        System.out.println(Decorator.decorator(resultDel));
        int resultSumSub = mathOper.subtraction(10, 5);
        System.out.println(Decorator.decorator(resultSumSub));
        int resultSum = mathOper.sum(10, 5);
        System.out.println(Decorator.decorator(resultSum));
        int resultMult = mathOper.mult(10, 5);
        System.out.println(Decorator.decorator(resultMult));

    }
}
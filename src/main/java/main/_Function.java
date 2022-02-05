package main;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(incrementByOne.andThen(multiplyByTen).apply(3));
        System.out.println(incrementByOneAndMultiplyBy.apply(3, 10));
    }

    // Function
    static Function<Integer, Integer> incrementByOne = number->number+1;
    static Function<Integer, Integer> multiplyByTen = number->number*10;

    // BiFunction
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBy =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
}

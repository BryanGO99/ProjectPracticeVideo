package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(5);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(5);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addByO1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println( addByO1AndThenMultiplyBy10.apply(4));

        //bifunction

        System.out.println(incrementByOneAndMultiply(4,100));

        System.out.println(incrementByOneAndMultiplyByFunction.apply(4,100));

    }


    static Function<Integer, Integer> incrementByOneFunction =
            number -> number+1;

    static Function<Integer,Integer> multiplyBy10Function = number -> number*10;


    static int incrementByOne (int number){
        return number+1;
    }

    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyByFunction =
            (numberToIncrementBy1,numberToMultiplyBy) -> (numberToIncrementBy1 +1) * numberToMultiplyBy;


    static int incrementByOneAndMultiply (int number,int numbToMultiplyBy){
        return (number+1) * numbToMultiplyBy;
    }
}

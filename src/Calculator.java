public class Calculator {
    public static <N extends Number> double sum(N number1, N number2){
        double doubleNumber1 = (double) number1;
        double doubleNumber2 = (double) number2;

        return doubleNumber1 + doubleNumber2;
    }

    public static <N extends Number> double multiply(N number1, N number2){
        double doubleNumber1 = (Double) number1;
        double doubleNumber2 = (Double) number2;

        return doubleNumber1 * doubleNumber2;
    }

    public static <N extends Number> double divide(N number1, N number2){
        double doubleNumber1 = (Double) number1;
        double doubleNumber2 = (Double) number2;

        return doubleNumber1 / doubleNumber2;
    }

    public static <N extends Number> double subtract(N number1, N number2){
        double doubleNumber1 = (Double) number1;
        double doubleNumber2 = (Double) number2;

        return doubleNumber1 - doubleNumber2;
    }
}

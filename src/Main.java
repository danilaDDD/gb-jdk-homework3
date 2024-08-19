public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};

        System.out.println(ArrayComparator.compareArray(array1, array2));

        Pair<Integer, Double> pair = new Pair<>(1, 2d);
        System.out.println(pair);
    }
}
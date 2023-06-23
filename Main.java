public class Main {
    public static void main(String[] args) {

        long[] sales = {15, 25, 30, 10};
        SalesManager sm = new SalesManager(sales);
        System.out.printf("Лучшая продажа: " + sm.max());

    }
}
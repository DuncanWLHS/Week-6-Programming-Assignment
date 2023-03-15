public class Main {
    public static void main(String[] args) {
        StatsCalculator testValues = new StatsCalculator(new double[]{2, 1, 3});
        System.out.println(testValues.calculateSum());
        testValues.printSorted();
        testValues.print();
        testValues.printFiveNumberSummary();
        System.out.println(testValues.calculateMean());
    }
}
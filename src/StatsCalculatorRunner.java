public class StatsCalculatorRunner {
    public static void main(String[] args) {
        StatsCalculator testValues = new StatsCalculator(new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0});
        testValues.print();
        testValues.sortData();
        testValues.printSorted();
        testValues.printFiveNumberSummary();
        System.out.println("The mean is " + testValues.calculateMean());
        System.out.println("The Sum is: " + testValues.calculateSum());

    }
}
public class Main {
    public static void main(String[] args) {
        StatsCalculator testValues = new StatsCalculator(new double[]{2, 1, 3, 4});
        System.out.println("The Sum is :" + testValues.calculateSum());
        testValues.print();
        testValues.printSorted();
        testValues.printFiveNumberSummary();
        System.out.println("The Mean is: " + testValues.calculateMean());
    }
}
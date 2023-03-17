/**
 * @file StatsCalculatorRunner.java
 * @Date 3/16/23
 * @Author Duncan Duffield
 *
 * @Description Statistic's Calculator Runner, which tests the Methods and Constructor in StatsCalculator.java.
 */
public class StatsCalculatorRunner {

    /**
     * @Description Creates the StatsCalculator object and test's the method associated with it.
     * @param args main argument.
     */
    public static void main(String[] args) {
        StatsCalculator testValues = new StatsCalculator(new double[]{10.0, 20.0, 5.0, 15.0, 25.0, 30.0, 8.0});
        testValues.print();
        testValues.sortData();
        testValues.printSorted();
        testValues.printFiveNumberSummary();
        System.out.println("The mean is " + testValues.calculateMean());
        System.out.println("The Sum is: " + testValues.calculateSum());

    }
}
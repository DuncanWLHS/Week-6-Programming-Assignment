import java.util.Arrays;

/**
 * @file StatsCalculator.java
 * @Date 3/16/23
 * @Author Duncan Duffield
 *
 * @Description Statistic's Calculator that calculates the Max, Min, Sum, Mean, First and Third Quartile, when given an array of doubles.
 */
public class StatsCalculator {

    /**
     * @Description Array of values given by the program.
     */
    private double[] values;

    /**
     * @Description Array that stores values sorted from ascending order (lowest -> highest).
     */
    private double[] sortedValues;

    /**
     * @Description Creates a default array with a size of 20.
     */
    public StatsCalculator() {
        this.values = new double[20];
    }

    /**
     * @Description Overloaded Constructor that takes in the array "values" from the runner class.
     * @param values array provided by object created in runner class.
     */
    public StatsCalculator(double[] values) {
        this.values = values;
    }

    /**
     * @Description Method that sorts the array "values" from ascending order (lowest -> highest).
     */
    public void sortData() {
        sortedValues = Arrays.copyOf(values, values.length);
        Arrays.sort(sortedValues);
    }

    /**
     * @Description Method that calculates the maximum value of an array.
     * @return the max value of the array.
     */
    public double calculateMax() {
        double max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    /**
     * @Description Method that calculates the minimum value of an array.
     * @return the minimum value of the array.
     */
    public double calculateMin() {
        double min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    /**
     * @Description Method that calculates the sum by adding every element in an array.
     * @return the sum of the array.
     */
    public double calculateSum() {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    /**
     * @Description Method that calculates the Mean/Average of an array by adding all the elements in an array
     * and dividing it by the length of the array.
     * @return the mean of the array.
     */
    public double calculateMean() {
        double mean = 0;
        for (int i = 0; i < values.length; i++) {
            mean += values[i];
        }
        return mean/values.length;
    }

    /**
     * @Description Method that calculates the Median of an array by sorting it and then confirming if the array has an
     * even number of elements, or an odd number of elements.
     *
     * @Condition If the array has an odd number of elements, the method divides the length of the array by 2,
     * to achieve the middle index, thus returning it.
     *
     * @Condition If the array has an even number of elements, the method divides the length of the array by 2,
     * and adds it to a divided length subtracted by 1, which then the method divides the sum by 2, returning the median.
     *
     * @return the median of the array.
     */
    public double calculateMedian() {
        Arrays.sort(values);
        double median = 0;
        if (values.length % 2 != 0) {
           median = values[values.length / 2];
            return median;
        } else {
            median = (values[values.length/2] + values[values.length/2 - 1])/2;
            return median;
        }

    }

    /**
     * @Description Method that calculates the First Quartile of an array by sorting it, then copying the range of the
     * first quartile into another array, thus determining if its odd or even.
     *
     * @Condition If the Quartile is odd, the method divides the length of the quartile by 2, thus returning its median.
     *
     * @Condition If the Quartile is even,the method divides the length of the array by 2, and adds it to a divided
     * length subtracted by 1, which then the method divides the sum by 2, returning the median.
     *
     * @return The first quartile of the array.
     */
    public double calculateFirstQuartile() {
        Arrays.sort(values);
        double[] quartileOne = new double[values.length / 2];

        // copies first quartile of values into quartileOne
        for (int i = 0; i < quartileOne.length - 1; i++) {
            quartileOne[i] = values[i];
        }
        // Searching for Median in Quartile 1
        if (quartileOne.length % 2 == 1) {
            return quartileOne[quartileOne.length/2];
        } else {
            return (quartileOne[quartileOne.length / 2] + quartileOne[quartileOne.length / 2 - 1]) / 2;
        }
    }

    /**
     * @Description Method that calculates the Third Quartile of an array.
     * @return the third quartile of the array.
     */
    public double calculateThirdQuartile() {
        double[] quartileThree;

        if (values.length % 2 == 1) {
            quartileThree = new double[values.length / 2];

            int quartileThreeIndex = 0;
            for (int i = values.length / 2 + 1; i < values.length; i++) {
                quartileThree[quartileThreeIndex] = values[i];
                quartileThreeIndex++;
            }
                return quartileThree[quartileThree.length / 2];

        } else {
            quartileThree = new double[values.length / 2];
            int quartileThreeIndex = 0;
            for (int i = values.length / 2; i < values.length - 1; i++) {
                quartileThree[quartileThreeIndex] = values[i];
                quartileThreeIndex++;
            }
                return quartileThree[quartileThree.length / 2];
        }
    }

    /**
     * @Description Method that prints out the raw values of an array with the format of #.#, #.#, etc.
     */
    public void print() {
        System.out.print("Your data is: ");
        for(double value: values){
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    /**
     * @Description Method that prints the sorted values of an array with the format of #.#, #.#, etc.
     */
    public void printSorted() {
        System.out.print("Your sorted data is: ");
        this.sortData();
        for(double value: sortedValues){
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    /**
     * @Description Method that prints out the Min, First Quartile, Median, Third Quartile, and Max, in the format of a list.
     */
    public void printFiveNumberSummary() {
        System.out.println("The five number summary is: \n" +
                " \t Minimum: " + this.calculateMin() + "\n" +
                " \t First Quartile: " + this.calculateFirstQuartile() + "\n" +
                " \t Median: " + this.calculateMedian() + "\n" +
                " \t Third Quartile: " + this.calculateThirdQuartile() + "\n" +
                " \t Maximum: " + this.calculateMax());
    }
}

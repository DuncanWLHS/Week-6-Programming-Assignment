import java.util.Arrays;

public class StatsCalculator {

    private double[] values;
    private double[] sortedValues;

    public StatsCalculator() {
        this.values = new double[20];
    }

    public StatsCalculator(double[] values) {
        this.values = values;
    }

    public void sortData() {
        Arrays.sort(values);
    }

    public double calculateMax() {
        double max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public double calculateMin() {
        double min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public double calculateSum() {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public double calculateMean() {
        double mean = 0;
        for (int i = 0; i < values.length; i++) {
            mean += values[i];
        }
        return mean/values.length;
    }

    public double calculateMedian() {
        Arrays.sort(values);
        double median = 0;
        if (values.length % 2 == 0) {
            int indexFirst = ((values.length / 2) -1);
            int indexSecond = (indexFirst + 1);
            median = (values[indexFirst]+values[indexSecond] / 2);
            median /= 2;

        }
        return median;
    }

    public void print() {
        System.out.print("Your data is: ");
        for(double value: values){
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    public void printSorted() {
        System.out.print("Your sorted data is: ");
        Arrays.sort(values);
        for(double value: values){
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    public void printFiveNumberSummary() {
        System.out.println("The five number summary is: \n" +
                "Minimum: " + this.calculateMin() + "\n" +
                "Median: " + this.calculateMedian() + "\n" +
                "Maximum: " + this.calculateMax());
    }
}

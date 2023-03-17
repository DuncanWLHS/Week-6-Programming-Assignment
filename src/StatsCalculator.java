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
        sortedValues = Arrays.copyOf(values, values.length);
        Arrays.sort(sortedValues);
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
        if (values.length % 2 != 0) {
           median = values[values.length / 2];
            return median;
        } else {
            median = (values[values.length/2] + values[values.length/2 - 1])/2;
            return median;
        }

    }

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
            return (quartileOne[quartileOne.length / 2] + quartileOne[quartileOne.length / 2 -1]) / 2;
        }
    }

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


    public void print() {
        System.out.print("Your data is: ");
        for(double value: values){
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    public void printSorted() {
        System.out.print("Your sorted data is: ");
        this.sortData();
        for(double value: sortedValues){
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    public void printFiveNumberSummary() {
        System.out.println("The five number summary is: \n" +
                " \t Minimum: " + this.calculateMin() + "\n" +
                " \t First Quartile: " + this.calculateFirstQuartile() + "\n" +
                " \t Median: " + this.calculateMedian() + "\n" +
                " \t Third Quartile: " + this.calculateThirdQuartile() + "\n" +
                " \t Maximum: " + this.calculateMax());
    }
}

import java.util.Arrays;

public class StatsCalculator {

    private double[] values;
    private double[] sortedValues;

    public double[] StatsCalculator(){
        double[] arr = new double[20];
        return arr;
    }

    public double[] StatsCalculator(double[] values) {
        this.values = values;
        return values;
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



}

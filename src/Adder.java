public class Adder {
    private double latestSum;

    public Adder()
    {
        latestSum = 0.0;
    }

    public double add(double num1, double num2)
    {
        double sum = num1 + num2;
        setLatestSum(sum);
        return sum;
    }

    public double add(double num1)
    {
        double sum = getLatestSum();
        sum = sum + num1;
        setLatestSum(sum);
        return sum;
    }

    private void setLatestSum(double ls)
    {
        latestSum = ls;
    }

    public double getLatestSum()
    {
        return latestSum;
    }
}

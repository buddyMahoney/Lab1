public class Adder {
    private double latestSum;

    public Adder()
    {
        latestSum = 0.0;
    }

    public double add(double num1, double num2)
    {
        //double sum = latestSum;
        latestSum = num1 + num2;
        return latestSum;
    }

    public double add(double num1)
    {
        //double sum = latestSum
        latestSum = latestSum + num1;
        return latestSum;
    }
}

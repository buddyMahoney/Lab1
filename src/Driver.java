public class Driver {
    public static void main(String[] args)
    {
        Adder adder = new Adder();

        double result = adder.add(2.5, 3.5);
        System.out.println("Answer: " + result);
        assert(result == 6.0);

        result = adder.add(10.0);
        System.out.println("Answer: " + result);
        assert(result == 16.0);

        result = adder.add(100.0, 100.0);
        System.out.println("Answer: " + result);
        assert(result == 200.0);

        result = adder.add(10.0);
        System.out.println("Answer: " + result);
        assert(result == 210.0);
    }
}

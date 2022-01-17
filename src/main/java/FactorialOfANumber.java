public class FactorialOfANumber {
    private final int number;
    public FactorialOfANumber(int number) {
        this.number = number;
    }

    public int factorialOfANumber() {
        int i, factorial = 1;
        if (number == 0 || number == 1)
            return factorial;
        for (i = 2; i<=number; i++)
        {
            factorial *= i;
        }
        return factorial;
    }
}

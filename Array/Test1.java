package Array;
class Test1{
    public static void main(String[] args) {
        int count = 0;
        int start = 1;
        int end = 79;

        for (int number = start; number <= end; number++) {
            int tensDigit = number / 10;
            int onesDigit = number % 10;

            if (tensDigit == onesDigit) {
                count++;
                System.out.print(number + " ");
            }
        }

        System.out.println("\nTotal numbers with the same digits: " + count);
    }
}
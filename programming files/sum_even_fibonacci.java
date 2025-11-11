public class sum_even_fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 2;
        int sumEven = 0;
        while (c < 4000000) {
            if (c % 2 == 0) {
                sumEven += c;
            }
            int temp2 = c;
            int temp1 = b;
            c = a + b + c;
            a = temp1;
            b = temp2;
        }
        System.out.println(sumEven);
    }
}

// answer should be 4613732

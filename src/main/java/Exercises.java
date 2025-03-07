public class Exercises {

    public boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (long i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public long fibonacciIndex(long num) {
        if (num < 0) {
            return -1;
        }
        long x = 0, y = 1, z = 1;
        long index = 0;
        while (x <= num) {
            if (x == num) {
                return index;
            }
            x = y;
            y = z;
            z = x + y;
            index++;
        }
        return -1;
    }

    public char[][] generateTriangle(int num) {
        if (num <= 0) {
            return new char[0][0];
        }
        char[][] triangle = new char[num][];
        for (int i = 0; i < num; i++) {
            triangle[i] = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == num - 1) {
                    triangle[i][j] = '*';
                } else {
                    triangle[i][j] = ' ';
                }
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        // You can test your code here, but then it should be checked with test cases

    }
}
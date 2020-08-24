import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        int primeNumber = 2;

        Scanner userInput = new Scanner(System.in);
        int range = userInput.nextInt();

        boolean[] numbers = new boolean[range + 1];

        //turn all value to true
        //In this position, all numbers are handled as prime numbers
        for(int index = 0; index <= numbers.length - 1; index++) {
            numbers[index] = true;
        }

        //if prime number, the true else nothing
        for(int index = primeNumber; index <= numbers.length - 1; index++) {
            //if a number is a prime number, then remove all other numbers which is multiplication from this number
            if(numbers[index]) {
                for(int tempIndex = index + 1; tempIndex <= numbers.length - 1;tempIndex++) {
                    if(numbers[tempIndex]) {
                        if(tempIndex % index == 0) {
                            numbers[tempIndex] = false;
                        }
                    }
                }
            }
            if(numbers[index]) {
                System.out.println(index);
            }
        }
    }
}
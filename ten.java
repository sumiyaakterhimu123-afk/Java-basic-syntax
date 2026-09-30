public class ten {
    
    public static void main(String[] args) {

        int number = 2;
        int sum = 0;

        while (number <= 20) {
            sum = sum + number;
            number = number + 2;
        }

        System.out.println("Sum of even numbers from 2 to 20: " + sum);

    }
}


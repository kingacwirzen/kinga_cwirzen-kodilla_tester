import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();
        int result = 0;
        int sum = 0;
        int min = 0;
        int max = 30;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            System.out.println(temp);
            result++;
        }
        int temp;
            {
                for (temp = 0; temp < min; temp++) ;
                System.out.println("Najmniejsza wartosc to: " + temp);
                for (temp = 30; temp > max; temp++) ;
                System.out.println("Najwiksza wartosc to: " + temp);
                return;
            }

    }
}





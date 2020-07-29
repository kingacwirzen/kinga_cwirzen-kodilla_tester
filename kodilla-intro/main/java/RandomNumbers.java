import java.util.Random;

public class RandomNumbers {
    public static int main(String[] args) {

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

            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }

        }
    }

}






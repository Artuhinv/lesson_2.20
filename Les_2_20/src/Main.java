import java.util.Random;

public class Main {
    public static void main(String[] args){
        int[] arr = new int[20];
        Random random = new Random();
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1 && count < 5) {
                System.out.println("Число '" + arr[i] + "' встречается " + count + " раза");
            } else if(count > 4){
                System.out.println("Число '" + arr[i] + "' встречается " + count + " раз");
            }
        }
    }
}
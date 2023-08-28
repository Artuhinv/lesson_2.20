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

        boolean[] check = new boolean[16];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (!check[arr[i]]) {
                if (count > 1) {
                    if (count < 5) {
                        System.out.println("Число '" + arr[i] + "' встречается " + count + " раза");
                    } else {
                        System.out.println("Число '" + arr[i] + "' встречается " + count + " раз");
                    }
                }
                check[arr[i]] = true;
            }
        }
    }
}
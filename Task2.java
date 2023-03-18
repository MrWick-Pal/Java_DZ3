import java.util.ArrayList;
import java.util.Random;

public class Task2 {

    private static void FillArr(ArrayList<Integer> arr) {

        System.out.println();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(1, 10));
        }

        System.out.println("Сформированный список: " + arr);

    }

    private static void FilterArr(ArrayList<Integer> arr){
        System.out.println();
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i) % 2 == 0){
                arr.remove(i);
                i--;
            }
        }
        System.out.println("Список после удаления четных чисел: " + arr);
    }

    public static void main(String[] args) {
        System.out.println("Данная программа создает список и удаляет из него все четные числа.");
        ArrayList<Integer> numbers = new ArrayList<>();
        FillArr(numbers);
        FilterArr(numbers);
    }
}
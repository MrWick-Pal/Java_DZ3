import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    
    private static void mergeSort(ArrayList<Integer> arr) {
        int len = arr.size();
        if (len == 1)
            return;
        int mid = len / 2;
        int lsize = mid;
        int rsize = len - mid;
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();

        for (int i = 0; i < lsize; i++) {
            left.add(arr.get(i));
        }

        for (int i = 0; i < rsize; i++) {
            right.add(arr.get(mid + i));
        }

        mergeSort(left);
        mergeSort(right);
        recovering(arr, left, right);

    }
    

    private static void recovering(ArrayList<Integer> arr, ArrayList<Integer> left, ArrayList<Integer> right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int lleft = left.size();
        int rright = right.size();
        while (i < lleft && j < rright) {
            if (left.get(i) < right.get(j)) {
                arr.set(k, left.get(i));
                i++;
            } else {
                arr.set(k, right.get(j));
                j++;
            }
            k++;
        }
        while (i < lleft) {
            arr.set(k, left.get(i));
            i++;
            k++;
        }
        while (j < rright) {
            arr.set(k, right.get(j));
            j++;
            k++;
        }
    }
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Данная программа создает список и сортирует его методом слияния.");
        System.out.println();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr.add(random.nextInt(1, 11));
        }
        System.out.println("Созданный список: " + arr);
        System.out.println();
        mergeSort(arr);
        System.out.println("Отсортированный список: " + arr);
    }

    
}
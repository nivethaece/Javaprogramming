import java.util.*;

class Task4 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        // 1. clone()
        int copy1[] = arr.clone();

        // 2. Arrays.copyOf()
        int copy2[] = Arrays.copyOf(arr, arr.length);

        // 3. System.arraycopy()
        int copy3[] = new int[arr.length];
        System.arraycopy(arr, 0, copy3, 0, arr.length);

        // Display all
        System.out.println("Clone Copy:");
        for(int i : copy1) {
            System.out.print(i + " ");
        }

        System.out.println("\nArrays.copyOf:");
        for(int i : copy2) {
            System.out.print(i + " ");
        }

        System.out.println("\nSystem.arraycopy:");
        for(int i : copy3) {
            System.out.print(i + " ");
        }
    }
}
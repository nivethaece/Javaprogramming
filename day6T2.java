import java.util.*;
class arr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] cp1 = arr.clone();
        int[] cp2 = Arrays.copyOf(arr, arr.length);
        int[] cp3 = new int[arr.length];
        System.arraycopy(arr, 0, cp3, 0, arr.length);
        System.out.println("Clone Array:");
        for(int i = 0; i < cp1.length; i++) {
            System.out.print(cp1[i] + " ");
        }

        // print copyOf
        System.out.println("\nCopyOf Array:");
        for(int i = 0; i < cp2.length; i++) {
            System.out.print(cp2[i] + " ");
        }

        // print arraycopy
        System.out.println("\nArrayCopy:");
        for(int i = 0; i < cp3.length; i++) {
            System.out.print(cp3[i] + " ");
        }
    }
}

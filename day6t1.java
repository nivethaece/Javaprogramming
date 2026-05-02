import java.util.*;

class array{
    public static void main(String[] args) {

        int arr[] = {5, 3, 8, 1};

        //Sorting
        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        for(int i : arr)
            System.out.print(i + " ");

        // Searching
        int key = 3;
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                System.out.println("\nFound at index: " + i);
                found = true;
                break;
            }
        }

        if(!found)
            System.out.println("\nNot Found");
    }
}
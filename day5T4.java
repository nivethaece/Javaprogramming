import java.util.ArrayList;
class arrlist{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
        arr.set(2,4);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
    }
}
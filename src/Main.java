import java.util.Arrays;

public class Main {
    public static <T> void swap(T[]arr, int index, int index2){
    T temp = arr[index];
    arr[index]= arr[index2];
    arr[index2] = temp;
    }
  static  String[] numbers = {"раз", "два", "три", "четыре"};
    static Integer[] nums = {1,2,3,4,5};

    public static void main(String[] args) {
        swap(numbers, 1, 2);
        System.out.println(Arrays.toString(numbers));
        swap(nums, 1, 2);
        System.out.println(Arrays.toString(nums));

    }
}

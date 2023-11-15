import java.util.Arrays;

public class Ary {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // reference type
        int[] amount = { 2, 3, 4, 5, 6};


        numbers[0] = 1;
        numbers[1] = 11;

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        //System.out.println(numbers); error
        System.out.println(amount.length);
    }
}

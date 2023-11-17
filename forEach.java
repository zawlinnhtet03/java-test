public class forEach {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Orange", "Mango" };

        for (int i = fruits.length; i > 0; i--) {
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

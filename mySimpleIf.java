public class mySimpleIf {
    public static void main(String[] args) {
        int income = 120_000;
        boolean hasHighIncome = (income > 120_000); // Mostly preferred
        // if (income > 100_000) {
        //     hasHighIncome = true;
        // } else {
        //     hasHighIncome = false;
        // }
        System.out.println(hasHighIncome);
    }
}

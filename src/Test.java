public class Test {
    public static void main(String[] args) {

        int[] testTab = {5,10,15,20,25};
        int[] revTab = Metody.reverseOrder(testTab);
        System.out.println(revTab);

        int[] tab1 = new int[10];
        Metody.random(tab1);
        System.out.println(tab1);
    }
}

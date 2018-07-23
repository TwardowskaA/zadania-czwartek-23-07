import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] testTab = {5,10,15,20,25};
        int[] revTab = Metody.reverseOrder(testTab);
        System.out.println(Arrays.toString(revTab));

        int[] tab1 = new int[10];
        Metody.random(tab1);
        System.out.println(Arrays.toString(tab1));

        int[] tab2 = {1,1,2,3,4};
        int counts = Metody.tab2(tab2,1);
        System.out.println(counts);
    }
}

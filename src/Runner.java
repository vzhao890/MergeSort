public class Runner {
    public static void main(String[] args) {
        int[] x = {0, 342, 62, 35, 7547, 2, 12342, 3, 25};
        for (int i = 0; i < x.length; i ++) {
            System.out.println(x[i]);
        }
        MergeSort.mergeSort(x);

        for (int i = 0; i < x.length; i ++) {
            System.out.println(x[i]);
        }
    }
}
public class dz {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 6, 5, 6};
        int index = 0;
        int result = 0;

        result = getSum(array, result);

        index = getIndex(array, result);

        if (index < 0){
            System.out.println("NO NO");
        } else {
            System.out.println("Index = " + index + " Yes");
        }
    }

    private static int getIndex(int[] array, int sum) {
        int half = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println((sum - array[i]) / 2);
            if (half == (sum - array[i]) / 2) {
                return i;
            }
            half += array[i];
        }
        return -1;
    }

    private static int getSum(int[] array, int sum) {
        for (int j : array) {
            sum += j;
        }
        return sum;
    }
}

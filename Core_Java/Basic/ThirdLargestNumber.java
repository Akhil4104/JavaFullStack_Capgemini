package Basic;
public class ThirdLargestNumber {
    public static void main(String[] args) {

        int arr[] = {1, 5, 8, 10, 15, 4, 12, 11, 13};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third && arr[i] != first && arr[i] != second) {
                third = arr[i];
            }
        }

        System.out.println("Third Largest Element: " + third);
    }
}

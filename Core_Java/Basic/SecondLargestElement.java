package Basic;
public class SecondLargestElement {
    public static void main(String[] args) {

        int arr[] = {1, 5, 8, 10, 15, 4, 12, 11, 13};

        int mx = Integer.MIN_VALUE;
        int smx = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > mx) {
                smx = mx;
                mx = arr[i];
            }
            else if (arr[i] > smx && arr[i] != mx) {
                smx = arr[i];
            }
        }

        System.out.println("Second Largest Element: " + smx);
    }
}

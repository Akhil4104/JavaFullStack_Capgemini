package Basic;
public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,5,9,8,10,15};
		int mx=0;
		for(int i=0;i<arr.length;i++) {
			mx=Math.max(mx, arr[i]);
		}
		System.out.println("Largest Element in array: "+mx);
		

	}

}

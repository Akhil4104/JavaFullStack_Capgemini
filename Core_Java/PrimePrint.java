public class PrimePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,5,7,12};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int curr=arr[i];
			if(checkPrime(curr)) {
				System.out.println(curr+" Is a Prime Number");
			}
			else {
				System.out.println(curr+" Is not a Prime Number");
			}
		}
	}
	public static boolean checkPrime(int curr) {
		for(int i=2;i<curr;i++) {
			if(curr%i==0) {
				return false;
			}
		}
		return true;
	}

}

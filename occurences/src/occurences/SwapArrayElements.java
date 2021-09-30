package occurences;

public class SwapArrayElements {

	public static void main(String[] args) {
		int arr[]= {3,26,7,8};
		int b[]= {2,6,8,9};
		int i,j;
		int temp;
		//swapping of two array elements
		for(i=0;i<arr.length;i++) {
			System.out.println("before swapping values arr["+i+"]="+arr[i]);
			for(i=0;i<b.length;i++) {
				System.out.println("before swapping values b["+i+"]="+b[i]);
				temp=arr[i];
				arr[i]=b[i];
				b[i]=temp;	
				System.out.println("After swapping values b["+i+"]="+b[i]);
				System.out.println("After swapping values arr["+i+"]="+arr[i]);
			}
		}
	}
}
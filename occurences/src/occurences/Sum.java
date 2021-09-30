package occurences;

public class Sum {
	public static void main(String args[]) {
		int arr[]= {4,6,2,1,5,3};
		int sum=0;
		//sum of array elements whose sum is equal to 9
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				sum=arr[i]+arr[j];
				if(sum==9)
					System.out.println(arr[i]+"+" +arr[j]+"="+sum);
			}
		}
	}
}


public class sumClosestToZero {
	public static void sumClosestTo0(int []arr, int size) {
		
		int first=0,second=0,currSum;
		int sum=Integer.MAX_VALUE;
		
		for(int i=0;i<size-1;i++) {
			for(int j=i;j<size;j++) {
				currSum=Math.abs(arr[i]+arr[j]);
				if(sum>currSum) {
					sum=currSum;
					first=i;
					second=j;
				}
			}
		}
		System.out.println("CLOSEST PAIR :: "+first+" :: "+second);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,-12,3,-4,-3};
		sumClosestTo0(arr,arr.length);

	}

}

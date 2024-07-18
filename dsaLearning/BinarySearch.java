package dsaLearning;

public class BinarySearch {
public static void main(String[] args) {
	int[] nums= {10,20,30,40,50,66,88,62,89};
	int target = 100;
	int result=binaryRecursive(nums, target, 0, nums.length-1);
	if(result!=-1)
		System.out.println("Element is found in the index of "+result);
	else
		System.out.println("Element is not found in the given array");
}
public static int binaryRecursive(int[] nums, int target, int start, int end) {
	
	while(start<=end) {
		int mid=(start+end)/2;
		if(nums[mid]==target)
			return mid;
		else if(nums[mid]<target)
			return binaryRecursive(nums, target, mid+1, end);
		else if(nums[mid]>target)
			return binaryRecursive(nums, target, start, mid-1);
	}
	return -1;
}
}

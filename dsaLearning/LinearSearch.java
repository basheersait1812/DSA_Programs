package dsaLearning;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nums[] = {5,7,9,12,15} ;
		int target = sc.nextInt();
		int result = linearSearch(nums , target);
		if(result!=-1)
			System.out.println("Element found in the index of "+result);
		else
			System.out.println("Element not found");
			

	}
	public static int linearSearch(int[] nums , int target) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target)
				return i;
		}
		return -1;
	}

}

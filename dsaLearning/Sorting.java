package dsaLearning;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,7,1,3,2,6,4};
		int temp=0;
		System.out.println("Before Sorting......");
		for(int num:nums)
			System.out.print(num+" ");
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
			System.out.println();
			for(int num:nums)
				System.out.print(num+" ");
		}
		
		System.out.println();
		System.out.println("After Sorting");
		for(int num:nums)
			System.out.print(num+" ");

	}

}

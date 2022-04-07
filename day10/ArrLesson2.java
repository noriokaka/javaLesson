public class ArrLesson2{
	public static void main(String args){
		int nums[] = new int[5];
		System.out.println(nums[0]);
		System.out.println(nums.length);
		nums[0] = 100;
		nums[4] = 150;//data.length-1
		nums[2] = 120;
		nums[1] = nums[2] - nums[0];
		System.out.println(nums[1]);
	}
}

package basics;

public class MinMaxAvg {

	public static void main(String[] args) {
		int[] numbers = {2, 4, 6, 1, 5};
		
		int min = findMin(numbers);
		int max = findMax(numbers);
		double avg = findAvg(numbers);
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Avg: " + avg);

	}
	public static int findMin(int[] nums) {
		int min = nums[0];
		for (int num: nums) {
			if(num < min) {
				min = num;
			
			}
		}
		return min;
		
	}
	public static int findMax(int[] nums) {
		int max = nums[0];
		for (int num: nums) {
			if (num > max) {
				num = max;
			}
		}
		return max;
	}
	public static double findAvg(int[] nums) {
		int sum = 0;
		for (int num: nums) {
			sum += num;
		}
		return (double) sum / nums.length;
	}

}

package programmingAssignment;

import java.util.Arrays;

public class nthLargestnthSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,9,23,12};
		int largest = 3;
		int smallest = 2;
		Arrays.sort(arr);
		System.out.println("3rd largest number is "+arr[arr.length-largest]);
		System.out.println("2nd smallest number is "+arr[smallest-1]);
	}

}

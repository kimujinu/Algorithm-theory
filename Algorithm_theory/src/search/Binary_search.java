package search;

import java.util.Arrays;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {1,2,3,4,5,6,7,8,9};
		binary_search(array,4);
	}

	public static void binary_search(int[] array, int search) {
		int middle = 0;
		int left = 0;
		int right = array.length-1;
		
		while(right>=left) {
			middle = (right+left)/2;
			
			if(search == array[middle]) {
				System.out.println("값은 : "+ middle + "번 째에 있다.");
			}
			
			if(search < array[middle]) {
				right = middle - 1;
			}else {
				left = middle +1;
			}
		}
	}
}

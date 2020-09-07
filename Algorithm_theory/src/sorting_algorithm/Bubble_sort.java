package sorting_algorithm;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[]{5,2,3,1,4,6};
		
		for(int i=0;i<data.length-1;i++) {
			for(int j=0;j<data.length-i-1;j++) {
				if(data[j]>data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		for(int a : data) {System.out.print(a+" ");}
	}

}

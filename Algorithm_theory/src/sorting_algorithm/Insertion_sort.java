package sorting_algorithm;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[]{5,2,9,8,3,1,4,6};
		
		for(int i=1;i<data.length;i++) {
			for(int j=i;j>0;j--) {
				if(data[j]<data[j-1]) {
					int temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
				}else {
					break;
				}
			}
		}
		for(int a : data) {System.out.print(a+" ");}
	}

}

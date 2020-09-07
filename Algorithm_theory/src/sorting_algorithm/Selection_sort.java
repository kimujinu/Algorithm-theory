package sorting_algorithm;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[]{5,2,3,1,4,6,0};
		
		for(int i=0;i<data.length-1;i++) {
			int lowest = i;
			for(int j=i+1;j<data.length;j++) {
				if(data[lowest] > data[j]) {
					lowest = j;
				}
			}
			int temp = data[lowest];
			data[lowest] = data[i];
			data[i] = temp; 
		}
		for(int a : data) {System.out.print(a+" ");}
	}

}

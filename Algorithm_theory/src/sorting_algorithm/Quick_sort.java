package sorting_algorithm;

public class Quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[]{5,2,3,1,4,6,0};
		quick_sort(data,0,data.length-1);
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+" ");
		}
		
	}
	
	public static void quick_sort(int[] data,int start, int end) {
		
		int left = start;
		int right = end;
		int pivot = data[(left+right)/2];
		
		do {
			while(data[left]<pivot) {
				left++;
			}
			while(data[right]>pivot) {
				right--;
			}
		 
		 
		if(left<=right) {
			int temp = data[left];
			data[left] = data[right];
			data[right] = temp;
			left++;
			right--;
		}
		}while(left<=right);
		
		if(start<right) {
			quick_sort(data,start,right);
		}
		if(end>left) {
			quick_sort(data,left,end);
		}
	}

}

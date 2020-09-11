package sorting_algorithm;

public class Merge_sort {
	
	static int[] list = new int[] {1,9,8,5,4,2,3,7,6};
	static int[] temp = new int[list.length];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a : list) {System.out.print(a+" ");}
		System.out.println();
		merge_sort(0,list.length-1);
		for(int a : list) {System.out.print(a+" ");}
	}
	
	public static void merge_sort(int start,int end) {
		if(start<end) {
			int middle = (start+end)/2;
			merge_sort(start,middle);
			merge_sort(middle+1,end);
			
			int p = start;
			int q = middle + 1;
			int idx = p;
			
			while(p<=middle || q<=end) {
				if(q>end || (p<=middle && list[p]<list[q])) {
					temp[idx++] = list[p++];
				}else {
					temp[idx++] = list[q++];
				}
			}
			
			for(int i=start;i<=end;i++) {
				list[i] = temp[i];
			}
			
		}
	}

}

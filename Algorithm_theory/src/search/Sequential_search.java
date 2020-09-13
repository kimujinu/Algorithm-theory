package search;

public class Sequential_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {1,4,2,3,6,7,8,5};
		sequential_search(array,6);
	}
	
	public static void sequential_search(int[] array, int search) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==search) {
				System.out.println(array[i]+"의 값은"+i+"번째에 있다.");
			}else {
				System.out.println("존재 하지 않음");
			}
		}
	}

}

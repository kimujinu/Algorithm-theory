package recursive_call_algorithm;

public class Recursive_call_sample {
	static int[] array = new int[]{72,50,8,38,77,32,90,48,74,79};

	/*
	 * �Ϲ����� ���� 1
	 * public ### factorial(### input){
	 * 		if(input> sample input){
	 * 			return factorial(input-1);
	 * 		}else {
	 * 			return sample input or input 
	 * 		}
	 * }
	 * 
	 *  �Ϲ����� ���� 2
	 * public ### factorial(### input){
	 * 		if(input<=sample input){
	 *		 	return sample input or input 
	 * 		}
	 * 		factorial(input���� ���� ��);
	 * 		return �����
	 * }	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("�Ϲ����� ���� : "+factorial(i));
			System.out.println("�Ϲ����� ����2"+factorial2(i));
		}
		
		
			System.out.println("1���� 10������ �� : "+factorial3(10));
			System.out.println("���� num�� �޾� 1�� �Ǵ� ���� : ");
			System.out.println(factorial4(3));
			System.out.println("���� 5�� 1,2,3�� �������� ��Ÿ���� ��� : "+factorial5(5));


	}
	
	public static int factorial(int num) {
		if(num>1) {
			return num * factorial(num-1);
		}else {
			return num;
		}
	}
	
	public static int factorial2(int num) {
		if(num<=1) {
			return num; 
		}
		return num * factorial2(num-1);
	}
	
	public static int factorial3(int num) {
		if(num<=1) {
			return num; 
		}
		
		return num * factorial3(num-1);
	}
	
	public static int factorial4(int num) {
		System.out.println(num);
		if(num==1) {
			return num; 
		}
		
		if(num % 2 == 1) {
			return (factorial4((3*num)+1));
		}else {
			return (factorial4(num/2));
		}
	}
	
	public static int factorial5(int num) {
		if(num==1) {
			return 1; 
		}else if(num==2) {
			return 2;
		}else if(num ==3) {
			return 4;
		}
		
		return factorial5(num-1)+factorial5(num-2)+factorial5(num-3);
	}
	
	
}

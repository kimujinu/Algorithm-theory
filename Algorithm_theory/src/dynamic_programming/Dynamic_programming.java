package dynamic_programming;

public class Dynamic_programming {
	
	/*
	 * 동적 계획법(DP) :
	 * 입력 크기가 작은 부분 문제들을 해결한 후, 해당 부분 문제의 해를 활용해서, 보다 큰 크기의 부분 문제를 해결, 최종적으로 전체 문제를 해결하는 알고리즘
	 * 상향식 접근법으로 가장 최하위 해답을 구한 후, 이를 저장하고, 해당 결과값을 이용해서 상위 문제를 풀어가는 방식
	 * Memoization 기법 사용 : 프로그램 실행 시 이전에 계산한 값을 저장하여, 다시 계산하지 않도록 하여 전체 실행 속도를 빠르게 하는 기술
	 * 문제를 잘게 쪼갤 때, 부분 문제는 중복되어, 재활용됨 ex) 피보나치 수열
	 */
	
	/*
	 * 분할 정복 :
	 * 문제를 나눌 수 없을 때까지 각각을 풀면서 다시 합병하여 문제의 답을 얻는 알고리즘
	 * 하향식 접근법으로, 상위의 해답을 구하기 위해, 아래로 내려가면서 하위의 해답을 구하는 방식 ex) 재귀함수
	 * 문제를 잘게 쪼갤 때, 부분 문제는 서로 중복되지 않음 ex)병합 정렬, 퀵 정렬..
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo_recursive(4));
		System.out.println(fibo_dp(4));

	}
	
	public static int fibo_recursive(int num) {
		if(num<=1) {
			return num;
		}
		
		return fibo_recursive(num-1) + fibo_recursive(num-2);
	}
	
	public static int fibo_dp(int num) {
		int[] cache = new int[num+1];
		cache[0] = 0;
		cache[1] = 1;
		
		for(int i=2;i<num+1;i++) {
			cache[i] = cache[i-1]+cache[i-2];
		}
		
		return cache[num];
	}

}

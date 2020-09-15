package greedy_algorithm;

public class Greedy_algorithm {
	
	//여러 경우 중 하나를 결정해야할 때마다, 매순간 최적이라고 생각되는 경우를 선택하는 방식으로 진행해서, 최종적인 값을 구하는 방식
	//탐욕 알고리즘의 한계 : 탐욕 알고리즘은 근사치 추정에 활용, 최적의 해에 가까운 값을 구하는 방법중 하나.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ex) 지불해야 하는 값이 4720원 일때 1원 50원 100원 500원 동전으로 동전의 수가 가장 적게 지불하시오.
		 */
		int[] coin = new int[] {500,100,50,1};
		
		System.out.println(coin_count(4720, coin));
	}
	
	public static int coin_count(int value, int[] coin_list) {
		int coin_num = 0;
		int total_coin_count = 0;
		for(int i=0;i<coin_list.length;i++) {
			coin_num = value/coin_list[i];
			total_coin_count += coin_num;
			value-=coin_num * coin_list[i];
		}
		
		return total_coin_count;
	}

}

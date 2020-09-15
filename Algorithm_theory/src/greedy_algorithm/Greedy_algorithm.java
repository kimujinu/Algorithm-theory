package greedy_algorithm;

public class Greedy_algorithm {
	
	//���� ��� �� �ϳ��� �����ؾ��� ������, �ż��� �����̶�� �����Ǵ� ��츦 �����ϴ� ������� �����ؼ�, �������� ���� ���ϴ� ���
	//Ž�� �˰����� �Ѱ� : Ž�� �˰����� �ٻ�ġ ������ Ȱ��, ������ �ؿ� ����� ���� ���ϴ� ����� �ϳ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ex) �����ؾ� �ϴ� ���� 4720�� �϶� 1�� 50�� 100�� 500�� �������� ������ ���� ���� ���� �����Ͻÿ�.
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

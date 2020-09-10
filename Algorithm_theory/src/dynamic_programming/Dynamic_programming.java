package dynamic_programming;

public class Dynamic_programming {
	
	/*
	 * ���� ��ȹ��(DP) :
	 * �Է� ũ�Ⱑ ���� �κ� �������� �ذ��� ��, �ش� �κ� ������ �ظ� Ȱ���ؼ�, ���� ū ũ���� �κ� ������ �ذ�, ���������� ��ü ������ �ذ��ϴ� �˰���
	 * ����� ���ٹ����� ���� ������ �ش��� ���� ��, �̸� �����ϰ�, �ش� ������� �̿��ؼ� ���� ������ Ǯ��� ���
	 * Memoization ��� ��� : ���α׷� ���� �� ������ ����� ���� �����Ͽ�, �ٽ� ������� �ʵ��� �Ͽ� ��ü ���� �ӵ��� ������ �ϴ� ���
	 * ������ �߰� �ɰ� ��, �κ� ������ �ߺ��Ǿ�, ��Ȱ��� ex) �Ǻ���ġ ����
	 */
	
	/*
	 * ���� ���� :
	 * ������ ���� �� ���� ������ ������ Ǯ�鼭 �ٽ� �պ��Ͽ� ������ ���� ��� �˰���
	 * ����� ���ٹ�����, ������ �ش��� ���ϱ� ����, �Ʒ��� �������鼭 ������ �ش��� ���ϴ� ��� ex) ����Լ�
	 * ������ �߰� �ɰ� ��, �κ� ������ ���� �ߺ����� ���� ex)���� ����, �� ����..
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

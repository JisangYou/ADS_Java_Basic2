
public class Calc {

	public static void main(String[] args) {

		Change change = new Change();
		change.calc(10000, 3750);
		
		Change newChange = new NewChange(); // ������, ��ü���⿡�� ���� �߿��� ��
		

	}

	public void calc(int pay, int buy) {

		int change = pay - buy;

		System.out.printf("�Ž����� = %d \n", change);
		
		int temp = change / 5000; // intŸ���̹Ƿ�, ������ ���
		System.out.printf("5000�� = %d \n", temp);
		
		change = change % 5000; // ����� ������� 5000�� ���� �������� ������ ����
		temp = change / 1000; // ���� ���������� ���� ���� temp�� ����
		System.out.printf("1000�� = %d \n", temp);
		
		change = change % 1000;
		temp = change / 500;
		System.out.printf("500�� = %d \n", temp);
		
		change = change % 500;
		System.out.printf("100�� = %d \n", change / 100);
		
		change = change % 100;
		System.out.printf("50�� = %d \n", change / 50);
		
		change = change % 50;
		System.out.printf("10�� = %d \n", change / 10);

	}

}

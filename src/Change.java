
public class Change {// �����ų �� �ִ� �ּҴ���, �ǴٰܱŴ� �̸����� ã�� �� �ִ�.

	int changeArray[] = { 5000, 1000, 500, 100, 50, 10 };

	public void calc(int pay, int buy) { // naming ����ϱ�.
		// �ݺ�---------------------------------------
		// �ܵ����
		// �ܵ��� ���� �Ž��������� ������ ������
		// ------------------------------------------
		int change = pay - buy;
		print("�ѰŽ����� ", change);

		for (int money : changeArray) {

			print(money + "", change / money); // ����ȯ money + ""
			// �����ս������δ� ���� ������, �ٸ� ������� ���ؼ� �˱� ����!
			change = change % money;

		}
	}

	public void print(String flag, int count) {
		System.out.printf("%s�� = %d \n", flag, count);
	}

}

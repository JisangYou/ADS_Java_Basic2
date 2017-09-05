
public class ControlFlow {

	// ���ǹ�
	// if switch

	public void checkIf() {
		int a = 10;
		int b = 5;

		if (a > b) {
			// a�� b���� ũ�� ����Ǵ� ����
		} else if (a == b) {
			// a�� b�� ������ ����Ǵ� ����
		} else {
			// �� ���� ������ �� ����Ǵ� ����
		}

	}
	// ������ if! ������ Switch

	public void checkSwitch() {
		int a = 10;
		int b = 5;
		switch (a) {
		case 5:
			System.out.println("a�� ���� 5�Դϴ�.");
			break;

		case 10:
			System.out.println("a�� ���� 10�Դϴ�.");
			break;

		}

	}

	// �ݺ���
	// for while
	public void checkFor() {
		int array[] = { 1, 2, 3, 4, 5, 6, 7 };
		array[0] = 1;
		array[1] = 2;

		// �Ϲ����� for��
		// ���۰� ; ���ᰪ ; ������
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		// ���� for��
		for (int item : array) {
			System.out.println(item);
		}

	}

	public void checkWhile() {
		int array[] = { 1, 2, 3, 4, 5, 6, 7 };

		// �ݺ��� ������ if��
		int count = 0; // ���۰�
		while (count < array.length) { // ���ᰪ , while���� true�� ���� ���ѷ���
			System.out.println(array[count]);
			count = count + 1; // ������
		}
	}

	public void checkDoWhile() {
		int array[] = {};
		int count = 0;
		//while ���� ���ǿ� ������� do ���� �� ���� �� ����ȴ�.
		do {
			System.out.println(array[count]);
			count = count + 1; // ������
		} while (count < array.length);
	}

}

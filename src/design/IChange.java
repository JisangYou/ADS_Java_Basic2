package design;

//�������̽��� �����ϴ� ���
// ���������� + interface + �̸�
public interface IChange {// �ڵ尡 ���� ��������� �������̽�
	public void calc(int pay, int buy);
	// public void move(); �������̽����� �ϳ��� �ϴ°� �����Ƿ� �����ϴ°� ����

}

interface IChangeMove {
	public void move();
} // public�� �� ������ �����ϳ��� public�� �ϳ�

// �������̽��� �����ϱ�
// class + Ŭ�����̸� + implements + �������̽��̸�
class Change implements IChange, IChangeMove {

	@Override
	public void calc(int pay, int buy) {
		// �������� �ڵ带 �ۼ�

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

}
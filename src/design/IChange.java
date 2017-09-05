package design;

//인퍼페이스를 설계하는 방법
// 접근제한자 + interface + 이름
public interface IChange {// 코드가 없는 설계목적의 인터페이스
	public void calc(int pay, int buy);
	// public void move(); 인터페이스마다 하나씩 하는게 나으므로 제거하는게 좋음

}

interface IChangeMove {
	public void move();
} // public을 뺀 이유는 파일하나에 public은 하나

// 인터페이스를 구현하기
// class + 클래스이름 + implements + 인터페이스이름
class Change implements IChange, IChangeMove {

	@Override
	public void calc(int pay, int buy) {
		// 구현단의 코드를 작성

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

}
# ADS04 Java 

## 수업 내용
- 조건문, 배열, 연산자, method, interface 기본적인 문법 및 사용방법

## 코드리뷰

1. 향상된 for문

```Java
	for (int item : array) {
			System.out.println(item);
		}
```
- 기존에 사용하는 for문 보다 코드가 간결하다.
- 속도는 기본 for문이 빠르다.
- list에서 출력된 객체는 변경할 수 없다.

2. 상속 

```Java
public class NewChange extends Change {

	public void close(){//기존코드에 영향을 주지 않음
		
		
	}
	
	@Override
	public void calc(int pay, int buy) {
		// TODO Auto-generated method stub
		super.calc(pay, buy);
	}

	@Override
	public void print(String flag, int count) {
		// TODO Auto-generated method stub
		super.print(flag, count);
	}	
}

```
- 상속예제 코드이다. extends와 @Override를 통해 자식 클래스가 부모클래스의 기능을 사용한다.

3. Interface

```Java
// 인터페이스를 설계하는 방법
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
```
- 인터페이스 예제 코드이다. 
- public interface xxx 로 만들고, 이를 구현하는 클래스에서는 implements를 통해서 해당 인터페이스를 사용할 수 있다. 


## 보충설명
- 추후에 자바 개념을 따로 정리하는 repository를 만들 예정[진행예정- 해당 repository url]

## TODO

- 상속관련 특징, 사용예제 등을 분석하는 시간필요함.(ex- 다중상속이 안되는 특징같은 것)
- method overriding, method overloading 개념 확실히 구분해서 정리하기
- @ -> annotation 개념 정리하기
- 객체 지향 개념 정리하기
- 인터페이스 개념 정리하기


## Retrospect

- 전반적인 문법을 정리하는 시간을 가졌던 것 같습니다.
- 개인적으로 사용이유를 몰랐던 interface에 대해 공부를 하게되었습니다.
- 무심코 지나쳤던 annotation에 대해 의문이 들게 되어 공부를 할 예정입니다.
- 객체지향적인 설계에 대해 고민하는 시간을 가졌습니다.

## Output
- 생략




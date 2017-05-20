# 코드효율성
* 날짜 : 2017년 5월 13일
* 장소 : 강남 옥셔노리오피스
* 발표자 : 김흥래님

* **강의 자료(02_lecture-presentations)** : 
* **샘플 코드(03_sample-codes)** : https://github.com/hrkim3468/javaSampleCode

## Generics
* Collection을 사용한다면 필수
* TypeCasting에 의한 RuntimeException 방지 목적
* 컴파일 레벨에서 타입캐스팅 오류를 감지 -> 좀 더 안전한 프로그램 개발이 가능
* Java는 Type Checking Language
* 하지만 코드의 복잡성이 증가

### 권장하지만 무조건 Generic을 사용하도록 강제하지 않는 이유는?
* 과거에 작성된 코드들 때문(Generic이 없던 시절에 생성된 코드)

### List 타입과 List<Object> 타입의 차이점은?
* 논리적으로는 동일
* Compile 레벨에서 미리 추론할 수 있는지 확인이 가능(RuntimeException을 효과적으로 잡을 수 있다.)

### Wildcard Generic Type
* List<Object> 에서 Object를 대체하기 위해 사용(Obejct는 모든 클래스의 공용 클래스이기 때문)
* 어떤 타입이든 괜찮을 때 <?>를 넣어 사용
* 프로그램을 작성할 때 최대한 RuntimeException을 피할 수 있도록 해야한다.(예외처리가 안되기 때문)

### 타입 매개변수
* 상황에 따라 논리적으로 타입 매개변수를 제공
* 매개변수를 제한하고 싶을때(혹은 같은 것으로 치환)

## Enum
* 일종의 클래스(특수한 형태, 제약사항 있음)
* public static final int끼리 더하는 행위 등 방지
* Object 객체를 상속하고 있다.(Obejct 상속시 공통적으로 toString, hash, equals를 포함)
* Enum은 불변객체(Immutable : 동시 접속이 Thread Base Program 생성시 안전하게 하기 위해. 상태를 갖지 않는 객체)

## Annotation
* Reflection + Annotation : Java가 걸어놓은 제약사항을 99% 회피할 수 있다.(매우 강력한 도구)
cf) 생성자의 목적 : 항상 동일한 루틴을 타라! <br />
* 주석이라고 번역되지만 metadata라고 이해하는것이 좋다.
* 구현시 가독성은 좋아지지만 분석하기는 어려워진다.
* JDK 표준이므로 되도록 쓰자.

### Meta Annotation
* Custom Annotation을 개발하기 위한 Annotation
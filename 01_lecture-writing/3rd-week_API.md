# Java API
* 날짜 : 2017년 4월 22일
* 장소 : 힐스터디 강남점 14번 부스
* 발표자 : 강현정님

* **강의 자료(02_lecture-presentations)** : JAVA 첫 시간.pptx
* **샘플 코드(03_sample-codes)** : Gugudan.java
* 실습 소스 파일(04_practice-codes) : Gugudan.java

## Java API
* Application Programming Interface
  * [Java SE API](https://docs.oracle.com/javase/8/docs/api/) / EE API / ME API
  * lang and util Base Libraries -> SE의 기본이 되는 Object Libraries
  * Other Base -> util쪽 Libraties(Input Output 등)
  * Integretation -> 데이터 교환
  * User Interface -> GUI(Swing, awt)
## java.lang
 * 가장 기본이 되는 클래스
 * Import 문 선언 없이 사용 가능.(컴파일 단계에서 포함.)
   * String / StringBuffer / StringBuilder / Throwable
### java.lang.*
 * 가장 부모가 되는 클래스
 * Object 클래스가 가지고 있는 클래스는 모두 사용 가능
 * toString(); -> Classname + Hex HashCode
 * String : 문자열 처리를 위해 자바에서 제공하는 기본 클래스
   * String이 가지고 있는 문자열은 읽어올 수 있으나 변경할 수는 없다.(Immutable)
 * StringBuffer, StringBuilder : 문자열 처리를 위해 자바에서 제공하는것은 같으나, 자료구조가 달라 문자열이 변경 가능.(Mutable)
   * 연산이 많아질수록 StringBuffer가 효율이 더 좋음.
 * StringJoiner : str.split("/")과 반대의 역할. 문자열을 붙임.
 * Wrapper : 기본형 변수를 객체로 변환할 수 있도록 도와주는 클래스.
   * AutoBoxing / Unboxing : 기본형 <-> 객체형 변환
### java.util.*
 * 자주 사용하는 자료 구조와 유틸리티 클래스를 모아 둠.
 * Apache Commons Library
 * Guava Library
### Exception Handling
 * Error : 시스템 레벨에서 비정상적인 상황이 발생한 경우
 * Exception : 개발자가 만든 어플리케이션 코드의 작성 중 예외상황이 발생한 경우
   * Checked / Unchecked
 * 예외 복구 / 예외 처리 회피
   * 예외 복구 : 다른 작업으로 유도
   * 예외 처리 회피 : 예외가 발생하면 throws를 통해 호출한 쪽으로 예외를 던짐.
   * 예외 전환 : 예외를 잡아서 다른 예외를 던지는 것.
   * try-catch-finally
# 자바 기본
* 날짜 : 2017년 4월 8일
* 장소 : 토즈 강남2호점 Z-8 부스
* 발표자 : 서동우님

* **강의 자료(02_lecture-presentations)** : JAVA 첫 시간.pptx
* **샘플 코드(03_sample-codes)** : Gugudan.java
* 실습 소스 파일(04_practice-codes) : Gugudan.java

## 프로그램이란?
* 소프트웨어의 한가지로, 어떤 문제를 해결하기 위하여 그 처리 방법과 순서를 기술하여 컴퓨터에 주어지는 일련의 명령문 집합체. (나무위키)
* 컴파일 : 인간이 이해할 수 있는 언어를 기계어로 번역하는 과정

## 자바란?
* 1991 제임스 고슬링에 의해 처음으로 창안
* Write once, Run Anywhere
* 코드는 통일, 하나의 가상머신으로 하드웨어를 제어(여러 환경에서)
### Java Keyword
* Bytecode : 특정 프로그램을 컴파일하여 생성되는 코드. Virtual Machine에서 이해할 수 있도록 생성되었음.
* OOP : 객체지향(클래스).
* GC : Gabage Collector. 메모리를 프로그래머 자신이 반환하지 않고 알아서 해준다. 성능상의 이슈가 있을 수도 있음(JVM 공부 필요).
* JVM : 자바 가상머신. 성능 관련하여 나중에 깊게 공부 할 필요가 있음.
* Spring : Web Framework 중 하나.
* https://medium.com/@webseanhickey/the-evolution-of-a-software-engineer-db854689243
#### JVM의 구성
* Bytecode를 통해 프로그램을 실행하고, GC를 통해 메모리 관리를 알아서 해준다.

## 개발 환경
### 환경 구축하기
* 홈페이지에서 jdk8 다운로드 및 설치
* javac / java 확인
* `javac -version`
* `java` : 명령어 리스트를 보여주면 정상 설치.
### 에디터
* Eclipse IDE, NetBeans... 등 다양한 에디터가 존재. 최소한 개발 툴 하나는 제대로 알고 있어야 코딩시 속도가 붙는다.

## 구구단을 한번 만들어보자
* 목표 : 2 X 1 = 2를 출력하는 프로그램을 작성.
* **시작 기본 규칙** : Class명과 File명이 동일해야 한다.
* Method
  * Static : instance를 생성하지 않고 class 내부에서 실행.
* System.out.print(ln) : 화면에 출력(라인 바꿈)
* `javac Gugudan.java` : Gugudan.class 생성 확인
* `javap -c Gugudan` : class 파일의 bytecode 확인
* `java Gugudan` : 생성된 bytecode로 프로그램 실행
  * Console과 IDE에서 컴파일 하고 실행 방식 둘 다 알고 있을 것.
* Method : class내의 모든 함수
* Statement : 프로그램의 code를 지칭
* **Tip)** IDE나 Text Tool의 Line 자동 복사 단축키를 알고 있으면 좋다.
* **Cf)** Java Decomplier : source가 없을시(jar, class 파일만 제공 될 경우) 역 컴파일을 통해 복원

## 변수 & 연산자
### 변수 : 단 하나의 값을 저장할 수 있는 공간
#### 명명 규칙
* 대소문자 구분
* 예약어 사용 못함
* 숫자로 시작 못함
* 특수문자는 _,$만 허용
#### 암묵적인 규칙
* 클래스 이름은 첫 글자가 항상 대문자
* 유니코드를 통한 변수명은 자제(모두 영어로)
* 단어를 합쳐서 변수명을 지을 경우 대문자(Camel 표기법)
#### 변수의 타입
* Primitive type : boolean, char, byte, short, int[기본], long[Ex) long example = 4L], float, double[기본]
  * **Cf)** 부동 소수점
### 연산자
#### 연산자 우선 순위
* 대개 최고 우선순위 -> 괄호, 대개 최하 우선순위 -> 대입 연산자(괄호는 컴파일시 날아감.)
  * **Tip)** 괄호를 통해 어느정도 가독성이 있도록 우선 순위를 보장해준다.
#### 연산자의 종류
* 산술 연산자 : % -> 나머지 연산
* 증감 연산자 : 연산자 위치에 따라 연산 순서 및 결과가 다르다. (대게는 대입 연산자를 통해 최대한 해결하거나 Coding Convention을 만듬.)
* 비교 연산자 : instanceof -> 이 클래스의 하위 클래스인지 아닌지 확인
* 논리 연산자
* 삼항 연산자 : 조건 ? 수식1 : 수식2

## 조건문 & 반복문
* 가장 쉬운 2단 만들기 : 복사 & 붙여넣기
* 중복을 지우기
### 반복문
  * For() { <br />
  } <br />
  * While() { <br />
  } <br />
  * For문과 While문을 상황에 맞게 사용
  * Stream을 이용한 방법
    * map : 배열을 가져와서 다음에 오는 함수로 실행
    * String.format(var, arg1, arg2, arg3...);
    * collector : 배열의 각각 요소를 String으로 합쳐줌.(Ex) ```.collect(Collect.joining());```)
    * `a -> sth` : 함수를 가져와서 return 한다.
* **Cf)** 람다식
### 조건문
  * Switch : int와 enum만 parameter만 받을 수 있다.
* 배열

## 기타
* `String` : 문자열을 관리하는 Class
* **Tip)** 모든 Class도 Type으로 사용할 수 있다.
* "+" 연산은 String을 합쳐준다.

## 다음 주 공지
* 다음 주, 다다음주 : 11시에 시작(30분 일찍)
* 장소 : 힐스터디(서울 강남구 강남대로78길 8)

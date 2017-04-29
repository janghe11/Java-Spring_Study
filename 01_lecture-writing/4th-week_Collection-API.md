# Collection API
* 날짜 : 2017년 4월 29일
* 장소 : 강남 옥셔노리오피스
* 발표자 : 권택환님

* **강의 자료(02_lecture-presentations)** : JAVA Collection.pptx
* **샘플 코드(03_sample-codes)** : 없음
* 실습 소스 파일(04_practice-codes) : 없음

## Collection API
* 대부분의 어플리케이션은 필요한 데이터를 조회하고 조작을 통해 원하는 결과를 도출.
* 여러 종류의 자료 구조와 이를 다루는 보편적인 방법과 특정한 방법을 제공.

### 문제
홈페이지에 오늘 접속한 사람들의 아이디 목록을 뽑아내세요.<br />
접속 이력은 아래의 형식의 내용으로 파일로 떨어져 있고 이 파일을 읽어서 처리하는 프로그램을 만드세요.<br />
* List<String> / Set<String>
  * List : 데이터가 중복이 되어도 상관없음. 계속 축적.
  * Set : 동일한 데이터는 저장될 수 없음.
* 어떤 Collection을 사용하느냐에 따라 엄청난 성능의 차이가 발생한다.

### 어떤 상황에서 어떤 Collection을 사용해야 하는가?
* Collection Framework Diagram
  * Collection / Map
  * List / Set / Map -> Interface
    * 동기화 : 쓰레드를 여러개 구성해서 자료구조를 동시에 접속할 경우 X 표시된 자료구조는 사용하면 안됨. 동기화 블럭 때문에 속도가 느리다.
    * 속도 : 느리다 하더라도 목적에 맞게 사용하는것이 더 좋다.
    * 정렬 : 특정 value에 의해서 정렬
    * NULL 허용 : Add 할 때 NULL을 허용하는지
  * Collection 공통 기능
    * boolean contains : 해당 List에 특정 Object가 있는지 확인
    * V/boolean remove : 해당 List 안에 특정 Object 제거. V는 remove 했을 때 generic 관련 참조.
    * int size()
    * Iterator<E> iterator()
  * Iterator, ListIterator
    * Iterator : 커서의 역할로 다음 element가 있는지 확인하거나 다음 element로 이동할 때 사용.
    * ListIterator : Iterator처럼 다음으로 이동할 수도 있지만 이전으로 이동할 수도 있음.
  * List : 순서가 보장되고 중복이 허용되는 자료형
    * ArrayList(동기화 지원 안하지만 성능이 더 좋음)
    * Vercor(동기화 지원)
    * LinkedList : 다음 element의 위치를 가지고 있고 중간에 삽입 및 제거가 용이
  * Set : 중복을 허용하지 않는 자료형
    * HashSet : Input으로 넣었던 순서를 보장하지 않음.
    * LinkedHashSet : Input으로 넣었던 순서를 보장.
    * TreeSet : 넣은 순서에 상관없이 가나다(ABC) 순으로 정렬. 정렬 과정을 거치기 때문에 속도가 느릴 수밖에 없음. 특수 상황에만 사용 권장.
    * HashSet, LinkedHashSet -> equals()로 비교, TreeSet -> compareTo(). 자료형 통일에 유의하여야 한다.
#### Set 활용
* HashSet : 유니크한 항목이 필요한 경우
* TreeSet : 최소 최대 값 구하기.

* Map : [Key, Value] 쌍인 자료형. 여기서는 Key를 가지고 정렬이 되는지 안되는지를 구별.
  * HashMap
  * Hashtable
  * LinkedHashMap
  * TreeMap
### 문제
0 ~ 9 중 N명의 사람들이 하나의 숫자를 선택하여 투표를 합니다. 선택된 숫자가 몇번이나 투표되었는지 알아내시오.
* Map을 이용하면 Key를 통한 접근으로 탐색 시간 단축.

### 일반적인 상수 사용
* `public static final String ~` 으로 사용할 때의 문제와 해결방법
  * Enum : 생성자, Getter를 이용
    * EnumSet / EnumMap

### Collection을 다루는 방법
* 7 이전 버전 기준 : (1)필터링 (2)정렬 (3)변환
* 익명 클래스를 사용하여 Collection의 처리에 대한 부분 중 공통적인 부분과 특정한 부분을 분리할 수 있다.

#### Guava
* Google의 핵심 Java 라이브러리. 기본 컬렉션 / IO, 캐시, 이벤트 버스 등 다양한 기능 제공.
  * 멀티맵
  * Predicate : 특정 컬렉션의 계산.
  * ImmutableMap : 동기화를 지원하는 환경에서 사용.(Immuatable == 변경이 없다. 새로운 데이터가 삽입되면 새로운 Map이 생성.)
    * builder

#### Guava에서 Collection을 다루는 방법

## Java 8에 추가된 Collection API
### Stream / Lambda
#### Lambda : 식별자 없이 실행 가능한 함수 표현식
* Lambda를 사용함으로서 핵심 비즈니스에 집중 할 수 있게 되었다.

#### Stream API
* 연산의 선언적 처리 : 반복 구조 캡슐화, 알고리즘 분리, 제어 흐름의 추상화
* 함수형 방식 처리
* 지연 처리
* 무한 연속 데이터 흐름 API

#### Stream과 Collection 비교
* Collection : 이미 완결이 되어 있는 상태를 다룬다.
* Stream : 데이터가 계속 변화하는 시점을 다룬다. 재사용 불가.
* 스트림은 데이터 보관이 아닌 데이터 처리에 집중한다.
  * 반복의 내재화
  * 지연 연산
  * 병렬 처리
* Stream 사용 흐름

#### Java8 - Default Method
* Interface에 구현 된 메소드가 들어감. 상속시 메소드가 충돌할 수 있음.

#### 처리하려는 대상이 값이 없는 null인 경우 처리
* Optional<T> : 값이 null이 나올 수도 있다고 명시한 것임.

### Java 8 Collection API
* Iterable
  * lambda 식으로 return 할 수 있다.
* Collection
  * removeIf
  * replaceAll
* List
  * sort
* Map
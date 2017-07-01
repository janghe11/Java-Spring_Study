# 람다
* 날짜 : 2017년 5월 27일
* 장소 : 강남 옥셔노리오피스
* 발표자 : 최치환님

* **강의 자료(02_lecture-presentations)** : 
* **샘플 코드(03_sample-codes)** : https://github.com/clghks/javacafe_lambda_stream

## 람다
* 참고 책 : [자바 8 인 액션](http://book.naver.com/bookdb/book_detail.nhn?bid=8883567)

### 람다란 무엇인가?
* 어떻게 익명 클래스를 간단하게 보여줄 것인가에 대한 표현식
  * 특징 : 익명 클래스  / 메소드 역할을 다 함 / 전달 / 간결성
  * 형식 : 파라미터 리스트(Optional) / 화살표 / 람다의 바디
  * 표현식() vs 구문{}
  * 사용 : boolean / Object / 객체 소비 / 두 값 조합 등

### 함수형 인터페이스
* Comparator, Runnable
* @FucntioanlInterface : 추상 메소드 2개 이상 사용시 compile 시 경고 안내
* Predicate / Consumer / 함수형 인터페이스를 많이 사용
  * Predicate : 하위 호환성을 위해 만들어진 인터페이스
    * negate : 반전 / and / or
  * 기본형 특화 함수 인터페이스 : Boxing Unboxing을 줄이기 위해
* 람다 캡쳐링 : 지역 변수는 final 처럼 변경할 수 없다.(단, static으로 선언되면 변경 가능)
* 람다 활용 : 실행 어라운드 패턴
* 매서드 레퍼런스 : 람다 표현식을 축약한 것

## Stream API
### 스트림이란 무엇인가?
* 데이터 컬렉션 반복을 가독성있게 처리 가능
* 컬렉션을 SQL Query 처럼 처리할 수 있음
* 멀티 스레드 코드를 구현하지 않아도 데이터를 투명하게 병렬로 처리할 수 있음
* 특징 : 선언형 / 조립식 / 병렬화
* 대부분 람다식으로 반환하기 때문에 람다식의 선이해 필수
* 스트림 vs 컬렉션
  * 컬렉션 : 모든 값을 메모리에 저장하는 자료구조(초기시간이 느림)
  * 스트림 : 요청할 때만 요소를 계산하는 고정된 자료구조(내부반복을 사용하여 JVM에 의한 자동 최적화 가능, 하지만 한번 스트림을 닫으면 다시 재사용 불가)
* 최종 연산 전까지 중간 연산들은 파이프라인 구성만 가능하지 실제로 어떠한 결과도 나오지 않는다. (최종연산 : forEach, collect, count)

## 스트림 API 활용
* 매핑 -> flatMap();
* findFirst (x) -> findAny(o)

## 병렬 데이터 처리와 성능
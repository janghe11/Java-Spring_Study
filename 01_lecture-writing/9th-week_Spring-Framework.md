# Spring Framework
* 날짜 : 2017년 6월 10일
* 장소 : 강남 옥셔노리오피스
* 발표자 : 백재현님

* **강의 자료(02_lecture-presentations)** : 
* **샘플 코드(03_sample-codes)** : https://github.com/jojonari/withspring

## 프레임워크란?
* 관련된 것들을 구분하고 모아놓았다
* 소프트웨어의 구체적인 부분에 해당하는 <U>설계(모델링)와 구현을 재사용(재사용)</U>이 가능하게끔 일련의 <U>협업화된 클래스</U>들을 제공하는것. - 랄프 존슨 교수
  * 전체 시스템의 통합성, 일관성을 위해
  * 무조건 좋은것만이 아니라 호환성도 생각하여 모아놓는 역할
  * 블랙박스라는 의미는 자세한 code는 몰라도 된다.(예 : JDBC config)
  * 틀을 제공하는것이 오히려 더 자유로운 생각을 할 수 있도록 해줌.
  * 최 상단의 구현하고자 하는 것만 개발하면 된다.
  * 공통 기반은 냅두고 재사용 하면서 상단의 Business Logic만 교체할 수 있음. But 해당 Logic에서 필요없는 공통기반 Layer가 있어 Memory상의 낭비가 발생할 수 있음.
  * 해당 Framework에 대한 지식을 팀원 모두가 알고 있어야 하고, 격차도 존재.
* https://en.wikipedia.org/wiki/Comparison_of_web_frameworks

## 스프링 프레임워크란?
* http://spring.io/
  * http://spring.io/guides
  * http://spring.io/projects 여러 하위 프로젝트가 존재
* 큰 프로젝트를 진행할 때 주로 사용(작은 프로젝트는 Java도 괜찮음.)

## 스프링 프레임워크 역사
* J2EE Development without EJB

## 스프링 프레임워크 구조
* 20개 정도의 모듈로 구성

## 스프링 프레임워크 특징
* container : 객제를 다 만드러서 가지고 있다가, 사용하고 반납(Bean)하는 형식(한 객체로 여러곳에서 재사용)
* AOP : 공통된 기능을 재사용하는 기법

## 정리
* 경량 컨테이너로서 자바 객체를 직접 관리
* 스프링은 POJO 방식의 프레임워크
* 스프링은 제어반전(IoC)을 지원
* 스프링은 의존성 주입(DI)을 지원
* 스프링은 관점 지향 프로그래밍을 지원
* 스프링은 영속성(=Database)과 관련된 다양한 서비스를 지원
* 스프링은 확장성이 높음
* cf) http://mvnrepository.com/
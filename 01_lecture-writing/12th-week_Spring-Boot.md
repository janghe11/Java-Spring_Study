# Spring Boot
* 날짜 : 2017년 7월 1일
* 장소 : 강남 옥셔노리오피스
* 발표자 : 박세종님

* **강의 자료(02_lecture-presentations)** : 12. 스프링부트 강의.pptx
* **샘플 코드(03_sample-codes)** : 
* 실습 소스 파일(04_practice-codes) : demo

## Spring Boot 소개
* https://start.spring.io/ -> Web / DevTools 체크 -> Generate Project -> Open Project
* Convention of configuration
* WAR는 public static void main 이 필요 없지만 spring boot는 시작점이 필요하다.
* Annotation의 의미를 읽어야(찾아가야) Spring Boot의 작동 방식을 알 수 있다.
  * Ex) ConditionalOnClass
* SpringBootAutoConfigure 가 핵심!
* application.properties 파일에 설정 내용들을 입력(정의)한다.
  * application-dev.properties -> 개발계에서만 돌게 하겠다.(개발하는 환경이 로컬 / 테스트 등 다를 경우, Active Profiles)

* 자세한 사항은 http://projects.spring.io/spring-boot/ 에서 references 참조

## 기타
* DevTools : 개발환경의 편의
* Actuator : Beans / HealthCheck 등을 확인할 수 있다.
* spring boot monitor
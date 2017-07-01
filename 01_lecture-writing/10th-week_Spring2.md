# Spring MVC
* 날짜 : 2017년 6월 17일
* 장소 : 강남 옥셔노리오피스
* 발표자 : 박진현님

* **강의 자료(02_lecture-presentations)** : 10. Spring MVC

* 추천 학습법 : http://www.acornpub.co.kr/book/toby-spring3 1권 다 읽고 2권 중에서 업무에 필요한 variation을 찾아서 

## Web
### HTML
* 현재는 모든 Client가 웹 개발

### Static Web
* 네이버 같은건 정적 웹페이지
  * 빠른 응답속도, 뛰어난 보안
  * 변하지 않는 것을 서비스 할때
* 별도의 자원을 요청하지 않는 한 index를 기본으로 반환
* Content-Type

### Dynamic Web
* Client-Side는 SPA(Single Page Application)로 Ajax 기술을 주로 사용함.
* 세션 : 서버측에 저장해 놓은 사용자의 연결 상태 <-> 쿠키 : 사용자측에서 저장한 상태
* Javascript와의 차이점은 Client에서 변환하지만 JSP는 Tomcat이 Java class파일을 HTML로 Client에 계속 전달
  * 사용자의 검증이나 인증은 반드시 Server측에서 작성할 것.
  * DB는 최대한 짧게 작성하고, WAS에서 Group By로 합쳐서 작성할 것.
* AJP Protocol = Apache + Tomcat 조합

## Spring Web
### Web Application
* 회사 입장에서는 재 사용성을 고려하는 상황이 발생

### Spring Web Application
#### Spring MVC
* 1. Miscellaneous -> 2. Controller[BI Logic, 검증만] -> (HandlerMappling(s) -> HandlerIntercepter -> Form submission -> Business logic -> HandlerExceptionResolver) -> 3. View[그리기 전적 담당]

#### Dispatcher Servlet
* 모든 요청의 공통적이 작업을 처리함

#### Controller
* 기본은 ModelAndView return
* MessageConverter로 json등으로 변환하여 return 해줌

#### View
* 보통 템플릿 엔진을 사용(JSP 등)

* 모든 답은 Error Message에 있다!
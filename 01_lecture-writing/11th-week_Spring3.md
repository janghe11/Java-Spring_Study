# Spring MVC
* 날짜 : 2017년 6월 24일
* 장소 : 강남 옥셔노리오피스
* 발표자 : 김흥래님

* **강의 자료(02_lecture-presentations)** : 11. springdichapter1-170626103612 / 11. springdichapter2-170626103747
* **샘플 코드(03_sample-codes)** : SpringStudy

## 초난감 DAO
* 리팩토링(중복제거)
* 확장(MySQL -> Oracle)

### 관심사의 분리
* 메소드로 뜯어내어 분리한다.
* 분리는 쉽지만 확장은 힘들다.
* 상속은 최소화 시켜야 하는것이 맞다.
* 상속보다는 구현을 사용해야 한다.
  * extends vs implement?(다중상속의 효과를 위해)
* 컴포지션

### 분리와 확장을 고려한 설계
* DI(Dependency Injection)

## IOC
* 라이브러리 vs 프레임워크 (주도권을 누가 가지고 있느냐)
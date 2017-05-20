# Concurrent Programming (Java 스레드 다루기)
* 날짜 : 2017년 5월 20일
* 장소 : 강남 옥셔노리오피스
* 발표자 : 이정근님

* **강의 자료(02_lecture-presentations)** :
* **샘플 코드(03_sample-codes)** : https://github.com/redrebel/TIL/blob/master/language/java/Java_Thread.md

## 병렬과 병행과 동시성의 차이
* 병행(Concurrent) 프로그래밍 : 멀티스레드 프로그래밍
* 병렬(Parallel) 프로그래밍 : MPI,OpenMP, CUDA와 같은 라이브러리를 활용한 멀티코어 프로그래밍
  * http://palpit.tistory.com/728
* 스레드를 다루는 것들은 `병행` 프로그래밍
  * Core별 Thread별 분할 및 처리 정책은 Kernel단에서 관리

## 스레드
### Runneable Interface
* Thread Programming을 위한 인터페이스
* run() 이라는 메소드만 외부에 노출 됨.(구현도 되어있어야 함.)
* Sleep()의 가독성을 좋게 하려면 : ```TimeUnit.SECONDS.sleep(sec);``` ```//Thread.sleep(millis); X```

## 병행 태스크
* 스레드의 용도 : 클라이언트 요청 처리 / 복잡하고 다량의 데이터를 분산처리 / 주기적인 간단한 백그라운드 작업 처리
  * 예시) 은행에서의 창구 업무

### 주요 클래스와 인터페이스
* 사용자 -> PG : 사용자가 가지고 있는 각종 포인트 알려줘!
  * request가 들어보면 초당 60건 + a -> 조회 : 하나하나 순차적 조회를 하면 시간이 오래 걸린다.
  * 각각 스레드로 나누어 동시에 request를 보냄
  * 하지만 void run();이라 return이 없어 결과값을 받을 수 없다.
  * static var를 생성해서 공유메모리에 저장하기보다 Future 인터페이스로 결과값을 받을 수 있다.

### 태스크 실행
* newCachedThreadPool(); : 범용적 사용이 가능한 스레드 풀
* newFixedThreadPool(); : 고정된 크기를 생성하는 스레드 풀. 처음 시작할 때 미리 만들어놓고 시작.

* 예시) -> L4 : 나갈때 이중화를 시킴.(장비부터 두개 이상을 구축.)
  * 트래픽 분산
  * 장애 대응
  * 이때 장비를 off & on 시 스레드를 그때그때 만들면 성능 저하 발생 우려. 애초에 시작부터 일정 개수의 스레드를 생성해야 real time 대응 가능.

* executor는 Thread의 실행만 하고 종료는 관여하지 않는다.
  * 그래서 Future 인터페이스와 메소드가 필요.

## 프로세스
* 다른 프로그램을 실행해야 할 때
  * ProcessBuilder

## 스레드 안정성(Thread Safety)
### 가시성
* 스레드가 실행할 때 메모리 / 캐시 / 레지스트리 영역이 존재한다. 바라보는 영역이 서로 달라 전부 다 업데이트되어 동기화가 맞기 전까지 해당 스레드는 종료되지 않는다.
  * volatile 타입으로 선언함으로서 전부 메모리를 바라보고 사용하도록 만들 수 있다.
    * 하지만 성능은 떨어진다.

## 병행 해시 맵
* Concurrent Hashmap

## 블로킹 큐
* 메시지등을 처리할 때 쓰는 큐 중에 하나
  * 스레드간 통신(데이터를 주고 받고 싶을 때)을 하고 싶을 때 둘 다 큐를 바라보도록 만듬.
  * 아무것도 큐에 없으면 스레드가 종료되는 일반 큐에 비해 블로킹 큐는 큐에 데이터가 들어올 때 까지 break로 대기하고 있음.
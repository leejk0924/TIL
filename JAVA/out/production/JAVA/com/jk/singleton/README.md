# static

## 여러 인스턴스에서 공통으로 사용하는 변수 선언시 사용
 - 여러 인스턴스가 공유하는 기준 값이 필요한 경우 생성
 ex) - 학생마다 새로운 학번 생성
     - 회사에서 입사한 직원에게 새로운 사번 생성
![데이터 영역 메모리](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-16/img/static.png)


## static 변수 선언과 사용
static int serialNum;
 - 프로그램이 메모리에 로딩될 때 메모리에 할당
 - 클래스 변수 또는 정적 변수
 - 인스턴스 생성과 상관없이 사용가능 하며, 클래스 이름으로 참조

![static 변수는 인스턴스에서 공통으로 사용하는 영역](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-16/img/mem.png)

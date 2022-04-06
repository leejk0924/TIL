# 객체 간 상속의 의미
## 클래스 상속
---
- 새 클래스를 정의 할 때, 이미 구현된 클래스를 상속(inheritance) 받아서 속성, 기능을 확장하여 클래스를 구현
- 이미 구현된 클래스보다 더 구체적인 기능을 가진 클래스를 구현해야 할때 기존 클래스를 상속함<br>

<p align="center" style="...">
    <img src="https://wayhome25.github.io/assets/post-img/python/inheritance.png" alt = "외부이미지" height="300px"/></br>
    <b>클래스의 상속</b>
</p>

```
JAVA는 단일 상속만을 지원하기 한다.
extends 키워드 뒤에는 단 하나의 클래스만 올 수 있음
```
### 예시
```java
public void B() extends A{
    
}
```
B 클래스는 A클래스를 상속받는다.

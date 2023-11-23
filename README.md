# 고급객체지향프로그래밍 실습과제 #10

## 과제 설명

* 간단한 산술 연산 기능을 코맨드 패턴을 이용해서 구현
  * 정수 범위 내에 있는 숫자는 계산 가능
  * 사칙 연산과 나머지 연산(+, -, *, /, %, 제곱 연산)
* 산술 연산을 리스트에 넣었다가 순차적으로 처리하는 CommandManager 구현
* CommandManager에 객체를 추가하고 실행하는 Main 클래스 구현

# 고급객체지향프로그래밍 실습과제 #10

## 과제 설명

* 간단한 산술 연산 기능을 코맨드 패턴을 이용해서 구현
  * 정수 범위 내에 있는 숫자는 계산 가능
  * 사칙 연산과 나머지 연산(+, -, *, /, %, 제곱 연산)
* 산술 연산을 리스트에 넣었다가 순차적으로 처리하는 CommandManager 구현
* CommandManager에 객체를 추가하고 실행하는 Main 클래스 구현

```mermaid성
classDiagram

class Command {
<<Interface>>
  + execute() int
}

class CommandManager {
  - List~Command~ opList
  + CommandManager() 
  + addOperation(Command) void
  + performOperations() void
}

class AddValueCommand {
  + AddValueCommand(int, int) 
  + execute() int
}

class SubtractValueCommand {
  + SubtractValueCommand(int, int) 
  + execute() int
}

class SquareValueCommand {
  + SquareValueCommand(int) 
  + execute() int
}

CommandManager --> Command
Command <|.. AddValueCommand 
Command <|.. SubtractValueCommand 
Command <|.. SquareValueCommand 
```

## 출력 결과 예시

과제 설명에는 주어지지 않은 예시로, 실습자(김동주)가 임의로 작성함.

```
314 + 159 = 473
111 - 999 = -888
7 * 7 = 49
1000 / 5 = 200
32 ^ 2 = 1024
```

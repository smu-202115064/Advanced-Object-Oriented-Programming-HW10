public class Main {
    public static void main(String[] args) {
        /**
         * 산술 연산을 리스트에 넣었다가 순차적으로 처리
         * * 정수 범위 내에 있는 숫자는 계산 가능
         * * 사칙 연산과 나머지 연산 (+, -, *, /, %, 제곱)
         */
        CommandManager cmdMgr = new CommandManager();

        cmdMgr.addOperation(new AddValueCommand(314, 159));
        cmdMgr.addOperation(new SubtractValueCommand(111, 999));
        cmdMgr.addOperation(new MultiplyValueCommand(7, 7));
        cmdMgr.addOperation(new DivideValueCommand(1000, 5));
        cmdMgr.addOperation(new SquareValueCommand(32));

        cmdMgr.performOperations();
    }
}

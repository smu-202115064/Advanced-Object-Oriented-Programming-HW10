public class DivideValueCommand implements Command {
    private int x;
    private int y;

    public DivideValueCommand(int x, int y) {
        this.x = x;
        this.y = y;
        // TODO: Divide by Zero 는 어떻게 처리할 것인가.
    }

    @Override
    public int execute() {
        return x / y;
    }
}

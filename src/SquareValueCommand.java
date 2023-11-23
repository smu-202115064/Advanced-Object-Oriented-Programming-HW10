public class SquareValueCommand implements Command {
    private int x;

    public SquareValueCommand(int x) {
        this.x = x;
    }

    @Override
    public int execute() {
        System.out.printf("%d ^ 2 = %d\n", x, x*x);
        return x * x;
    }
}

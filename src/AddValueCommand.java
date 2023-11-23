public class AddValueCommand implements Command {
    private int x;
    private int y;

    public AddValueCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int execute() {
        System.out.printf("%d + %d = %d\n", x, y, x+y);
        return x + y;
    }
}

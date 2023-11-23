import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private List<Command> opList;

    public CommandManager() {
        opList = new ArrayList<>();
    }

    void addOperation(Command op) {
        opList.add(op);
    }

    void performOperations() {
        for (Command cmd : opList) {
            cmd.execute();
        }
    }
}

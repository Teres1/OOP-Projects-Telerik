package commands;

import java.util.List;

public class Command {
    private CommandType type;
    private List<String> args;

    public Command(CommandType type) {
        setType(type);
    }

    public Command(CommandType type, List<String> args) {
        setType(type);
        setArgs(args);
    }

    public CommandType getType() {
        return type;
    }

    public void setType(CommandType type) {
        this.type = type;
    }

    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }
}

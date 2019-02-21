package commands.base;

import commands.Command;

public interface CommandParser {
    Command parse(String commandString) throws Exception;
}

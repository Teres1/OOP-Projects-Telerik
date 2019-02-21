package commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import commands.base.CommandParser;

public class CommandParserImpl implements CommandParser {
    // EXIT, ADD_PRODUCT, LIST_PRODUCTS, LIST_PRODUCTS_BY_CATEGORY,
    // FIND_PRODUCT_BY_ID, FILTER_PRODUCT_BY_NAME, ADD_CATEGORY_TO_PRODUCT
    @Override
    public Command parse(String commandString) throws Exception {
        commandString.toLowerCase();
        String justCommand;
        String arguments = "";
        List<String> listOfArgs = null;

        if (commandString.contains("-")) {
            justCommand = commandString.substring(0, commandString.indexOf('-')).trim();
            arguments = commandString.substring(commandString.indexOf('-') + 1, commandString.length()).trim();
            listOfArgs = new ArrayList<String>(Arrays.asList(arguments.split(", ")));
        } else {
            justCommand = commandString;
        }

        switch (justCommand) {
            case "exit":
                return new Command(CommandType.EXIT);
            case "add product":
                return new Command(CommandType.ADD_PRODUCT, listOfArgs);
            case "list products":
                return new Command(CommandType.LIST_PRODUCTS);
            case "list products by category":
                return new Command(CommandType.LIST_PRODUCTS_BY_CATEGORY, listOfArgs);
            case "find product by id":
                return new Command(CommandType.FIND_PRODUCT_BY_ID, listOfArgs);
            case "filter product by name":
                return new Command(CommandType.FILTER_PRODUCT_BY_NAME, listOfArgs);
            case "add category to product":
                return new Command(CommandType.ADD_CATEGORY_TO_PRODUCT, listOfArgs);
            default:
                throw new IllegalArgumentException("Invalid command: " + commandString);
        }
    }
}

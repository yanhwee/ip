package gray.command_factory;

import gray.GrayException;
import gray.command.Command;
import gray.command.ListCommand;

public class ListCommandFactory extends CommandFactory {

    /**
     * Returns the list command parsed from the text.
     *
     * @param text
     * @return List Tasks Command
     * @throws GrayException
     */
    @Override
    public Command parse(String text) throws GrayException {
        if (!text.equals("list")) return null;
        return new ListCommand();
    }
}

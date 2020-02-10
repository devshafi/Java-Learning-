package desginPattern.commandDesignPattern.tvClientExample.invoker;

import desginPattern.commandDesignPattern.tvClientExample.Command;

public class RemoteController {

    public void press(Command command) {
        command.execute();
    }
}

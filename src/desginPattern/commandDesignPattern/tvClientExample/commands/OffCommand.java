package desginPattern.commandDesignPattern.tvClientExample.commands;

import desginPattern.commandDesignPattern.tvClientExample.Command;
import desginPattern.commandDesignPattern.tvClientExample.Tv;

public class OffCommand implements Command {
    private Tv tv;

    public OffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.switchOff();
    }
}

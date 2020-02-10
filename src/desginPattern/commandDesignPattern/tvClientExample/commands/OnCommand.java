package desginPattern.commandDesignPattern.tvClientExample.commands;

import desginPattern.commandDesignPattern.tvClientExample.Command;
import desginPattern.commandDesignPattern.tvClientExample.Tv;

public class OnCommand implements Command {

    private Tv tv;

    public OnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.switchOn();
    }
}

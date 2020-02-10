package desginPattern.commandDesignPattern.tvClientExample;

import desginPattern.commandDesignPattern.tvClientExample.commands.OffCommand;
import desginPattern.commandDesignPattern.tvClientExample.commands.OnCommand;
import desginPattern.commandDesignPattern.tvClientExample.invoker.RemoteController;

public class TvClientDemo {

    public static void main(String[] args) {

        // receiver object
        Tv tv = new Tv();

        //commands
        Command onCommand = new OnCommand(tv);
        Command offCommand = new OffCommand(tv);

        //invoker
        RemoteController remoteController = new RemoteController();

        // invoker triggers commands
        remoteController.press(onCommand);
        remoteController.press(offCommand);

        // invoker using lambda function
        remoteController.press(tv::switchOn);
        remoteController.press(tv::switchOff);


    }
}

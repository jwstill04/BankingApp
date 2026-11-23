public class CommandController {
    private Command currentCommand;

    public void setCommand(Command command){
        currentCommand = command;
    }

    public void executeCommand(){
        currentCommand.execute();
    }
}

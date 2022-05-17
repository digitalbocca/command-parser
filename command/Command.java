package command;

public abstract class Command implements CommandInterface {
    protected String command;

    public abstract String getCommand();

    public abstract void execute();
}

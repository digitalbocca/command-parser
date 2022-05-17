package command;

public class Exit extends Command {
  public Exit() {
    super.command = "exit";
  }

  public String getCommand() {
    return super.command;
  }

  public void execute() {
    System.out.println("Exiting...");
    System.out.println("Bye!");
    System.exit(0);
  }
}

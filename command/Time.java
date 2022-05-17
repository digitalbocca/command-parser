package command;

public class Time extends Command {
  public Time() {
    super.command = "time";
  }

  public String getCommand() {
    return super.command;
  }

  public void execute() {
    System.out.println("The time is: " + System.currentTimeMillis());
  }
}

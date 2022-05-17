import command.*;

public class Main {
    private static CommandInterface[] commands = new CommandInterface[] {
      new Exit(),
      new Time(),
    };

    public static void parseCommand() {
      System.out.println("Enter command: ");
      String command = System.console().readLine();

      for (int i = 0; i < commands.length; i++) {
        if (commands[i].getCommand().equals(command)) {
          commands[i].execute();
        }
      }

      parseCommand();
    }

    public static void main(String[] args) {

      parseCommand();
    }
}

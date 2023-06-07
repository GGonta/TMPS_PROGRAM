public class TurnOnSprinklerCommand implements Command{
  SprinklerForSmoke sprinkler;

  public TurnOnSprinklerCommand(SprinklerForSmoke sprinkler) {
    super();
    this.sprinkler = sprinkler;
  }

  public void execute() {
    System.out.println("Turning on sprinkler.");
    sprinkler.turnOn();
  }
}
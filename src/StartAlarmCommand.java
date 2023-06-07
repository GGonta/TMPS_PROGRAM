public class StartAlarmCommand implements Command{
  AlarmForMotion alarm;

  public StartAlarmCommand(AlarmForMotion alarm) {
    super();
    this.alarm = alarm;
  }

  public void execute() {
    System.out.println("Starting Alarm.");
    alarm.start();
  }
}
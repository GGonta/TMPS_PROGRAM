public class StopAlarmCommand implements Command{
  AlarmForMotion alarm;

  public StopAlarmCommand(AlarmForMotion alarm) {
    super();
    this.alarm = alarm;
  }

  public void execute() {
    System.out.println("Stopping Alarm.");
    alarm.stop();
  }
}
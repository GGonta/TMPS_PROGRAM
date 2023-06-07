public class MotionSmsAdapter implements Sms {
  private MotionSms adaptee;

  public MotionSmsAdapter(MotionSms motionsms){
    this.adaptee = motionsms;
  }

  @Override
  public void sendMessage(String s){
    System.out.println("SMS from MOTION ADAPTER: " +s);
    //here the message can be modified, adapted, whatever
    //we will just print a slightly modified message, that's it
  }
}
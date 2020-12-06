package thread;

import java.util.TimerTask;
class MyTask extends TimerTask {
  public void run() {
    System.out.println("타이머 호출");
  }
}

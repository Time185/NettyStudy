package time;

/**
 * @author Time
 * @created 2020/1/13
 */
public class TimerClient {
    public static void main(String[] args) {
        new Thread(new AsynTimeClientHandler("127.0.0.1",8080)).start();
    }
}

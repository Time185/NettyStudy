package time;

/**
 * @author Time
 * @created 2020/1/13
 */
public class TimeServer {
    public static void main(String[] args) {
        AsyncTimeServerHandler timeServer = new AsyncTimeServerHandler(8080);
        new Thread(timeServer).start();
    }
}

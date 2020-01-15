package Time;

/**
 * @author Time
 * @created 2020/1/2
 */
public class TimeServer {
    public static void main(String[] args) {
        new Thread(new MultiplexerTimeServer(8888)).start();
    }
}

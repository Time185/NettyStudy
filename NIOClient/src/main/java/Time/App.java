package Time;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        new Thread(new TimeClientHandle("127.0.0.1",8888)).start();
    }
}

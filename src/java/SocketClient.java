import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {

    public static void main(String[] args) throws Exception {
        //获取用户输入的数据
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数据:");
        String inputData = input.nextLine();

        //开启一个Socket端口
        Socket sc = new Socket("127.0.0.1", 6666);
        OutputStream os = sc.getOutputStream();
        os.write(inputData.getBytes());

        //获取服务端回传的数据
        InputStream is = sc.getInputStream();
        byte[] buffer = new byte[1024];
        int len = -1;
        len = is.read(buffer);
        String getData = new String(buffer, 0, len);
        System.out.println("从服务端获取的数据:" + getData);
        //是否流
        is.close();
        os.close();
        sc.close();
    }
}

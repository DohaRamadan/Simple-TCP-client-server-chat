import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author owner
 */
public class Client
{

    public static void main(String[] args)
    {
        try
        {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("The IP Address is : " + ip);
//
            Socket server = new Socket(ip, 40000);
////
//
            DataInputStream readFromServer = new DataInputStream (server.getInputStream());
            DataOutputStream WriteToServer = new DataOutputStream (server.getOutputStream());
//
            String str = "";

            str = readFromServer.readUTF();
            System.out.println("server says : " + str);
            str = readFromServer.readUTF();
            System.out.println("server says : " + str);

            WriteToServer.writeUTF("Hello server!  ");
            WriteToServer.writeUTF("i was just checking on you, GoodBy! :)");

            str = readFromServer.readUTF();
            System.out.println("server says : " + str);


            readFromServer.close();
            WriteToServer.close();
            server.close();
        }
//
//
//
        catch (Exception ex) {

            System.out.println("There's a problem");
        }
    }

}

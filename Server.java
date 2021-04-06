import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Server
{
    public static void main(String[] args)
    {


        try
        {
            ServerSocket server = new ServerSocket(40000);
//            //listen
////
            Socket client = server.accept();
////
            DataInputStream readFromClient = new DataInputStream (client.getInputStream());
            DataOutputStream WriteToClient = new DataOutputStream (client.getOutputStream());


            WriteToClient.writeUTF("You're out first Client! Hello:");
            WriteToClient.writeUTF("How can we help you?");
//
            String str = "";
            str = readFromClient.readUTF();
            System.out.println("Client says : " + str);
            str = readFromClient.readUTF();
            System.out.println("Client says : " + str);
//
            WriteToClient.writeUTF("GoodBye:) ");

            readFromClient.close();
            WriteToClient.close();
            client.close();
////
        }


        catch (Exception ex) {
            System.out.println("There's a problem");
        }

    }

}


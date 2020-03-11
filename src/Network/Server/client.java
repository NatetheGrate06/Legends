package Network.Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class client implements Runnable {

    //Client variables
    private String host;
    private int port;
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private boolean serverRunning = false;
    private event_listener listener;

    public client(String host, int port) {
        this.host = host;
        this.port = port;

    }

    //connect to server
    public void connect() {
        try {
            socket = new Socket(host, port);
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            new Thread(this).start();
        } catch (ConnectException e) {
            System.out.println("Unable to connect to the server...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //close the connection
    public void close() {
        try {
            serverRunning = false;
            //TODO tell the server about the disconnection
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //sends data to the server
    public void sendObject(Object pac) {
        try {
            out.writeObject(pac);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            serverRunning = true;

            while(serverRunning) {
                try {
                    Object data = in.readObject();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SocketException e) {
                    close();
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

package javaMessengerTest;
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 1207);
            System.out.println("connessione riuscita");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String serverMessage = in.readLine();
            System.out.println("Messaggio dal server: " + serverMessage);
            socket.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

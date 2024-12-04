package javaMessengerTest;
import java.net.*;
import java.io.*;

public class MessengerServer {
    public static void main(String[] args){
        try{
            ServerSocket serverSocket = new ServerSocket(1207);
            System.out.println("Server connesso alla porta 120701");

            Socket clienSocket = serverSocket.accept();
            System.out.println("Connessione stabilita");

            PrintWriter out = new PrintWriter(clienSocket.getOutputStream(), true);

            out.println("questo è il server del pisellatore seriale, il killer di durelli, l'onnipotente spaventapassere");
            clienSocket.close();
            serverSocket.close();
            System.out.println("porcodio");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
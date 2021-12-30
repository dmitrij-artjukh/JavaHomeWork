package com.pb.artjukh.hw15;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.LinkedList;

class Server1 extends Thread {
    private Socket socket;
    private BufferedReader in;
     private PrintWriter out;
    private static LocalDateTime ldt = LocalDateTime.now();

    public Server1(Socket socket) throws IOException {
        this.socket = socket;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        start();
    }
    @Override
    public void run() {
        String word;
        try{
        try {
                while (true) {
                    word = in.readLine();
                    if(word.equals("stop")) {
                        this.downService();
                        break;
                    }
                    System.out.println( word);

                    for (Server1 vr : Server.serverList) {
                        vr.send(word);
                    }
                }
        } catch (NullPointerException ignored) {}
        } catch (IOException e) {
            this.downService();
        }
    }

    private void send(String msg) {
        out.write(ldt.toString()+msg + "\n");
        out.flush();

    }

    private void downService() {
        try {
            if(!socket.isClosed()) {
                socket.close();
                in.close();
                out.close();
            }
        } catch (IOException ignored) {}
    }
}

public class Server {

    public static final int PORT = 1234;

    public static LinkedList<Server1> serverList = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(PORT);
           System.out.println("Сервер запущен");
        try {
            while (true) {
                          Socket socket = server.accept();
                try {

                System.out.println("Новое соединение.");
                    serverList.add(new Server1(socket));
                } catch (IOException e) {

                    System.out.println("Соединение закрыто");
                    socket.close();
                }
            }
        } finally {
            server.close();
        }
    }
}
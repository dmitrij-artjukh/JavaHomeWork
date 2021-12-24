package com.pb.artjukh.hw15;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.Socket;


class Client1 {

    private Socket socket;
    private BufferedReader in;
    private BufferedWriter out;
    private BufferedReader inputUser;
    private String addr;
    private int port;


    public Client1(String addr, int port) {
        this.addr = addr;
        this.port = port;
        try {
            this.socket = new Socket(addr, port);
        } catch (IOException e) {
            System.err.println("Socket failed");
        }
        try {
            inputUser = new BufferedReader(new InputStreamReader(System.in));
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            new ReadMsg().start();
            new WriteMsg().start();
        } catch (IOException e) {

            Client1.this.downService();
        }

    }

    private void downService() {
        try {
            if (!socket.isClosed()) {
                socket.close();
                in.close();
                out.close();
            }
        } catch (IOException ignored) {}
    }


    private class ReadMsg extends Thread {
        @Override
        public void run() {

            String str="first";
            try {
                while (true) {
                    str = in.readLine();
                    if (str.equals("stop")) {
                        Client1.this.downService();
                        break;
                    }

                    System.out.println(str);

                }
            } catch (IOException e) {
                Client1.this.downService();
            }
        }
    }


    public class WriteMsg extends Thread {

        @Override
        public void run() {
            while (true) {
                String userWord;
                try {

                    userWord = inputUser.readLine();
                    if (userWord.equals("stop")) {
                        out.write("stop" + "\n");
                        Client1.this.downService();
                        break;
                    } else {
                             out.write( userWord + "\n");
                    }
                    out.flush();
                } catch (IOException e) {
                    Client1.this.downService();

                }

            }
        }
    }
}

public class Client {

    public static String ipAddr = "127.0.0.1";
    public static int port = 1234;

    public static void main(String[] args) {

      //  button.addActionListener(event ->
          new Client1(ipAddr, port) ;
        Frame frame = new Frame();
        Label label = new Label("Чат");
        TextArea textArea = new TextArea();
        TextField textField = new TextField();
        Button button = new Button("Отправить");

        label.setBounds(20,70,80,30);
        textArea.setBounds(20,100,300,300);
        textField.setBounds(20,420,300,20);
        button.setBounds(150,450,80,30);
        frame.add(button);
        frame.add(label);
        frame.add(textArea);
        frame.add(textField);
        frame.setSize(350,550);
        frame.setTitle("chat");
        frame.setLayout(null);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }

        });
        frame.setVisible(true);



    }
}
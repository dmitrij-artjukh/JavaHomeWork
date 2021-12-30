package com.pb.artjukh.hw15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.time.LocalDateTime;


class Client1  extends JFrame {

    static Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private BufferedReader inputUser;
    static String addr;
    private static LocalDateTime ldt = LocalDateTime.now();
    public static String ipAddr = "127.0.0.1";
    public static int port = 1234;
    JTextArea clientText;
    JTextField msg;
    JPanel clip;
    JScrollPane clientScroll;
    JButton closeButton = new JButton("Close");
    JButton send = new JButton("Send");
    JLabel label1 = new JLabel("Echo Client - Multithreaded");
    Container cont;
    public Client1(String addr, int port) throws IOException {

        this.addr = addr;
        this.port = port;
        this.socket = new Socket(addr, port);
        cont = getContentPane();
        setSize(550, 500);
        setTitle("GUI Client");
        clip = new JPanel();
        msg = new JTextField(20);
        msg.setText("Hi");
        clip.setLayout(new FlowLayout(FlowLayout.CENTER));
        clientText = new JTextArea(20, 60);
        clientScroll = new JScrollPane(clientText);
        clip.add(label1);
        clip.add(clientText);
        clip.add(msg);
        clip.add(send);
        clip.add(closeButton);
        cont.add(clip);
        send.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        try
            {
                out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                new ReadMsg().start();
                new WriteMsg().start();
            } catch(
            IOException e1)
            {
                Client1.this.downService();
            }
            }
    });
        closeButton.addActionListener(
                e -> System.exit(0));
    }

     void downService() {
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
                    str = in.readLine();
                msg.setText("");
                clientText.append("\nServer says:" + in.readLine());;

            } catch (IOException e) {
               Client1.this.downService();
            }
        }
    }

    public class WriteMsg extends Thread {

        @Override
        public void run()  {
                String userWord;
                userWord = msg.getText();
                    out.println(msg.getText());
                   out.write( ldt.toString()+":"+userWord + "\n");
                out.flush();
            }
    }

    public static void main(String[] args) throws IOException {
        Client1 clientFrame = new Client1(ipAddr, port);
        clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clientFrame.setVisible(true);
    }

}
package main.java;

import org.apache.commons.lang3.SystemUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("start >>>");

        try (
            ServerSocket server = new ServerSocket(80);
            Socket socket = server.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            in.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("<<< end");
    }
}

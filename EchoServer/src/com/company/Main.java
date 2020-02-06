package com.company;

import java.io.IOException;
import java.net.ServerSocket;

/** This is a simple server app which can accept multiple clients
 * Created by Pramod Kondur
 */

public class Main {

    public static void main(String[] args) {

        try(ServerSocket serverSocket = new ServerSocket(5000)) {
            while(true) {
                new Echoer(serverSocket.accept()).start();
            }


        } catch(IOException e) {
            System.out.println("Server exception " + e.getMessage());
        }

    }
}

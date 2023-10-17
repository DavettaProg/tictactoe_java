
package network;

import java.io.*;
import java.net.*;
import java.util.*;


public class gameserver {
    private static final int PORT = 12345; // Puerto donde el servidor escuchará
    private static List<PrintWriter> clientOutputs = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Servidor Tic Tac Toe iniciado...");
        try (ServerSocket listener = new ServerSocket(PORT)) {
            while (true) {
                new ClientHandler(listener.accept()).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                InputStream input = socket.getInputStream();
                BufferedReader in = new BufferedReader(new InputStreamReader(input));
                out = new PrintWriter(socket.getOutputStream(), true);
                synchronized (clientOutputs) {
                    clientOutputs.add(out);
                }

                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println("Recibido: " + line);
                    synchronized (clientOutputs) {
                        for (PrintWriter writer : clientOutputs) {
                            if (writer != out) {
                                writer.println(line); // Enviamos el mensaje al otro cliente
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                synchronized (clientOutputs) {
                    clientOutputs.remove(out);
                }
            }
        }
    }
}
    


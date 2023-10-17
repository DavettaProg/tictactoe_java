package network;

import java.io.*;
import java.net.*;

public class gameclient {

    private static final String SERVER_ADDRESS = "localhost"; // Asume que el servidor está en la misma máquina; ajusta según sea necesario
    private static final int SERVER_PORT = 12345;
    
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    private boolean connected = false;

    public gameclient() {
        try {
            socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            connected = true;
            
            new MessageListener().start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isConnected() {
        return connected;
    }

    public void sendMessage(String message) {
        if (connected) {
            out.println(message);
        }
    }

    public void disconnect() {
        try {
            connected = false;
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class MessageListener extends Thread {
        @Override
        public void run() {
            try {
                String receivedMessage;
                while (connected && (receivedMessage = in.readLine()) != null) {
                    // Aquí procesas el mensaje recibido
                    // Por ejemplo, podrías emitir un evento o llamar a un método de callback para informar a la GUI sobre el mensaje
                    processReceivedMessage(receivedMessage);
                }
            } catch (IOException e) {
                if (connected) { // Si el cliente todavía debería estar conectado
                    e.printStackTrace();
                }
            }
        }
    }

    private void processReceivedMessage(String message) {
        // Aquí procesas el mensaje
        // Esta función puede ser personalizada para interpretar y actuar en base a los diferentes tipos de mensajes recibidos
    }
}

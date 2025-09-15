package projeto1.simple.http.client;

import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class SimpleHttpClient {

    public static void main(String[] args) {
        try {
            String endereco = JOptionPane.showInputDialog("Digite o endereço: ");

            Socket sock = new Socket(endereco, 80);
            PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            String linha = "";
            out.println("GET / HTTP/1.0\n");
            while ((linha = in.readLine()) != null) {
                System.out.println("echo: " + linha);
            }
        } catch (IOException e) {
            System.err.println("Problemas de IO");
        }
    }
}

import java.util.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.temporal.Temporal;

public class socketServer extends Thread implements Serializable {

	//run() method call to constructor + while loop
	public void run(ServerSocket s) {
		
		try {
		Socket n = new Socket();
		BufferedReader in = new BufferedReader(new InputStreamReader(n.getInputStream()));
		while(in.readLine() == null) {
				n = s.accept(); System.out.println("Connection Established Bug" + n.toString());}
		} catch(IOException exc) {
				exc.printStackTrace();
			}
				
				}
	
	public static void main(String[] args) throws NullPointerException {
		
		//Implement Socket Listener with specified socket #?
		try {
		ServerSocket ss = new ServerSocket(8080);
		Socket n = new Socket();
		Thread serv = new socketServer();
		serv = serverHandler(ss);
		//serv.start();
		System.out.println("Connection Closed " + n.toString());
		n.close();
		}catch(IOException exc) {
			exc.printStackTrace();
		}
		
		}
	
	public final static Thread serverHandler(ServerSocket s) {
		try {
			newHandler(s);
			String userDir = System.getProperty("user.dir");
			String path = Pattern.compile(s.getInetAddress().getHostAddress()).toString();
			System.out.printf("%s%n", "Connection Path Tree - - - " + userDir + "/" + path);
			}catch(IOException exc) {
		exc.printStackTrace();
		}
		System.out.printf("%s%n", "Closing Server Client Connection : Port 8080");
		return null;
	}
	
	public static void newHandler(ServerSocket s) throws IOException {
		try {
				System.out.printf("%s%n", "Connect Client to Begin: (port 8080)");
				Socket newSocket = new Socket();
				while(newSocket.getInetAddress() == null) {
					newSocket = s.accept(); System.out.println("Connection Established " + newSocket.toString());
		}}catch(IOException exc) {
			exc.printStackTrace();
		}}
}
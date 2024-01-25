public class TP9
{
	public static void main( String[] args )
	{
		try {
				import java.io.*;
				import java.net.*;
				
				// serveurTCP1.java 
				ServerSocket socketserver = new ServerSocket( 2016 );
				System.out.println( "serveur en attente" );
				Socket socket = sockserver.accept();
				System.out.println( "Connection d'un client" );
				DataInputStream dIn = new dataInputStream( socket.getInputStream() );
				System.out.println( "Message: " + dIn.readUTF() );
				
				socket.close();
				socketserver.close();
		}
		catch( Exception ex ) {
				System.out.println ( "erreur !" );
				ex.printStackTrace();
		}
	}
}

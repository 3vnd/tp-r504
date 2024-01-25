import java.io.*;
import java.net.*;

public class ClientTCP1
{
	public static void main( String[] args )
	{
		try
		{
			//ClientTCP.java
			Socket socket = new Socket( "LocalHost", 2016 );
			DataOutputStream dOut = new DataOutputStream( socket.getOutputStream() );
			dOut.writeUTF( "message test" );
			socket.close();
		}
		catch( Exception ex ) 
		{
			System.out.println( "erreur !" );
			ex.printStackTrace();
		}
	}
}

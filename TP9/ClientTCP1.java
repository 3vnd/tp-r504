import java.io.*;
import java.net.*;

public class ClientTCP1
{
	public static void main( String[] args )
	{
		//ClientTCP.java
		Socket socket = new Socket( "LocalHost", 2016 );
		DataOutputStream dOut = DataOutputStream( socket.getOutputStream() );
		dOut.writeUTF( "message test" );
		socket.close();
	}
}

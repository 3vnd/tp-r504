import java.io.*;
import java.net.*;

//ClientTCP.java
Socket socket = new Socket( "LocalHost", 2016 );
DataOutputStream dOut = DataOutputStream( socket.getOutputStream() );
dOut.writeUTF( "message test" );
socket.close();

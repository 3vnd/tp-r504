import java.io.*;
import java.net.*;

InetAddress addr = InetAdress.getLocalHost();
System.out.println( "adresse=" +addr.getHostName() );
...
DatagramSocket sock = new DatagramPacket( data, data.length, addr, 1234 );
DatagramSocket sock = new DatagramSocket();
sock.send(packet);
sock.close();

byte[] data = s.getBytes();

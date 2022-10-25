import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


public class Main {

    public static void main(String[] args) {

        try (FileOutputStream binaryFile = new FileOutputStream("data.dat");
             FileChannel binaryChannel = binaryFile.getChannel()) {

             ByteBuffer buffer = ByteBuffer.allocate(100);

//            byte[] outputBytes = "Hello World!".getBytes();
//            byte[] outputBytes2 = "Nice to meet you".getBytes();
//            //Chaining put/putInt
//            buffer.put(outputBytes).putInt(245).putInt(-98765).put(outputBytes2).putInt(1000);
//            buffer.flip();

//            SeekableByteChannel - interface methods
//            read(ByteBuffer) -    reads bytes beginning at the channel's current position, and after the read, updates the position accordingly.
//                                  updates the position accordingly.
//                                  Note that now we,re talking about the channel,s position, not the byte buffer,s position.
//                                  Of course, the bytes will be placed into the buffer starting at its current position.
//            write(ByteBuffer src) The same as read, except it writes. There,s one exception.
//                                  If a datasource is opened in APPEND mode, then the first write will take place starting
//                                  at the end of the datasource, rather than at position 0. After the write, the position
//                                  will be updated accordingly.
//            position()            returns the channel's position.
//            position(long)        sets the channel's position to the passed value
//            truncate(long)        truncates the size of the attached datasource to the passed value.
//            size()                returns the size of the attached datasource


            byte[] outputBytes = "Hello World!".getBytes();
            buffer.put(outputBytes);
            long int1Pos = outputBytes.length;
            buffer.putInt(245);
            long int2Pos = int1Pos + Integer.BYTES;
            buffer.putInt(-98765);
            byte[] outputBytes2 = "Nice to meet you".getBytes();
            buffer.put(outputBytes2);
            long int3Pos = int2Pos + Integer.BYTES + outputBytes2.length;
            buffer.putInt(1000);
            //Flip buffer resets pointer to first index, pointer stayed on the last index after the last write
            buffer.flip();

            binaryChannel.write(buffer);


            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
            FileChannel channel = ra.getChannel();

            ByteBuffer readBuffer = ByteBuffer.allocate(Integer.BYTES);
            channel.position(int3Pos);
            channel.read(readBuffer);
            readBuffer.flip();

            System.out.println("int3 = " + readBuffer.getInt());

            readBuffer.flip();
            channel.position(int2Pos);
            channel.read(readBuffer);
            readBuffer.flip();

            System.out.println("int2 = " + readBuffer.getInt());

            readBuffer.flip();
            channel.position(int1Pos);
            channel.read(readBuffer);
            readBuffer.flip();

            System.out.println("int1 = " + readBuffer.getInt());

            RandomAccessFile copyFile = new RandomAccessFile("datacopy.dat", "rw");
            FileChannel copyChannel = copyFile.getChannel();
            channel.position(0);
//            long numTransferred = copyChannel.transferFrom(channel, 0, channel.size());
            long numTransferred = channel.transferTo(0, channel.size(), copyChannel);
            System.out.println("Num transferred = " + numTransferred);

            channel.close();
            ra.close();
            copyChannel.close();

//            byte[] outputString = "Hello, world!".getBytes();
//            long str1Pos = 0;
//            long newInt1Pos = outputString.length;
//            long newInt2Pos = newInt1Pos + Integer.BYTES;
//            byte[] outputString2 = "Nice to meet you".getBytes();
//            long str2Pos = newInt2Pos + Integer.BYTES;
//            long newInt3Pos = str2Pos + outputString2.length;
//
//            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
//            intBuffer.putInt(245);
//            intBuffer.flip();
//            binaryChannel.position(newInt1Pos);
//            binaryChannel.write(intBuffer);
//
//            intBuffer.flip();
//            intBuffer.putInt(-98765);
//            intBuffer.flip();
//            binaryChannel.position(newInt2Pos);
//            binaryChannel.write(intBuffer);
//
//            intBuffer.flip();
//            intBuffer.putInt(1000);
//            intBuffer.flip();
//            binaryChannel.position(newInt3Pos);
//            binaryChannel.write(intBuffer);
//
//            binaryChannel.position(str1Pos);
//            binaryChannel.write(ByteBuffer.wrap(outputString));
//            binaryChannel.position(str2Pos);
//            binaryChannel.write(ByteBuffer.wrap(outputString2));
//
//            ByteBuffer readBuffer = ByteBuffer.allocate(100);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            byte[] inputString = new byte[outputBytes.length];
//            readBuffer.get(inputString);
//            System.out.println("inputString = " + new String(inputString));
//            System.out.println("int1 = " + readBuffer.getInt());
//            System.out.println("int2 = " + readBuffer.getInt());
//            byte[] inputString2 = new byte[outputBytes2.length];
//            readBuffer.get(inputString2);
//            System.out.println("inputString2 = " + new String(inputString2));
//            System.out.println("int3 = " + readBuffer.getInt());
//
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
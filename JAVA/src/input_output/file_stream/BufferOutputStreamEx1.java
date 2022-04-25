package input_output.file_stream;

import java.io.BufferedOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;


public class BufferOutputStreamEx1 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        {
            try {
                 fos = new FileOutputStream("./src/input_output/file_stream/123.txt");
                 bos = new BufferedOutputStream(fos, 20);

                for (int i = 0; i < 9; i++) {
                    bos.write(i);

                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}

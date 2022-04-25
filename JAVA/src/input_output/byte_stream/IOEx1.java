package input_output.byte_stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;


public class IOEx1 {
    public static void main(String[] args) {

        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;
        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;


        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        int data = 0;
        while ((data = input.read()) != -1) {
            output.write(data);
        }
        outSrc = output.toByteArray();
        try {
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Input Source : " + Arrays.toString(inSrc));
        System.out.println("Output Source : " + Arrays.toString(outSrc));
    }





}

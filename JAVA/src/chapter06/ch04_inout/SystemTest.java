package chapter06.ch04_inout;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemTest {
    public static void main(String[] args) {
        System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");

        int i;

        try {
            InputStreamReader irs = new InputStreamReader(System.in);
//            while((i = System.in.read()) != '\n'){
            while((i = irs.read()) != '\n'){
                System.out.print((char) i);
            }


        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}

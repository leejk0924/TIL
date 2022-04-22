package com.example.PUT.dto;

import java.io.FileWriter;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        /*
        FileWriter writer = null;

        try {
            writer = new FileWriter("test.txt");
            writer.write("감사합니다.");
            writer.write("고맙습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        */
        test1 test = new test1();
        test.output();
    }

}

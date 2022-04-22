package com.example.PUT.dto;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class test1 {
    public void output() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("txt1.txt");
            fw.write("감사합니다.");
            fw.write("고맙습니다11.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

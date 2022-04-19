package Chapter05.exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class APITest {
    public static void main(String[] args) {
        int[] lotto = {43, 3, 5, 12, 11, 4};
        Arrays.sort(lotto);

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] +" ");
        }
        System.out.println();
        EqualsMethod e = new EqualsMethod();
        e.i = 10;
        System.out.println(e);

        int[] copyList = Arrays.copyOf(lotto, 10);


        for (int i = 6; i < copyList.length; i++) {
            Random r = new Random();
            copyList[i] = r.nextInt(10);
        }
        for (int i = 0; i < copyList.length; i++) {
            System.out.print(copyList[i] + " ");

        }
        System.out.println();
        List objectList = new ArrayList();
        objectList.add(93);
        ArrayList<Integer> a = new ArrayList<Integer>();
        Integer intdata = (Integer) objectList.get(0);

    }
}

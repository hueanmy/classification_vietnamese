package Func;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by katie on 16/04/2017.
 */
public class testFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/katie/Destop/testVietnamese.txt"));
        String line = null;

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            for (String str : values) {
                System.out.println(str);
            }
        }
        br.close();
    }
}


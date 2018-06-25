package util;

import java.io.*;

/**
 * Created by zhangfan on 2018/6/25 11:41
 */
public class IOutil {
    public void copy(String s1, String s2) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(s2))) {
                bw.write(s1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

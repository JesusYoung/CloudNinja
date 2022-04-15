package cn.com.yangshj.alert.websocket;

import java.io.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Create by yangshj on 4/13/22
 */
@Service
public class FileReadWriteUtils {



    private long startFileSize = 0;
    private void readFiles2(String path, String fileName) {

        File logFile = new File(path + "/" + fileName);

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(logFile, "r");

            ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
            exec.scheduleWithFixedDelay(() -> {
                try {
                    randomAccessFile.seek(startFileSize);
                    String tmp = "";
                    while ((tmp = randomAccessFile.readLine()) != null) {
                        System.out.println("读取日志内容==================> " + tmp);
                    }
                    startFileSize = randomAccessFile.length();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }, 0, 1, TimeUnit.SECONDS);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void writeFiles(String path, String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(path + "/" + fileName, true);

            fileWriter.write("xxxxxxxxxxxxxxxxxxxxxxxx: xxxxxxadgafasfasaojasj \n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

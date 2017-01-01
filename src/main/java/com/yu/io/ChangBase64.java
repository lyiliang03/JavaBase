package com.yu.io;
import java.util.Base64;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Created by kevin on 2017/1/1
 * 把文件转为二进制流，然后转回
 * 支持.jpg,png,gif,docx,xlsx,pdf
 */
public class ChangBase64 {
    private static java.util.Base64 decoder;
    private static java.util.Base64 encoder;

/*    public static void main(String[] args) {
        //jpg,png,gif,docx,xlsx,pdf
        String base64String = ChangeToBase64(new File("E:\\testchange\\10.gif"));
        System.out.println(base64String);
        Base64ToChange(base64String,new File("E:\\1.gif"));
       // ReadWriteTxt.WriteTxt(base64String, "E:\\11.txt");
    }*/


    static byte[] ChangeToBase64(File file) {
        FileInputStream fin = null;
        BufferedInputStream bin = null;
        ByteArrayOutputStream baos = null;
        BufferedOutputStream bout = null;
        try {

            fin = new FileInputStream(file);

            bin = new BufferedInputStream(fin);

            baos = new ByteArrayOutputStream();

            bout = new BufferedOutputStream(baos);
            byte[] buffer = new byte[1024];
            int len = bin.read(buffer);
            while (len != -1) {
                bout.write(buffer, 0, len);
                len = bin.read(buffer);
            }

            bout.flush();
            byte[] bytes = baos.toByteArray();

            return bytes;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fin.close();
                bin.close();
                bout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    static void Base64ToChange(String base64sString,File file) {
        BufferedInputStream bin = null;
        FileOutputStream fout = null;
        BufferedOutputStream bout = null;
        try {
            byte[] bytes = decoder.getDecoder().decode(base64sString);
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

            bin = new BufferedInputStream(bais);

            //File file = new File("E:\\11.xlsx");

            fout = new FileOutputStream(file);

            bout = new BufferedOutputStream(fout);

            byte[] buffers = new byte[1024];
            int len = bin.read(buffers);
            while (len != -1) {
                bout.write(buffers, 0, len);
                len = bin.read(buffers);
            }

            bout.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bin.close();
                fout.close();
                bout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

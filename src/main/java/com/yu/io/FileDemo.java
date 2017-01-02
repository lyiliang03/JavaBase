package com.yu.io;
import java.io.File;
import java.io.IOException;
/**
 * Created by kevin on 2017/1/2.
 */
public class FileDemo {
    //java.io.File类用于表示文件（目录），不能用于文件内容的访问

    public static void main(String[] args) throws IOException {

        File file=new File("E:\\javastudy");
        System.out.println(file.exists());//判断file目录是否存在
        if(!file.exists())
        {
            file.mkdir();
        }

        File file2=new File("E:\\javastudy\\javaio\\javademo");
        if(!file2.exists()){
            file2.mkdirs();//只能创建多级目录
            //file2.mkdir();//只能创建一级目录

        }else{
            file2.delete();
        }

        System.out.println(file.isDirectory());//判断是否是一个目录

        System.out.println(file.isFile());//判断是否是一个文件


        File file3=new File("E:\\javastudy","study.txt");
        if(!file3.exists()){
            file3.createNewFile();
        }else{
           // file3.delete();
            file3.exists();
        }

        //获得当前文件夹下所有文件和文件夹名称
        String[] s = file.list();
        for(int i = 0;i < s.length;i++){
            System.out.println(s[i]);
        }

        //获得文件对象
        File[] f5 = file.listFiles();
        for(int i = 0;i < f5.length;i++){
            System.out.println(f5[i]);
        }

        System.out.println("判断是否是文件:"+file3.isFile());
        System.out.println("获得文件长度:"+file3.length());
        System.out.println("判断是否是文件夹:"+file.isDirectory());
        System.out.println("获得文件的绝对路径:"+file3.getAbsolutePath());
        System.out.println("获得文件夹:"+file.getName());
        System.out.println("获得文件名:"+file3.getName());
        System.out.println("获得父路径:"+file3.getParent());



    }

}

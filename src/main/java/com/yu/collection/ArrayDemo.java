package com.yu.collection;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.nio.ByteBuffer;

/**
 * Created by kevin on 2017/1/1.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //输出一个数组
        int[] intArray = { 1, 2, 3, 4, 5 };
        String intArrayString = Arrays.toString(intArray);
        System.out.println(intArrayString);

        //从一个数组创建数组列表
        String[] stringArray = { "a", "b", "c", "d", "e" };
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(arrayList);
        System.out.println(stringArray[0]);
        //检查一个数组是否包含某个值
        String[] stringArray1 = { "a", "b", "c", "d", "e" };
        boolean b = Arrays.asList(stringArray1).contains("g");
        System.out.println(b);
        //连接两个数组
        int[] intArray1 = { 1, 2, 3, 4, 5 };
        int[] intArray2 = { 6, 7, 8, 9, 10 };
       //把提供的数组元素放入一个字符串
        String j = org.apache.commons.lang.StringUtils.join(new String[] { "a", "b", "c" }, ", ");
        System.out.println(j);
         //连接两个数组
        int[] intArray3 = { 1, 2, 3, 4, 5 };
        int[] intArray4 = { 6, 7, 8, 9, 10 };

        int[] combinedIntArray = org.apache.commons.lang.ArrayUtils.addAll(intArray3, intArray4);
        String intArray5 = Arrays.toString(combinedIntArray);
        System.out.println(intArray5);

        //将一个数组列表转换为数组
        String[] stringArray2 = { "a", "b", "c", "d", "e" };
        ArrayList<String> arrayList1 = new ArrayList<String>(Arrays.asList(stringArray2));
        String[] stringArr = new String[arrayList1.size()];
        arrayList1.toArray(stringArr);
        for (String s : stringArr)
            System.out.println(s);

        //将一个数组转换为集（set）
        Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
        System.out.println(set);

        //逆向一个数组
        int[] intArray6 = { 1, 2, 3, 4, 5 };
        org.apache.commons.lang.ArrayUtils.reverse(intArray6);
        System.out.println(Arrays.toString(intArray6));

        // 移除数组中的元素
        int[] intArray7 = { 1, 2, 3, 4, 5 };
        int[] removed = org.apache.commons.lang.ArrayUtils.removeElement(intArray7, 3);//create a new array
        System.out.println(Arrays.toString(removed));

        //将整数转换为字节数组
        byte[] bytes = ByteBuffer.allocate(4).putInt(8).array();

        for (byte t : bytes) {
            System.out.format("0x%x ", t);
        }
    }
}

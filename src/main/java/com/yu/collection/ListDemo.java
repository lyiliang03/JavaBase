package com.yu.collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.List;
/**
 * Created by kevin on 2016/12/28.
 *如果涉及到“栈”、“队列”、“链表”等操作，请优先考虑用List。至于是那个List则分如下：
 1、对于需要快速插入、删除元素，则需使用LinkedList'
 2、对于需要快速访问元素，则需使用ArrayList。
 3、对于“单线程环境”或者“多线程环境，但是List仅被一个线程操作”，需要考虑使用非同步的类，
 如果是“多线程环境，切List可能同时被多个线程操作”，考虑使用同步的类（如Vector）。
 */
public class ListDemo {
    private static final int COUNT = 100000;

    private static ArrayList arrayList = new ArrayList();
    private static LinkedList linkedList = new LinkedList();
    private static Vector vector = new Vector();

    public static void insertToList(List list){
        long startTime = System.currentTimeMillis();

        for(int i = 0 ; i < COUNT ; i++){
            list.add(0,i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("插入 " + COUNT + "元素" + getName(list) + "花费 " + (endTime - startTime) + " 毫秒");
    }

    public static void deleteFromList(List list){
        long startTime = System.currentTimeMillis();

        for(int i = 0 ; i < COUNT ; i++){
            list.remove(0);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("删除" + COUNT + "元素" + getName(list) + "花费 " + (endTime - startTime) + " 毫秒");
    }

    public static void readList(List list){
        long startTime = System.currentTimeMillis();

        for(int i = 0 ; i < COUNT ; i++){
            list.get(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("读取" + COUNT + "元素" + getName(list) + "花费 " + (endTime - startTime) + " 毫秒");
    }

    private static String getName(List list) {
        String name = "";
        if(list instanceof ArrayList){
            name = "ArrayList";
        }
        else if(list instanceof LinkedList){
            name = "LinkedList";
        }
        else if(list instanceof Vector){
            name = "Vector";
        }
        return name;
    }

    public static void main(String[] args) {
        insertToList(arrayList);
        insertToList(linkedList);
        insertToList(vector);

        System.out.println("--------------------------------------");

        readList(arrayList);
        readList(linkedList);
        readList(vector);

        System.out.println("--------------------------------------");

        deleteFromList(arrayList);
        deleteFromList(linkedList);
        deleteFromList(vector);
    }
}

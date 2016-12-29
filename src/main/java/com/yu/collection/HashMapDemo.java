package com.yu.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
public class HashMapDemo {
    public static void main(String arg[])
    {
        HashMap<String,String> hashMap=new HashMap<String, String>();
        hashMap.clear();
        hashMap.put("cn","中国");
        hashMap.put("jp","日本");
        hashMap.put("usa","美国");
        hashMap.put("fr","法国");
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.size());
        System.out.println(hashMap);
        hashMap.remove("jp");
        System.out.println(hashMap.toString());
        System.out.println("cn:"+hashMap.values());
        System.out.println("cn:"+hashMap.containsKey("cn"));
        System.out.println("cn:"+hashMap.get("cn"));
        System.out.println("cn:"+hashMap.keySet());
        //采用Iterator
        Iterator it=hashMap.keySet().iterator();
       while(it.hasNext()){
           String key=(String)it.next();
           System.out.println("key:" + key);
           System.out.println("value:" + hashMap.get(key));
       }

        //遍历HashMap的另一个方法
        Set<Entry<String, String>> sets = hashMap.entrySet();
        for(Entry<String, String> entry : sets) {
            System.out.print(entry.getKey() + ", ");
            System.out.println(entry.getValue());
        }

    }




}

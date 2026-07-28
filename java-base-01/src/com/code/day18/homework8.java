package com.code.day18;
//开发提示：可以使用Map，key是字母，value是该字母的次数
//
//效果演示：例如：String str = "Your future depends on your dreams, so go to sleep.";


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class homework8 {
    public static void main(String[] args) {
        String str = "Your future depends on your dreams, so go to sleep.";
        str = str.replaceAll("[^a-zA-Z]", "");//去掉非字母的字符
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.replace(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);

        Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
        TreeMap<Integer,String> tree = new TreeMap<>();
        for (Map.Entry<Character,Integer> entry : entrySet) {
            //System.out.println(entry);

            Integer count = entry.getValue();
            if(tree.containsKey(count)){
                tree.replace(count,tree.get(count)+"," + entry.getKey());
            }else{
                tree.put(count, entry.getKey()+"");
            }
        }

        Map.Entry<Integer, String> maxEntry = tree.pollLastEntry();
        System.out.println(maxEntry.getValue()+"字母出现次数最多，出现次数为" + maxEntry.getKey());
    }


}

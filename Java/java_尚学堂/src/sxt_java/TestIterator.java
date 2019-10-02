package sxt_java;

import java.util.*;

/**
 * 测试迭代器遍历List Set Map
 * @author 智障过人的laoxie
 * @create 2019-03-13 21:24 星期三
 *
 */
public class TestIterator {
    public static void main(String[] args) {
        testIteratorList();
        testIteratorSet();
        testIteratorMap();

    }

    public static void testIteratorList() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        //使用itrator遍历List
        for (Iterator<String> iter = list.iterator();iter.hasNext();){
            String temp = iter.next();
            System.out.println(temp);
        }

    }

    public static void testIteratorSet() {
        Set<String> set = new HashSet<>();
        set.add("aa1");
        set.add("bb1");
        set.add("cc1");
        //使用itrator遍历set
        for (Iterator<String> iter = set.iterator();iter.hasNext();){
            String temp = iter.next();
            System.out.println(temp);
        }

    }

    public static void testIteratorMap() {
        Map<Integer, String> map1 = new HashMap<>();

        map1.put(100,"aa2");
        map1.put(200,"bb2");
        map1.put(300,"cc2");
        //第一种遍历Map的方式
        Set<Map.Entry<Integer,String>> ss = map1.entrySet();
        for (Iterator<Map.Entry<Integer,String>> iter = ss.iterator();iter.hasNext();){
            Map.Entry<Integer,String> temp = iter.next();
            System.out.println(temp.getKey()+"--"+temp.getValue());
        }

        //第二种遍历Map的方式
        Set<Integer> keySet = map1.keySet();
        for (Iterator<Integer> iter = keySet.iterator();iter.hasNext();){
            Integer key = iter.next();
            System.out.println(key + "-----"+map1.get(key));
        }

    }
}

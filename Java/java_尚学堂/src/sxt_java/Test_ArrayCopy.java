package sxt_java;

import java.util.Arrays;

/**
 * @author 智障过人的laoxie
 * @create 2019-02-27 10:22 星期三
 */
public class Test_ArrayCopy {
    public static void main(String[] args) {
//        testBasicCopy1();
//        testBasicCopy2();

        String[] str = {"阿里","京东","尚学堂","百度","亚马孙"};
//        removeElement(str,1);
        extendRange(str);
    }

    public static void testBasicCopy1() {
        String[] s1 = {"aa","bb","cc","dd","ee"};
        String[] s2 = new String[10];
        System.arraycopy(s1,2,s2,6,3);
        for(int i=0;i<s2.length;i++){
            System.out.println(i+"---"+s2[i]);
        }
    }
//  测试从数组中删除某个元素（本质上还是数组的拷贝）
    public static void testBasicCopy2() {
        String[] s1 = {"aa","bb","cc","dd","ee"};
        String[] s2 = new String[5];
        System.arraycopy(s1,3,s1,2,s1.length-3);
        for(int i=0;i<s1.length;i++){
            System.out.println(i+"---"+s1[i]);
        }
        System.out.println(s1.length);
    }
//  删除数组中指定索引位置的元素，并将原数组返回
    public static String[] removeElement(String[] s,int index) {
        System.arraycopy(s,index+1,s,index,s.length-index-1);
        s[s.length-1]=null;
        for(int i=0;i<s.length;i++){
            System.out.println(i+"---"+s[i]);
        }
        return s;
    }

    //数组的扩容（本质上是：先定义一个更大的数组，然后将原数组内容原封不动的拷贝到新数组中）
    public static String[] extendRange(String[] s1){
//        String[] s1 = {"aa","bb","cc"};
        String[] s2 = new String[s1.length+10];
        System.arraycopy(s1,0,s2,0,s1.length);//将是s1中所有元素复制到s2
        for (String temp:s2){
            System.out.println(temp);
        }
        return s2;
    }

}

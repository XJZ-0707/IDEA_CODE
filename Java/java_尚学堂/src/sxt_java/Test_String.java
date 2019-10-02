package sxt_java;

/**
 * @author 智障过人的laoxie
 * @create 2019-02-26 16:19 星期二
 */
//public class 尚学堂java.sxt_java.Test_String {
//    public static void main(String[] args) {
//        String str = "abc";
//        String str2 = new String("def");
//        String str3 = "abc" + "def";
//        String str4 = "18" + 19;//不是加法
//        System.out.println(str4 + str);
//        System.out.println(str4 == str);
//    }
//}


public class Test_String {
    public static void main(String[] args) {
        String s1 = "core java";
        String s2 = "Core java";
        System.out.println(s1.charAt(3));//提取下标为3的字符
        System.out.println(s1.length());//字符串长度
        System.out.println(s2.length());
        System.out.println(s1.equals(s2));//比较两个字符串是否相等
        System.out.println(s1.equalsIgnoreCase(s2));//比较两个字符串是否相等,忽略大小写
        System.out.println(s1.indexOf("java"));//s1中是否包含java
        String s = s1.replace(' ','*');//将s1中的空格替换成*
        System.out.println(s);
    }
}


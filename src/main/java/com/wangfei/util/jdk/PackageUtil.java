package com.wangfei.util.jdk;

import java.util.Arrays;

/**
 * @Title: 工程包内的工具类
 * @Description: 用来获取包中的信息
 * @Author Fay Wang
 * @Date 2022/1/16 19:17
 * @Version 1.0
 */
public final class PackageUtil {

    public static void main(String[] args) {
        String src = "java.util.sql.sqlSessionFactory";
        String src1 = "java.util.list";
        String trimStr = "java";
        String trim1 = trimLeft(src, trimStr);
        System.out.println(trim1);
        System.out.println(trimLeft(src1, trimStr));
        // .util.sql.sqlSessionFactory
        //.util.list
        String[] strArr = trim1.split("\\.");
        String join = join(strArr, "-");
        System.out.println(join);
        System.out.println(Arrays.toString(strArr));

    }

    /**
     * 使用连接符连接字符串数组
     * @param strArr 字符串数组
     * @param conn   字符链接符
     * @return join的字符串
     */
    private static String join(String[] strArr, String conn) {
        if (null == strArr || strArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                // eg: a-b-c
                sb.append(conn);
            }
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    /**
     * 若字符串的起始以trimStr开始，则截断取其后部分的字符串
     * @param src       源字符串
     * @param trimStr   需要被清除的字符串
     * @return  处理之后的字符串
     */
    private static String trimLeft(String src, String trimStr) {
        if (null == src || src.isEmpty()) {
            return "";
        }
        if (null == trimStr || trimStr.isEmpty()) {
            return src;
        }

        if (src.equals(trimStr)) {
            return "";
        }

        while (src.startsWith(trimStr)) {
            src = src.substring(trimStr.length());
        }
        return src;
    }
}

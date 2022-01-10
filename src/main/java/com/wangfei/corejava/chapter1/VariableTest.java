package com.wangfei.corejava.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VariableTest {
    public static void main(String[] args) {
        //ArrayCopyMethod();
        int[][] yongHuiTri = YongHuiTri(10);
        showYonghuiTri(yongHuiTri);
        Object o = new Object();
        String s = new String();
        System.out.println(Arrays.deepToString(yongHuiTri));
    }

    private static void showYonghuiTri(int[][] yongHuiTri) {
        for (int[] row : yongHuiTri) {
            for (int e : row) {
                System.out.printf("%4d", e);
            }
            System.out.println();
        }
    }

    private static int[][] YongHuiTri(int n) {
        int[][] tri = new int[n][];
        for(int i = 0; i < n; i++) {
            tri[i] = new int[i + 1];
            tri[i][0] = 1; tri[i][i] = 1;
            for(int j = 1; j < i; j++) {
                tri[i][j] = tri[i - 1][j - 1] + tri[i - 1][j];
            }
        }
        return tri;
    }

    private static void ArrayCopyMethod() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);


        list.forEach(System.out::print);
        System.out.println();
        ArrayList<Integer> copied = new ArrayList<>(list);
        copied.forEach(System.out::print);
        System.out.println();
        list.set(2, 6);
        list.forEach(System.out::print);
        System.out.println();
        copied.forEach(System.out::print);

        System.out.println("_____________________________--");
        ArrayList<Integer> copied2 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4));
    }


}



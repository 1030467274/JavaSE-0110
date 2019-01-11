package demo.day02;

import java.util.Scanner;

/**
 *  输入两个正整数 m 和 n，求其最大公约数和最小公倍数
 */
public class Homework_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入两个正整数，分别为m、n");
        int m = in.nextInt();
        int n = in.nextInt();
        if(m<n) {
            int temp = m;
            m = n;
            n = temp;
        }
        System.out.println("它们最大公约数为：" +maxCommonDivisor(m,n));
        System.out.println("它们最小公倍数为：" + m*n / maxCommonDivisor(m,n));
    }
    //      求最大公约数
    private static int maxCommonDivisor(int m, int n) {
        if(m%n == 0) return n;
        return maxCommonDivisor(n,m%n);
    }
    }


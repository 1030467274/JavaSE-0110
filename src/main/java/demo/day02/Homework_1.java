package demo.day02;
/**
 * 判断 101-200 之间有多少个素数，并输出所有素数。素数：只能被 1 和它本身整除的正整数（1 不是素数）
 */
public class Homework_1 {
    public static void main(String[] args) {
        int i,j;
        for (i = 101; i < 200; i++) {
            for (j = 2; j < i; j++) {
                if (i%j==0) {
                    break;
                }
            }if (i==j) {
                System.out.println(i);
            }
        }
    }
}
package demo.day02;
/**
 * 接收用户输入的成绩 int score
 * 大于等于 85，输出 A
 * 大于等于60， 输出 B
 * 小于 60，输出 C
 */

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入学生的成绩");
        int score=in.nextInt();
        in.close();
       String mark =(score>=85)?"A":(score>60)?"B":"C";
       System.out.println(mark);
       /* if(score>=85){
            System.out.println("A");
        }else if(score>=60){
            System.out.println("B");
        }else{
            System.out.println("C");
        }*/
    }
}

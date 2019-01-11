package demo.day02;
/**
 * 打印出所有的“水仙花数”，所谓“水仙花数”是指一个三位数，其各位数字立方和等于该数本身
 * 例如：153 是一个“水仙花数”，因为 153 = 1的三次方 ＋ 5的三次方 ＋ 3的三次方
 */
public class Homework_2 {
    public static void main(String[] args) {
        for(int x=100;x<1000;x++){
            //获取三位数的个十百位
            int ge=x%10;
            int shi=x/10%10;
            int bai=x/10/10%10;
            //判断是否为水仙花数
            if((ge*ge*ge+shi*shi*shi+bai*bai*bai)==x){
                System.out.println("水仙花数："+x);
            }
        }
    }
}

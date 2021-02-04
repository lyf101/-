/**
 * Date:2021/2/4 11:13
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        int sum=0;
//第一个for循环是遍历计算五文钱能买多少只公鸡
        for(int i=0;5*i<=100;i++){
//第二个for循环计算三文钱能买多少母鸡
            for(int b=0;3*b<100;b++){
//第三个for循环计算1文钱能买多少只雏鸡
                for(int c=0;c<100;c++){
//先执行最里面这个for循环计算能买多少只雏鸡
                    if(15*i+9*b+c==300&&i+b+c==100){
//if判断能买公鸡多少只母鸡多少只雏鸡多少只,且他们总和等于100
                        sum+=1;
                        System.out.println("第"+sum+"种买法:"+"公鸡:"+i+"母鸡"+b+"雏鸡:"+c);
                    }
                }
            }
        }
    }
}
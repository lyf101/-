/**
 * Date:2021/2/4 11:13
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<20;i++){
            for(j=1;j<33;j++){
                k=100-i-j;
                if(i*5+j*3+(k/3)==100&&k%3==0){
                    System.out.println("公鸡:"+i+"母鸡:"+j+"雏鸡:"+k);
                }
            }
        }
        String abc = concat(1, "abc");
        System.out.println(abc);
    }
    public static String concat(int a,String str){
        String str2=str+a;
        return str2;
    }
}
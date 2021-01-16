package cn.lyf;

import java.util.ArrayList;
import java.util.Scanner;

public class demo10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = sc.nextInt();
        String str = num+"=";
        ArrayList<Integer> list = new ArrayList<>();
        list = zhenZhengshu(num,list);
        for (int i = 0;i<list.size();i++){
            if (i==list.size()-1){
                str=str+list.get(i);
            }else{
                str=str+list.get(i)+"*";
            }
        }
        System.out.println(str);
    }

    static ArrayList zhenZhengshu(int num, ArrayList list){
        if(demo9.zhiShu(num)){
            list.add(num);
            return list;
        }
        for (int i=2;i<num;i++){
            if(num%i==0){
                if(demo9.zhiShu(i)){
                    list.add(i);
                    num = num/i;
                    break;
                }else{
                    break;
                }
            }
        }
        return zhenZhengshu(num,list);
    }
}

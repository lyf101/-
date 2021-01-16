package test;

public class Demo2Method {
    public static void main(String[] args) {

        int row = 5;
        String str = "******";
        printStr(row,str);
        System.out.println("-----------------------------");
        int[] arr = {1,2,3,4,5};
        System.out.println(printArray(arr));

        //输出给定乘法表
        printX(5);

    }

    public static void printStr(int row,String msg){

        for(int i = 0;i < row; i++){
            if(i == 2){
                return;
            }
            System.out.println(msg);
        }

    }

    public static String printArray(int[] array){
        String str = "[";

        for(int i = 0;i < array.length;i++){
            str += array[i];
            if(i == array.length-1){
                str += "]";
            }else str += ",";
        }

        return str;
    }


    public static void printX(int i){
        //有几行
        for(int j = 1;j <= i; j++){
            //每行有几列
            for(int k = 1;k <= j; k++){
                System.out.print(j+"*"+k+"="+j*k+"  ");
            }
            //下一行输出
            System.out.println();
        }
    }
}

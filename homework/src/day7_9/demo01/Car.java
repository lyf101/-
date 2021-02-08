package day7_9.demo01;

/**
 * Date:2021/2/8 9:44
 * Author:lyf
 */
public class Car {
    private String carNum;
    private int carVel;
    private double carWei;

    public Car() {
        this.carNum = "XX1234";
        this.carVel = 100;
        this.carWei = 100;
    }

    public Car(String carNum, int carVel, double carWei) {
        this.carNum = carNum;
        this.carVel = carVel;
        this.carWei = carWei;
    }

    public void up(){
        this.carVel++;
    }
    public void down(){
        this.carVel--;
    }

    public void alterCarNum(String carNum){
        this.carNum = carNum;
    }

    public double selectCarWei(){
        return this.carWei;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNum='" + carNum + '\'' +
                ", carVel=" + carVel +
                ", carWei=" + carWei +
                '}';
    }

}

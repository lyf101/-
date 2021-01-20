package demo01;

/**
 * Date:2021/1/20 11:13
 * Author:lyf
 */
//2>接口直接多继承
//3>接口不能创建对象
public interface IAmphibiable extends ISwimable,IWalkable{
    //在该接口中，存在三个抽象方法，其中两个是继承的
    public void eat();
}

package day5_6.demo1;

/**
 * Date:2021/2/4 19:32
 * Author:lyf
 */
public class Test {
    private int currentPage;
    private int totalCount;
    private int pageSize;

    public void getTotalPage(){
        Double totalPage = totalCount*1.0/pageSize;
        System.out.println(Math.ceil(totalPage));
    }
    public void getNextPage(){
        System.out.println(currentPage+1);

    }
    public void getPrePage(){
        System.out.println(currentPage-1);
    }
}

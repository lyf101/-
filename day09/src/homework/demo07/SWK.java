package homework.demo07;

/**
 * Date:2021/1/19 19:25
 * Author:lyf
 */
public class SWK extends Prentice {
    private String formula;

    public void doMaigre(){
        System.out.println(super.getName()+"吃斋");
    }
    public void extDevil(){
        System.out.println(super.getName()+"降妖");
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return super.toString()+"SWK{" +
                "formula='" + formula + '\'' +
                '}';
    }
}

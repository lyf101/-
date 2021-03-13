package cn.lyf.domain;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date:2021/3/13 18:39
 * Author:lyf
 */
public class Good {
    private Long id;
    private String productName;
    private String dirName;
    private BigDecimal costPrice;
    private BigDecimal cutoff;
    private BigDecimal salePrice;
    private String supplier;
    private String brand;
    private String place;
    private String sellingPoint;
    private String period;
    private Date productDate;
    private String storage;

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String productDate = sdf.format(this.productDate);
        return "Good{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", dirName='" + dirName + '\'' +
                ", costPrice=" + costPrice +
                ", cutoff=" + cutoff +
                ", salePrice=" + salePrice +
                ", supplier='" + supplier + '\'' +
                ", brand='" + brand + '\'' +
                ", place='" + place + '\'' +
                ", sellingPoint='" + sellingPoint + '\'' +
                ", period='" + period + '\'' +
                ", productDate=" + productDate +
                ", storage='" + storage + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getCutoff() {
        return cutoff;
    }

    public void setCutoff(BigDecimal cutoff) {
        this.cutoff = cutoff;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getSellingPoint() {
        return sellingPoint;
    }

    public void setSellingPoint(String sellingPoint) {
        this.sellingPoint = sellingPoint;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
}

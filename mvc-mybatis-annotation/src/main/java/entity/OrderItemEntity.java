package entity;

import base.BaseEntity;

/**
 * 描述：订单项
 *
 * @author YangFuXi Date Time 2018/11/7 17:58
 */
public class OrderItemEntity extends BaseEntity {
    private String spid;//商品ID
    private String spmc;//商品名称
    private Double spjg;//商品价格
    private Float zk;//折扣
    private Double sjjg;//实际价格
    private Integer sl;//数量

    public String getSpid() {
        return spid;
    }

    public void setSpid(String spid) {
        this.spid = spid;
    }

    public String getSpmc() {
        return spmc;
    }

    public void setSpmc(String spmc) {
        this.spmc = spmc;
    }

    public Double getSpjg() {
        return spjg;
    }

    public void setSpjg(Double spjg) {
        this.spjg = spjg;
    }

    public Float getZk() {
        return zk;
    }

    public void setZk(Float zk) {
        this.zk = zk;
    }

    public Double getSjjg() {
        return sjjg;
    }

    public void setSjjg(Double sjjg) {
        this.sjjg = sjjg;
    }

    public Integer getSl() {
        return sl;
    }

    public void setSl(Integer sl) {
        this.sl = sl;
    }
}

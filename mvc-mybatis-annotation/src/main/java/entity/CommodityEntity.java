package entity;

import base.BaseEntity;

/**
 * 描述：商品
 *
 * @author YangFuXi Date Time 2018/11/7 18:01
 */
public class CommodityEntity extends BaseEntity {
    private String mc;//名称
    private String sm;//说明
    private Double jg;//价格
    private Float zk;//折扣
    private Double sjjg;//实际价格

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public Double getJg() {
        return jg;
    }

    public void setJg(Double jg) {
        this.jg = jg;
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
}

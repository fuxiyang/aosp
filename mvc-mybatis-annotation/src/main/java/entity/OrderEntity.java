package entity;

import base.BaseEntity;

import java.util.List;

/**
 * 描述：订单实体
 *
 * @author YangFuXi Date Time 2018/11/7 17:46
 */
public class OrderEntity extends BaseEntity {
    private String yhid;//用户ID
    private List<OrderItemEntity> orderItems;//订单项
    private Double ddzj;//订单总价
    private Boolean sffk;//是否已付款
    private String yjdz;//邮寄地址

    public String getYhid() {
        return yhid;
    }

    public void setYhid(String yhid) {
        this.yhid = yhid;
    }

    public List<OrderItemEntity> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemEntity> orderItems) {
        this.orderItems = orderItems;
    }

    public Double getDdzj() {
        return ddzj;
    }

    public void setDdzj(Double ddzj) {
        this.ddzj = ddzj;
    }

    public Boolean getSffk() {
        return sffk;
    }

    public void setSffk(Boolean sffk) {
        this.sffk = sffk;
    }

    public String getYjdz() {
        return yjdz;
    }

    public void setYjdz(String yjdz) {
        this.yjdz = yjdz;
    }
}

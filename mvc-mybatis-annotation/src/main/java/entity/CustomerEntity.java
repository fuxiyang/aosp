package entity;

import base.BaseEntity;

/**
 * 描述：消费者，用户（）
 *
 * @author YangFuXi Date Time 2018/11/7 15:43
 */
public class CustomerEntity extends BaseEntity {
    private String mc;//名称
    private String mm;//密码
    private String dhhm;//电话号码
    private String yx;//邮箱

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm;
    }

    public String getDhhm() {
        return dhhm;
    }

    public void setDhhm(String dhhm) {
        this.dhhm = dhhm;
    }

    public String getYx() {
        return yx;
    }

    public void setYx(String yx) {
        this.yx = yx;
    }
}

package entity.simple;

/**
 * 描述：案件信息表
 *
 * @author YangFuXi Date Time 2018/9/28 11:08
 */
public class IncidentEntity {
    private String id;//ID
    private String afdz;//案发地址
    private String ajms;//案件描述
    private String zgjg;//主管机构
    private String ssdq;//所属地区
    private Long lasj;//立案时间
    private Long cjsj;//创建时间
    private Long gxsj;//更新时间
    private String czz;//操作者
    private Boolean yxx;//有效性

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAfdz() {
        return afdz;
    }

    public void setAfdz(String afdz) {
        this.afdz = afdz;
    }

    public String getAjms() {
        return ajms;
    }

    public void setAjms(String ajms) {
        this.ajms = ajms;
    }

    public String getZgjg() {
        return zgjg;
    }

    public void setZgjg(String zgjg) {
        this.zgjg = zgjg;
    }

    public String getSsdq() {
        return ssdq;
    }

    public void setSsdq(String ssdq) {
        this.ssdq = ssdq;
    }

    public Long getLasj() {
        return lasj;
    }

    public void setLasj(Long lasj) {
        this.lasj = lasj;
    }

    public Long getCjsj() {
        return cjsj;
    }

    public void setCjsj(Long cjsj) {
        this.cjsj = cjsj;
    }

    public Long getGxsj() {
        return gxsj;
    }

    public void setGxsj(Long gxsj) {
        this.gxsj = gxsj;
    }

    public String getCzz() {
        return czz;
    }

    public void setCzz(String czz) {
        this.czz = czz;
    }

    public Boolean getYxx() {
        return yxx;
    }

    public void setYxx(Boolean yxx) {
        this.yxx = yxx;
    }

    @Override
    public String toString() {
        return "IncidentEntity{" +
                "id='" + id + '\'' +
                ", afdz='" + afdz + '\'' +
                ", ajms='" + ajms + '\'' +
                ", zgjg='" + zgjg + '\'' +
                ", ssdq='" + ssdq + '\'' +
                ", lasj=" + lasj +
                ", cjsj=" + cjsj +
                ", gxsj=" + gxsj +
                ", czz='" + czz + '\'' +
                ", yxx=" + yxx +
                '}';
    }
}

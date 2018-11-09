package base;

/**
 * 描述：基类
 *
 * @author YangFuXi Date Time 2018/8/30 14:20
 */
public class BaseEntity {
    private String id;
    private String czz;
    private Long cjsj;
    private Long gxsj;
    private char yxx;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCzz() {
        return czz;
    }

    public void setCzz(String czz) {
        this.czz = czz;
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

    public char getYxx() {
        return yxx;
    }

    public void setYxx(char yxx) {
        this.yxx = yxx;
    }
}

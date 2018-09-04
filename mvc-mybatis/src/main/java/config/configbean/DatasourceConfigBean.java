package config.configbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 描述：数据库连接配置
 *
 * @author YangFuXi Date Time 2018/8/29 19:15
 */
@Component
public class DatasourceConfigBean {
    @Value("${db.driverClass}")
    private String driverClassName;
    @Value("${db.url}")
    private String url;
    @Value("${db.user}")
    private String userName;
    @Value("${db.password}")
    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

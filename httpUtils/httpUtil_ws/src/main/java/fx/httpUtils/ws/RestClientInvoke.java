package fx.httpUtils.ws;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 描述：HTTP请求
 *
 * @author YangFuXi Date Time 2018/9/25 14:17
 */
public class RestClientInvoke {
    private static final Log logger = LogFactory.getLog(RestClientInvoke.class);
    private Client client;

    public RestClientInvoke() {
        super();
        this.client = ClientBuilder.newClient();
    }

    /**
     * 关闭连接
     */
    public void close() {
        if (this.client != null) {
            this.client.close();
            this.client = null;
        }
    }

    /**
     * 解析请求结果
     *
     * @param response   请求结果对象
     * @param resultType 返回值类型
     * @param <R>        结果类型
     * @return 返回解析后的结果
     */
    private <R> R dowithResponse(Response response, Class<R> resultType) {
        R r = null;
        String error = null;
        if (response.getStatus() == 200) {
            r = response.readEntity(resultType);
        } else {
            error = response.readEntity(String.class);
        }
        response.close();
        if (r != null) {
            if (logger.isDebugEnabled()) {
                logger.debug("invoke restService success!");
            }
        } else {
            if (logger.isErrorEnabled()) {
                logger.error(String.format("invoke restService fail,response is %s", error));
            }
        }
        return r;
    }

    /**
     * http Get 请求
     *
     * @param url      请求路径
     * @param restType 返回值类型
     * @param <R>      返回值类型
     * @return 返回结果
     */
    public <R> R doGet(String url, Class<R> restType) {
        if (logger.isDebugEnabled()) {
            logger.debug(String.format("start invoke GetRequest,url:%s", url));
        }
        WebTarget target = this.client.target(url);
        Response response = target.request().get();
        return this.dowithResponse(response, restType);
    }

    /**
     * http Post请求方法
     *
     * @param url      请求路径
     * @param d        请求参数对象
     * @param restType 返回结果类型
     * @param <R>      返回结果类型
     * @param <D>      请求参数类型
     * @return 返回请求结果
     */
    public <R, D> R doPost(String url, D d, Class<R> restType) {
        if (logger.isDebugEnabled()) {
            logger.debug(String.format("start invoke PostRequest,url:%s", url));
        }
        Entity<D> entity = null;
        if (d != null) {
            entity = Entity.entity(d, MediaType.APPLICATION_JSON_TYPE);
        }
        WebTarget target = this.client.target(url);
        Response response = target.request().post(entity);
        return this.dowithResponse(response, restType);
    }
}

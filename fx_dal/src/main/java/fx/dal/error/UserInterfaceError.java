package fx.dal.error;

/**
 * 描述:用户自定义异常接口
 *
 * @author YangFuxi
 * Date Time 2018/10/31 23:54
 */
public interface UserInterfaceError {
    /**
     * 获取消息代码，整数值
     *
     * @return 消息代码
     */
    int getErrorCode();

    /**
     * 获取错误消息
     *
     * @return 错误消息
     */
    String getErrorMessage();
}

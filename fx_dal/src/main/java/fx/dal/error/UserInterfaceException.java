package fx.dal.error;

/**
 * 描述:用户自定义异常接口
 *
 * @author YangFuxi
 * Date Time 2018/10/31 23:54
 */
public class UserInterfaceException extends RuntimeException implements UserInterfaceError {
    private int errorCode;//异常代码
    private String errorMessage;//异常消息

    /**
     * 默认构造方法
     *
     * @param errorCode    异常代码
     * @param errorMessage 异常消息
     */
    public UserInterfaceException(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public UserInterfaceException(String message, int errorCode, String errorMessage) {
        super(message);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return 0;
    }

    public String getErrorMessage() {
        return null;
    }
}

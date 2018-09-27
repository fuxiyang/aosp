import config.AppConfig;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 描述：
 *
 * @author YangFuXi Date Time 2018/8/29 20:32
 */
public class MmApplication {
    private static final Log logger=LogFactory.getLog(MmApplication.class);
    private static AnnotationConfigApplicationContext context = null;

    public static void main(String[] args) throws Exception{
        context=new AnnotationConfigApplicationContext(AppConfig.class);
        if (logger.isInfoEnabled()){
            logger.info("application is started");
        }
        System.out.println("please press any key to stop application......");
        System.in.read();
        stopServer();
    }

    private static void stopServer(){
        context.close();
        if (logger.isInfoEnabled()){
            logger.info("application is closed");
        }
    }
}

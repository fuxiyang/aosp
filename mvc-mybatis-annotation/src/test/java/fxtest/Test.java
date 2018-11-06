package fxtest;

import config.AppConfig;
import entity.PersonEntity;
import entity.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.IncidentService;
import service.PersonService;
import service.UserService;

/**
 * 描述：测试类
 *
 * @author YangFuXi Date Time 2018/8/30 15:14
 */
public class Test {
    private static final Log logger = LogFactory.getLog(Test.class);
    private static AnnotationConfigApplicationContext context = null;

    @Before
    public void before() {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("测试已启动");
    }

    @After
    public void after() {
        if (context != null) {
            context.close();
        }
        System.out.println("测试已关闭");
    }

    @org.junit.Test
    public void testMybatis() {
        System.out.println("........");
        PersonService service = context.getBean(PersonService.class);
        PersonEntity person = new PersonEntity();
        person.setName("张三");
        person.setAge(21);
        person.setAddress("sdfasdf");
        service.insert(person);
        System.out.println("......");
    }

    @org.junit.Test
    public void testUser() {
        User user = new User();
        user.setId("4");
        user.setName("测试");
        UserService userService = context.getBean(UserService.class);
        userService.insert(user);
        System.out.println("///////////////");
    }

    /**
     * 测试简单的增删改查  警情表
     */
//    @Transactional
    @org.junit.Test
    public void testIncident() {
        IncidentService service = context.getBean(IncidentService.class);
        //增加
//        IncidentEntity entity=new IncidentEntity();
//        entity.setAfdz("斜土街道");
//        entity.setAjms("公寓起火，人员密集，可见火光");
//        entity.setLasj(System.currentTimeMillis());
//        entity.setId("as26899312de564g85sde");
//        entity.setYxx(true);
//        entity.setCjsj(System.currentTimeMillis());
//        entity.setGxsj(System.currentTimeMillis());
//        service.insert(entity);

        //查询
//        //selectById
//        IncidentEntity entity=service.selectById("as26899312de564g85sde");
//        System.out.println(entity);
//        //update
//        entity.setCzz("测试");us
//        service.update(entity);

        //删除
        //delete
//        service.remove("as26899312de564g85sde");

        //修改

    }
}

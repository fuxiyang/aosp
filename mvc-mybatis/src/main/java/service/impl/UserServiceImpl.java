package service.impl;

import entity.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.UserService;

/**
 * 描述：
 *
 * @author YangFuXi Date Time 2018/8/30 16:14
 */
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public void insert(User user) {
        try {
            userMapper.insert(user);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

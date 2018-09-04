package mapper;

import entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * 描述：
 *
 * @author YangFuXi Date Time 2018/8/30 16:10
 */
@Mapper
public interface UserMapper {
    @Insert("insert into T_USER (ID,NAME) values(#{id},#{name})")
    void insert(User user);
}

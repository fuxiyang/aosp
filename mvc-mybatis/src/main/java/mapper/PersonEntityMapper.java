package mapper;

import entity.PersonEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * 描述：人员类Mapper
 *
 * @author YangFuXi Date Time 2018/8/30 14:57
 */
@Mapper
public interface PersonEntityMapper {
    @Insert("insert into persons (name,age,address) values(#{name},#{age},#{address})")
    void insert(PersonEntity person);
}

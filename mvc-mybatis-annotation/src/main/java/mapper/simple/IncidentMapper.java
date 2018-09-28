package mapper.simple;

import entity.IncidentEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 描述：警情实体mapper
 *
 * @author YangFuXi Date Time 2018/9/28 12:19
 */
@Mapper
public interface IncidentMapper {
    @Insert("insert into jcj_ajxx(id,afdz,ajms,zgjg,ssdq,lasj) values(#{id},#{afdz},#{ajms},#{zgjg},#{ssdq},#{lasj})")
    void insert(IncidentEntity entity);
    @Select("select * from jcj_ajxx where id=#{id}")
    IncidentEntity selectById(String id);
    @Update("update jcj_ajxx " +
            " set afdz=#{id}" +
            " set ajms=#{ajms}")
    void update(IncidentEntity entity);
}

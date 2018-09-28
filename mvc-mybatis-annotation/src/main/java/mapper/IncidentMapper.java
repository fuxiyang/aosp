package mapper;

import entity.IncidentEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectKey;

/**
 * 描述：警情实体mapper
 *
 * @author YangFuXi Date Time 2018/9/28 12:19
 */
@Mapper
public interface IncidentMapper {
    @Insert("insert into jcj_ajxx(id,afdz,ajms,zgjg,ssdq,lasj) values(#{id},#{afdz},#{ajms},#{zgjg},#{ssdq},#{lasj})")
    void insert(IncidentEntity entity);
}
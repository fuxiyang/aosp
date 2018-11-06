package mapper.simple;

import entity.simple.IncidentEntity;
import org.apache.ibatis.annotations.*;

/**
 * 描述：警情实体mapper
 *
 * @author YangFuXi Date Time 2018/9/28 12:19
 */
@Mapper
public interface IncidentMapper {
    /**
     * 新增警情
     * @param entity 警情实体
     */
    @Insert("insert into jcj_ajxx(id,afdz,ajms,zgjg,ssdq,lasj) values(#{id},#{afdz},#{ajms},#{zgjg},#{ssdq},#{lasj})")
    void insert(IncidentEntity entity);

    /**
     * 查询 根据ID查询警情详情
     * @param id 警情ID
     * @return 返回警情详情
     */
    @Select("select * from jcj_ajxx where id=#{id}")
    IncidentEntity selectById(String id);

    /**
     * 更新 更新警情信息
     * @param entity 需要更新的警情信息
     */
    @Update("update jcj_ajxx" +
            " set afdz=#{afdz}," +
            " set ajms=#{ajms}," +
            " set zgjg=#{zgjg}," +
            " set ssdq=#{ssdq}," +
            " set lasj=#{lasj}," +
            " set gxsj=#{gxsj}," +
            " set czz=#{czz}," +
            " set yxx=#{yxx}" +
            " where id=#{id}")
    void update(IncidentEntity entity);

    /**
     * 删除操作
     * @param id 案件ID
     */
    @Delete("delete from jcj_ajxx where id=#{id}")
    void remove(String id);
}

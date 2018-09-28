package service;

import entity.IncidentEntity;

/**
 * 描述：警情服务
 *
 * @author YangFuXi Date Time 2018/9/28 14:35
 */
public interface IncidentService {
    /**
     * 新增警情服务
     *
     * @param incidentEntity 新警情
     */
    void insert(IncidentEntity incidentEntity);

    /**
     * 根据id查询警情详情
     *
     * @param id 警情ID
     * @return 警情详情
     */
    IncidentEntity selectById(String id);

    /**
     * 更新警情
     *
     * @param entity 需要更新的警情
     */
    void update(IncidentEntity entity);

    /**
     * 删除警情
     * @param id 警情ID
     */
    void remove(String id);
}

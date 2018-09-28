package service;

import entity.IncidentEntity;

/**
 * 描述：
 *
 * @author YangFuXi Date Time 2018/9/28 14:35
 */
public interface IncidentService {
    void insert(IncidentEntity incidentEntity);

    IncidentEntity selectById(String id);
}

package service.impl;

import entity.IncidentEntity;
import mapper.IncidentMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.IncidentService;

/**
 * 描述：
 *
 * @author YangFuXi Date Time 2018/9/28 14:36
 */
@Component
public class IncidentServiceImpl implements IncidentService {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private IncidentMapper mapper;
//=sqlSession.getMapper(IncidentMapper.class)
    @Autowired
    public IncidentServiceImpl(SqlSessionFactory sqlSessionFactory, IncidentMapper mapper) {
        this.sqlSessionFactory = sqlSessionFactory;
        sqlSession=sqlSessionFactory.openSession();
        this.mapper = mapper;
    }

    public void insert(IncidentEntity entity) {

        mapper.insert(entity);
    }

    public IncidentEntity selectById(String id) {
        return mapper.selectById(id);
    }
}

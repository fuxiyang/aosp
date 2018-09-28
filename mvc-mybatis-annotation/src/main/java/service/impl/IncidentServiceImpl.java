package service.impl;

import entity.IncidentEntity;
import mapper.simple.IncidentMapper;
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
        sqlSession = sqlSessionFactory.openSession();
        this.mapper = mapper;
    }

    /**
     * {@inheritDoc}
     *
     * @see IncidentService#insert(IncidentEntity)
     */
    public void insert(IncidentEntity entity) {

        mapper.insert(entity);
    }

    /**
     * {@inheritDoc}
     *
     * @see IncidentService#selectById(String)
     */
    public IncidentEntity selectById(String id) {
        return mapper.selectById(id);
    }

    /**
     * {@inheritDoc}
     *
     * @see IncidentService#update(IncidentEntity)
     */
    public void update(IncidentEntity entity) {
        mapper.update(entity);
    }

    /**
     * {@inheritDoc}
     *
     * @see IncidentService#remove(String)
     */
    public void remove(String id) {
        mapper.remove(id);
    }
}

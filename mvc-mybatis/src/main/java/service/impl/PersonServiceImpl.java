package service.impl;

import entity.PersonEntity;
import mapper.PersonEntityMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import service.PersonService;

/**
 * 描述：
 *
 * @author YangFuXi Date Time 2018/8/30 15:32
 */
@Component
public class PersonServiceImpl implements PersonService {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private PersonEntityMapper personEntityMapper;
    @Autowired
    public PersonServiceImpl(SqlSessionFactory sqlSessionFactory, PersonEntityMapper personEntityMapper) {
        this.sqlSessionFactory = sqlSessionFactory;
        this.personEntityMapper = personEntityMapper;
        this.sqlSession=sqlSessionFactory.openSession();
    }

    public void insert(PersonEntity personEntity) {
        try {
            personEntityMapper.insert(personEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

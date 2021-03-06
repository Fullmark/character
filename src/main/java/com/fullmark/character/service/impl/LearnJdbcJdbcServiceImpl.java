package com.fullmark.character.service.impl;

import com.fullmark.character.dao.LearnDao;
import com.fullmark.character.entity.LearnResouce;
import com.fullmark.character.service.LearnJdbcService;
import com.fullmark.character.tools.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author fanghuanbiao
 */
@Service("learnJdbcService")
public class LearnJdbcJdbcServiceImpl implements LearnJdbcService {
    @Autowired
    @Qualifier("learnJdbcDao")
    LearnDao learnDao;

    @Override
    public int add(LearnResouce learnResouce) {
        return this.learnDao.add(learnResouce);
    }

    @Override
    public int update(LearnResouce learnResouce) {
        return this.learnDao.update(learnResouce);
    }

    @Override
    public int deleteByIds(String ids) {
        return this.learnDao.deleteByIds(ids);
    }

    @Override
    public LearnResouce queryLearnResouceById(Long id) {
        return this.learnDao.queryLearnResouceById(id);
    }

    @Override
    public Page queryLearnResouceList(Map<String, Object> params) {
        return this.learnDao.queryLearnResouceList(params);
    }
}

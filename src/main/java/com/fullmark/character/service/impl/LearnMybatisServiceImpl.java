package com.fullmark.character.service.impl;

import com.fullmark.character.dao.LearnMapper;
import com.fullmark.character.dao.LearnXmlMapper;
import com.fullmark.character.entity.LearnResouce;
import com.fullmark.character.service.LearnMybatisService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author fanghuanbiao
 */
@Service("learnMybatisService")
public class LearnMybatisServiceImpl implements LearnMybatisService {
    @Autowired
    LearnXmlMapper learnMapper;

    @Override
    public int add(LearnResouce learnResouce) {
        return this.learnMapper.add(learnResouce);
    }

    @Override
    public int update(LearnResouce learnResouce) {
        return this.learnMapper.update(learnResouce);
    }

    @Override
    public int deleteByIds(String ids) {
        return this.learnMapper.deleteByIds(ids);
    }

    @Override
    public LearnResouce queryLearnResouceById(Long id) {
        return this.learnMapper.queryLearnResouceById(id);
    }

    @Override
    public List<LearnResouce> queryLearnResouceList(Map<String, Object> params) {
        PageHelper.startPage(Integer.parseInt(params.get("page").toString()), Integer.parseInt(params.get("rows").toString()));
        return this.learnMapper.queryLearnResouceList(params);
    }
}

package com.fullmark.character.service;

import com.fullmark.character.entity.LearnResouce;

import java.util.List;
import java.util.Map;

/**
 * @author fanghuanbiao
 */
public interface LearnMybatisService {
    int add(LearnResouce learnResouce);
    int update(LearnResouce learnResouce);
    int deleteByIds(String ids);
    LearnResouce queryLearnResouceById(Long learnResouce);
    List<LearnResouce> queryLearnResouceList(Map<String, Object> params);
}

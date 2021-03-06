package com.fullmark.character.service;

import com.fullmark.character.entity.LearnResouce;
import com.fullmark.character.tools.Page;

import java.util.Map;

/**
 * @author fanghuanbiao
 */
public interface LearnJdbcService {
    int add(LearnResouce learnResouce);
    int update(LearnResouce learnResouce);
    int deleteByIds(String ids);
    LearnResouce queryLearnResouceById(Long id);
    Page queryLearnResouceList(Map<String,Object> params);

}

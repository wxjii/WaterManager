package com.example.watermanager.repository;


import com.example.watermanager.domain.Toxicity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ToxicityMapper {

    /**
     * 查询毒性  显示前条毒性数据
     * @return
     */
    List<Toxicity>  selectAllToxicity();

    /**
     * 添加毒性数据
     * @return
     */
    int insertToxicity(Toxicity toxicity);
}

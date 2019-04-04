package com.example.watermanager.repository;


import com.example.watermanager.domain.Shore;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoreMapper {

    /**
     * 查询岸边站数据  显示最新的10条
     * @return
     */
    List<Shore>  selectAllShore();

    /**
     * 添加岸边站数据
     * @param shore
     * @return
     */
    int insertShore(Shore shore);


}

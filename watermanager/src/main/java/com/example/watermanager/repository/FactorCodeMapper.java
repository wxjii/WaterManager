package com.example.watermanager.repository;


import com.example.watermanager.domain.FactorCode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FactorCodeMapper {

    /**
     * 查询最新的因子数据  显示最新的10条
     * @return
     */
    List<FactorCode>  selectAllFactorCode();

    /**
     * 添加因子数据
     * @param factorCode
     * @return
     */
    int insertFactorCode(FactorCode factorCode);
}

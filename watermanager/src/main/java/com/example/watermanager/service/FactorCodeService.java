package com.example.watermanager.service;




import com.example.watermanager.domain.FactorCode;

import java.util.List;

public interface FactorCodeService {

    /**
     * 查询最新的因子数据  显示最新的10条
     * @return
     */
    List<FactorCode>  findAllFactorCode();


    /**
     * 添加因子数据
     * @param factorCode
     * @return
     */
    int saveFactorCode(FactorCode factorCode);
 }

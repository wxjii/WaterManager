package com.example.watermanager.service;



import com.example.watermanager.domain.Toxicity;

import java.util.List;

public interface ToxicityService {

    /**
     * 显示前10毒性信息
     * @return
     */
    List<Toxicity>  findAllToxicity();

    /**
     * 添加毒性信息
     * @param toxicity  毒性数据
     * @return
     */
    int saveToxicity(Toxicity toxicity);
}

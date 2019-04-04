package com.example.watermanager.service;




import com.example.watermanager.domain.Shore;

import java.util.List;

public interface ShoreService {

    /**
     * 查询最新的岸边站数据 显示最新的10条
     * @return
     */
    List<Shore>  findAllShore();

    /**
     * 添加岸边站数据
     * @param shore
     * @return
     */
    int saveShore(Shore shore);
}

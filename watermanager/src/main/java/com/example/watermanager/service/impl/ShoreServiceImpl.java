package com.example.watermanager.service.impl;


import com.example.watermanager.domain.Shore;
import com.example.watermanager.repository.ShoreMapper;
import com.example.watermanager.service.ShoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ShoreServiceImpl implements ShoreService {

    @Autowired
    private ShoreMapper shoreMapper;

    @Override
    public List<Shore> findAllShore() {
        return shoreMapper.selectAllShore();
    }

    @Override
    public int saveShore(Shore shore) {
        return shoreMapper.insertShore(shore);
    }
}

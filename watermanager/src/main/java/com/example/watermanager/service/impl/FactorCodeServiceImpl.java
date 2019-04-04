package com.example.watermanager.service.impl;


import com.example.watermanager.domain.FactorCode;
import com.example.watermanager.repository.FactorCodeMapper;
import com.example.watermanager.service.FactorCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FactorCodeServiceImpl implements FactorCodeService {

    @Autowired
    private FactorCodeMapper factorCodeMapper;

    @Override
    public List<FactorCode> findAllFactorCode() {
        return factorCodeMapper.selectAllFactorCode();
    }

    @Override
    public int saveFactorCode(FactorCode factorCode) {
        return factorCodeMapper.insertFactorCode(factorCode);
    }
}

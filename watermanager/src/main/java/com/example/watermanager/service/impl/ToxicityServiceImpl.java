package com.example.watermanager.service.impl;


import com.example.watermanager.domain.Toxicity;
import com.example.watermanager.repository.ToxicityMapper;
import com.example.watermanager.service.ToxicityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ToxicityServiceImpl implements ToxicityService {

    @Autowired
    private ToxicityMapper toxicityMapper;

    @Override
    public List<Toxicity> findAllToxicity() {
        return toxicityMapper.selectAllToxicity();
    }

    @Override
    public int saveToxicity(Toxicity toxicity) {
        return toxicityMapper.insertToxicity(toxicity);
    }
}

package com.example.watermanager.service.impl;


import com.example.watermanager.domain.AlarmType;
import com.example.watermanager.repository.AlarmTypeRepository;
import com.example.watermanager.service.AlarmTypeRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AlarmTypeRepositoryServiceImpl implements AlarmTypeRepositoryService {
    @Autowired
    AlarmTypeRepository alarmTypeRepository;


    @Override
    public List<AlarmType> findAllByType() {
        return alarmTypeRepository.findAllByType();
    }

}

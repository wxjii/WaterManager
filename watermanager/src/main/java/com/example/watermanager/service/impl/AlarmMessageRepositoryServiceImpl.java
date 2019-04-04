package com.example.watermanager.service.impl;


import com.example.watermanager.domain.AlarmMessage;
import com.example.watermanager.repository.AlarmMessageRepository;
import com.example.watermanager.service.AlarmMessageRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class AlarmMessageRepositoryServiceImpl implements AlarmMessageRepositoryService {
    @Autowired
    AlarmMessageRepository alarmMessageRepository;

    @Override
    public List<AlarmMessage> findAllByMessage() {
        return alarmMessageRepository.findAllByMessage();
    }

    @Override
    public List<AlarmMessage> findMessage() {
        return alarmMessageRepository.findMessage();
    }


}

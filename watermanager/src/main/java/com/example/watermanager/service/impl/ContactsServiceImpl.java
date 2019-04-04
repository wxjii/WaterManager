package com.example.watermanager.service.impl;

import com.example.watermanager.domain.Contacts;
import com.example.watermanager.repository.ContactsMapper;
import com.example.watermanager.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ContactsServiceImpl implements ContactsService {

    @Autowired

    private ContactsMapper contactsMapper;
    @Override
    public List<Contacts> QueryContacts() {
        return contactsMapper.QueryContacts();
    }

    @Override
    public int saveContacts(Contacts contacts) {
        return contactsMapper.save(contacts);
    }

    @Override
    public int UpdateContacts(Contacts contacts) {
        return contactsMapper.UpdateContacts(contacts);
    }

    @Override
    public int deleteContacts(Integer id) {
        return contactsMapper.deleteContactsByID(id);
    }
}

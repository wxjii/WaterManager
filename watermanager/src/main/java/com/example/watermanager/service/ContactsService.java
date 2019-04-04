package com.example.watermanager.service;

import com.example.watermanager.domain.Contacts;

import java.util.List;

public interface ContactsService {

      List<Contacts> QueryContacts();

      int saveContacts(Contacts contacts);

      int UpdateContacts(Contacts contacts);

      int deleteContacts(Integer id);
}

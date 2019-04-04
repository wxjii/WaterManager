package com.example.watermanager.repository;

import com.example.watermanager.domain.Contacts;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface ContactsMapper {
       List<Contacts> QueryContacts();

       int save(Contacts contacts);

       int UpdateContacts(Contacts Contacts);

       int deleteContactsByID(Integer id);

}

package com.example.watermanager.service;

import com.example.watermanager.domain.Contacts;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ContactsServiceTest {

    /**
     *  增删该查 联系人 测试
     *
     */

    @Autowired
    private ContactsService contactsService;
    @Test
    public void contextLoads() {
           Contacts contacts=new Contacts(2,"耿阔","123456","妓女");
           contactsService.QueryContacts().forEach(System.out::println);
           contactsService.saveContacts(new Contacts("何飞扬","18513597238","北京"));
           contactsService.UpdateContacts(contacts);
           contactsService.deleteContacts(4);
    }
}
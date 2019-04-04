package com.example.watermanager.service.service1;


import com.example.watermanager.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User userLogin(@Param("name") String name);


}

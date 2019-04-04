package com.example.watermanager.repository.repository1;


import com.example.watermanager.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRepository{
     User userLogin(@Param("name") String name);


}


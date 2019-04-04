package com.example.watermanager.repository;

import com.example.watermanager.domain.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {
    int saveRole(Role role);
    int deleteRole(Role role);
    int updateRole(Role role);
    List<Role> queryRole();
}

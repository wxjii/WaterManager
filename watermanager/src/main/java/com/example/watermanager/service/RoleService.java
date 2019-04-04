package com.example.watermanager.service;

import com.example.watermanager.domain.Role;

import java.util.List;

public interface RoleService {
    int saveRole(Role role);
    int deleteRole(Role role);
    int updateRole(Role role);
    List<Role> queryRole();
}

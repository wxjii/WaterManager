package com.example.watermanager.service.impl;

import com.example.watermanager.domain.Role;
import com.example.watermanager.repository.RoleMapper;
import com.example.watermanager.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;

    @Override
    public int saveRole(Role role) {
        return roleMapper.saveRole(role);
    }

    @Override
    public int deleteRole(Role role) {
        return roleMapper.deleteRole(role);
    }

    @Override
    public int updateRole(Role role) {
        return roleMapper.updateRole(role);
    }

    @Override
    public List<Role> queryRole() {
        return roleMapper.queryRole();
    }
}

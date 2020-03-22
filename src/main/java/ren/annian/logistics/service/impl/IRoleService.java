package ren.annian.logistics.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ren.annian.logistics.dao.RoleDao;
import ren.annian.logistics.entity.Role;
import ren.annian.logistics.service.RoleService;

@Service
public class IRoleService implements RoleService {
    @Autowired
    RoleDao roleDao;

    @Override
    public Role login(String id, String password) {
        return roleDao.login(id, password);
    }
}

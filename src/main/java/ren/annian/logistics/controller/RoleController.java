package ren.annian.logistics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ren.annian.logistics.entity.Role;
import ren.annian.logistics.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService roleService;

    @GetMapping("/role/{id}/{password}")
    public Role login(@PathVariable String id,@PathVariable String password) {
        return this.roleService.login(id,password);
    }
}

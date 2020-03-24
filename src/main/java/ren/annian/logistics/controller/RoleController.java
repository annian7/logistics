package ren.annian.logistics.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ren.annian.logistics.entity.Customer;
import ren.annian.logistics.entity.Role;
import ren.annian.logistics.service.RoleService;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/role")
@Slf4j
public class RoleController {
    @Autowired
    RoleService roleService;

    @CrossOrigin(origins = {"*"})
    @GetMapping("/role")
    public Map login(String id, String password) {
        Role role = this.roleService.login(id, password);
        Map<String,String> map = new HashMap<>();
        if (role==null){
            map.put("success", "false");
            return map;
        }else{
            try {
                map = BeanUtils.describe(role);
                map.put("success","ok");
            } catch (IllegalAccessException e) {
                log.error(e.getMessage());
            } catch (InvocationTargetException e) {
                log.error(e.getMessage());
            } catch (NoSuchMethodException e) {
                log.error(e.getMessage());
            }
            return map;
        }
    }

    @GetMapping("/test")
    public Customer test(Customer customer){
        return null;
    }
}

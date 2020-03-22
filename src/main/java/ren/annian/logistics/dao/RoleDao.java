package ren.annian.logistics.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ren.annian.logistics.entity.Role;

@Repository
public interface RoleDao {
    Role login(@Param("id") String id,@Param("password") String password);
}

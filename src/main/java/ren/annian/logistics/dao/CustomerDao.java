package ren.annian.logistics.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import ren.annian.logistics.entity.Customer;


@Repository
public interface CustomerDao {
    public Customer getCustomerById(String id);
}

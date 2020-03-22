package ren.annian.logistics.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ren.annian.logistics.dao.CustomerDao;
import ren.annian.logistics.entity.Customer;
import ren.annian.logistics.service.CustomerService;

@Slf4j
@Service
public class ICustomerService implements CustomerService {
    @Autowired
    CustomerDao customerDao;
    @Override
    public Customer getCustomerById(String id) {
        Customer customer = this.customerDao.getCustomerById(id);
        return customer;
    }
}

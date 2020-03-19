package ren.annian.logistics.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Address {
    private int id;
    private String address;

    @Autowired
    private Customer customer;

   }

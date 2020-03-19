package ren.annian.logistics.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@ToString
@Component
public class Customer {
    private String id;
    private String name;
    private String tel;
    private String password;

    @Autowired
//    private List<Address> addresses;
    private Address address;

}



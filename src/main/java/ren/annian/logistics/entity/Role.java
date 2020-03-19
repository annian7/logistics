package ren.annian.logistics.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@ToString
public class Role {
    private String id;
    private String name;
    private String tel;
    private String password;
    private Integer power;
    @Autowired
    private Address address;

    }

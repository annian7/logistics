package ren.annian.logistics.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@ToString
public class Vehicle {
    private String id;
    private String type;
    private String password;
    private String beginPlace;
    private String endPlace;
    private Integer state;
    private String position;
    @Autowired
    private Driver driver;

    }

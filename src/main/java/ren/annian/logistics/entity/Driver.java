package ren.annian.logistics.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;

@Getter
@Setter
@ToString
public class Driver {
    private int id;
    private String name;
    private String cardId; //身份证号码
    private String sex;
    private Date birthday;
    private String certificatesType;
    @Autowired
    private Vehicle vehicle;

    }

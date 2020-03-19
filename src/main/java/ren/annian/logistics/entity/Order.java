package ren.annian.logistics.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class Order {
    private String id;
    @Autowired
    private Role role;
    private String mailingName;
    private String mailingTel;
    private String mailingAddress;
    private String collectName;
    private String collectTel;
    private String collectAddress;
    private String typeName;
    private String price;
    private String state;
    private String remarks;
    private String leavingMessage;
    private String logistics;
    private Timestamp startTime;
    private Timestamp endTime;


}

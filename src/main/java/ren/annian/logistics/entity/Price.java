package ren.annian.logistics.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Price {
    private int id;
    private String region;
    private String startPrice;
    private String continuation;
    private Integer satrtWeight;

    }

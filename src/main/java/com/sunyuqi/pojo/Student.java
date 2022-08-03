package com.sunyuqi.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "student")
@Data
public class Student {
    @Id
    private Long id;
    private String name;
    private String sex;
    private Integer age;
}

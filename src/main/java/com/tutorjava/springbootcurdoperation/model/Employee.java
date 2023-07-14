package com.tutorjava.springbootcurdoperation.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="EMP")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eid;
    private String ename;
    private String address;
    private String mobileNo;
}

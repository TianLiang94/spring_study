package com.spring01.entity;

import lombok.Data;

import java.util.*;

@Data
public class User {
    private Integer id;
    private Integer username;
    private String password;
    //private String sex;
    private String gender;
    private Date regist_time;

    /*private Date bornDate;
    private String[] hobbys;
    private Set<String> phones;
   private List<String> names;
    private Map<String,String> countries;
    private Properties files;

    private Address address;
*/


}

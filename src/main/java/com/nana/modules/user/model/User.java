package com.nana.modules.user.model;

import lombok.Data;

/**
 * @author: GUOYUJUN
 * @time: 2019/12/31 16:08
 * @description:
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}

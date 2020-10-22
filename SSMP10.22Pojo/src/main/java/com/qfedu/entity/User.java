package com.qfedu.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-10-21 19:06:57
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 965798662076805051L;
    private Integer uid;

    private String username;

    private String password;

    private String tel;

    private String addr;


}
package com.zuiyue.shoppingcar.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;



import java.io.Serializable;
import java.util.Date;

/**
 * @author ：ZuiYue
 * @date ：Created in 2020/5/12 14:11
 * @description：user
 * @package: com.zuiyue.shoppingcar.pojo
 */
@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private Integer id;
    private String userName;
    private String phone;
    private String password;
    private Date lastTime;
}

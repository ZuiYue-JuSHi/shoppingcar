package com.zuiyue.shoppingcar.pojo;

import com.zuiyue.shoppingcar.common.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author ：ZuiYue
 * @date ：Created in 2020/5/12 14:25
 * @description：shopping car
 * @package: com.zuiyue.shoppingcar.pojo
 */
@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Integer id;
    private Integer userId;
    private Integer goodsId;

    private Integer status;
}

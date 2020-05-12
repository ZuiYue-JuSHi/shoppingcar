package com.zuiyue.shoppingcar.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


/**
 * @author ：ZuiYue
 * @date ：Created in 2020/5/12 14:35
 * @description：goods
 * @package: com.zuiyue.shoppingcar.pojo
 */
@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Goods {


    private Integer id;
    private String goodsName;
    private Float price;
    private String image;
    private Integer stock;
}

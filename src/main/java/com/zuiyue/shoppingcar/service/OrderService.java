package com.zuiyue.shoppingcar.service;

import com.zuiyue.shoppingcar.pojo.Order;
import org.springframework.stereotype.Service;

/**
 * @author ：ZuiYue
 * @date ：Created in 2020/5/12 14:40
 * @description：server api
 * @package: com.zuiyue.shoppingcar.service
 */
@Service
public interface OrderService {
    void save(Order order);

    Order selectById(Integer id);

    Order selectByUserId(Integer userId);

    Order selectByGoodsId(Integer goodId);

    void delete(Order order);
}

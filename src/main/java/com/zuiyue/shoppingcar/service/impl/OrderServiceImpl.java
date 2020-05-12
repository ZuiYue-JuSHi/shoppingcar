package com.zuiyue.shoppingcar.service.impl;

import com.zuiyue.shoppingcar.common.StatusEnum;
import com.zuiyue.shoppingcar.mapper.OrderMapper;
import com.zuiyue.shoppingcar.pojo.Order;
import com.zuiyue.shoppingcar.service.OrderService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author ：ZuiYue
 * @date ：Created in 2020/5/12 14:43
 * @description：
 * @package: com.zuiyue.shoppingcar.service.impl
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public void save(Order order) {
        orderMapper.save(order);
    }

    @Override
    public Order selectById(Integer id) {
        return orderMapper.findById(id);
    }

    @Override
    public Order selectByUserId(Integer userId) {
        return orderMapper.findByUserId(userId);
    }

    @Override
    public Order selectByGoodsId(Integer goodId) {
        return orderMapper.findByGoodsId(goodId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Order order) {
        Order byId = orderMapper.findById(order.getId());
        if(byId != null){
            byId.setStatus(0);
            orderMapper.save(byId);
        }else {
            log.info("删除失败" + order);
        }
    }
}

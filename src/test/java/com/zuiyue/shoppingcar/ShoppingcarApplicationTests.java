package com.zuiyue.shoppingcar;

import com.zuiyue.shoppingcar.common.StatusEnum;
import com.zuiyue.shoppingcar.pojo.Goods;
import com.zuiyue.shoppingcar.pojo.Order;
import com.zuiyue.shoppingcar.pojo.User;
import com.zuiyue.shoppingcar.service.GoodsService;
import com.zuiyue.shoppingcar.service.OrderService;
import com.zuiyue.shoppingcar.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class ShoppingcarApplicationTests {

    @Autowired
    UserService userService;
    @Autowired
    OrderService orderService;
    @Autowired
    GoodsService goodsService;

    @Test
    public void inset(){
        User user = new User(1,"zuiyue","15836122570","8045",new Date());
        userService.save(user);
        Order order = new Order(1,1,1, StatusEnum.NORMAL.ordinal());
        orderService.save(order);

        Goods goods = new Goods(1,"goods1",4000F,"/zuiyue",100);
        goods.setId(null);
        goodsService.save(goods);


    }

}

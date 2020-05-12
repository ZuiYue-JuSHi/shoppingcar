package com.zuiyue.shoppingcar.mapper;

import com.zuiyue.shoppingcar.pojo.Order;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author ：ZuiYue
 * @date ：Created in 2020/5/12 14:38
 * @description：order
 * @package: com.zuiyue.shoppingcar.mapper
 */
@Repository
@Mapper
public interface OrderMapper {
    @Select("select * from iorder where user_id = #{userId}")
    Order findByUserId(Integer userId);

    @Select("select * from iorder where goods_id = #{goodsId}")
    Order findByGoodsId(Integer goodsId);

    @Insert("insert into iorder (user_id,goods_id,status) values(#{userId},#{goodsId},#{status})")
    Integer save(Order order);

    @Select("select * from iorder where id = #{id}")
    Order findById(Integer id);
}

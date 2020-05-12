package com.zuiyue.shoppingcar.mapper;

import com.zuiyue.shoppingcar.pojo.Goods;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author ：ZuiYue
 * @date ：Created in 2020/5/12 14:38
 * @description：goods mapper
 * @package: com.zuiyue.shoppingcar.mapper
 */
@Repository
@Mapper
public interface GoodsMapper  {
    @Select("select * from goods where id =#{id}")
    Goods findById(Integer id);

    @Select("select * from goods")
    List<Goods> findAll();

    @Update("update goods set goods_name = #{goodsName},image=#{image},price=#{price},stock=#{stock} where id = #{id}")
    void save(Goods goods);
    @Insert("insert into goods (goods_name,image,price,stock) values(#{goodsName},#{image},#{price},#{stock})")
    void insert(Goods goods);
}

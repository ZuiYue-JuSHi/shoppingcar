package com.zuiyue.shoppingcar.service.impl;

import com.zuiyue.shoppingcar.mapper.GoodsMapper;
import com.zuiyue.shoppingcar.pojo.Goods;
import com.zuiyue.shoppingcar.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ：ZuiYue
 * @date ：Created in 2020/5/12 14:54
 * @description：
 * @package: com.zuiyue.shoppingcar.service.impl
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public Goods selectById(Integer id) {
        return goodsMapper.findById(id);

    }

    @Override
    public List<Goods> selectAll() {
        return goodsMapper.findAll();
    }

    @Override
    public void save(Goods goods) {
        if(goods.getId()!=null){
            goodsMapper.save(goods);
        }else {
            goodsMapper.insert(goods);
        }
    }
}

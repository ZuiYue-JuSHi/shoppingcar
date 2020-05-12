package com.zuiyue.shoppingcar.service;

import com.zuiyue.shoppingcar.pojo.Goods;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：ZuiYue
 * @date ：Created in 2020/5/12 14:51
 * @description：service api
 * @package: com.zuiyue.shoppingcar.service
 */
@Service
public interface GoodsService {
    Goods selectById(Integer id);

    List<Goods> selectAll();

    void save(Goods goods);
}

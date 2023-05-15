package com.xxxx.seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxxx.seckill.pojo.Goods;
import com.xxxx.seckill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhouzhou
 * @since 2023-04-23
 */
public interface GoodsMapper extends BaseMapper<Goods> {

    List<GoodsVo> findGoodsVo();

    /**
     * 获取商品列表
     * @param goodsId
     * @return
     */
//获取商品详情
    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}

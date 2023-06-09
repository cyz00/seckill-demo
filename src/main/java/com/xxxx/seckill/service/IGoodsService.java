package com.xxxx.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.seckill.pojo.Goods;
import com.xxxx.seckill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhouzhou
 * @since 2023-04-23
 */
public interface IGoodsService extends IService<Goods> {

   List<GoodsVo> findGoodsVo();

//   获取商品详情
   GoodsVo findGoodsVoByGoodsId(Long goodsId);
}

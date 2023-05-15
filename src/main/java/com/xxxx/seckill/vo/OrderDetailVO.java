package com.xxxx.seckill.vo;

import com.xxxx.seckill.pojo.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单详情返回对象
 *
 * @ClassName: OrderDeatilVo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailVO {

    private Order order;

    private GoodsVo goodsVo;
}
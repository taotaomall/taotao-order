package com.taotao.order.service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbOrder;
import com.taotao.pojo.TbOrderItem;
import com.taotao.pojo.TbOrderShipping;

import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 19:27 2018/2/27
 */
public interface OrderService {

        TaotaoResult createOrder(TbOrder order, List<TbOrderItem> itemList, TbOrderShipping orderShipping);
}

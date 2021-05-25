package cn.kgc.demo.service;

import cn.kgc.demo.pojo.Orders;

/**
 * @ClassName OrdersService
 * @Description TODO 订单的业务层接口
 * @Author zhaojing
 * @Date 2021/5/8 12:26
 * @Version 1.0
 */
public interface OrdersService extends BaseService<Orders>{
    String afterOrdersPay(String out_trade_no) throws Exception;
}

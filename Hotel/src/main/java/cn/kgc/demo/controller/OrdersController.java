package cn.kgc.demo.controller;

import cn.kgc.demo.pojo.Orders;
import cn.kgc.demo.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName OrdersController
 * @Description TODO 订单控制器
 * @Author zhaojing
 * @Date 2021/5/8 12:25
 * @Version 1.0
 */
@Controller
@RequestMapping("orders")
public class OrdersController extends BaseController<Orders>{
    @Autowired
    private OrdersService ordersService;
    //支付成功后操作  1.修改订单支付状态 由0（未结算）---->1（已结算）
//2.添加销售记录数据
//out_trade_no支付成功之后的回调地址中的订单编号参数
    @RequestMapping("/afterOrdersPay")
    public String afterOrdersPay(String out_trade_no){
        //在业务层完成上述的操作
        try {
            return ordersService.afterOrdersPay(out_trade_no);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

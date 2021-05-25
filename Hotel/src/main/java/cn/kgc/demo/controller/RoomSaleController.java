package cn.kgc.demo.controller;

import cn.kgc.demo.pojo.RoomSale;
import cn.kgc.demo.service.RoomSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author 童靖
 * @date 2021/05/14 14:26
 * @Created by 云上容景的MACHENIKE
 */
@Controller
@RequestMapping("roomSale")
public class RoomSaleController extends BaseController<RoomSale>{

    @Autowired
    private cn.kgc.demo.service.RoomSaleService RoomSaleService;


    //根据房间编号分组查询消费情况
    @RequestMapping("loadRoomSale")
    @ResponseBody
    public Map<String,Object> loadRoomSale(){
        try{
            return RoomSaleService.findRoomSale();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}

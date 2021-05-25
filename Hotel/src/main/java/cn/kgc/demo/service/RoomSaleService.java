package cn.kgc.demo.service;

import cn.kgc.demo.pojo.RoomSale;

import java.util.Map;

/**
 * @author 童靖
 * @date 2021/05/14 14:26
 * @Created by 云上容景的MACHENIKE
 */
public interface RoomSaleService extends BaseService<RoomSale>{
    //根据房间编号分组查询消费情况
    Map<String, Object> findRoomSale();
}

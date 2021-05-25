package cn.kgc.demo.service.impl;

import cn.kgc.demo.dao.RoomSaleMapper;
import cn.kgc.demo.pojo.RoomSale;
import cn.kgc.demo.service.RoomSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 童靖
 * @date 2021/05/14 14:27
 * @Created by 云上容景的MACHENIKE
 */
@Service
@Transactional(readOnly = false)
public class RoomSaleServiceImpl extends BaseServiceImpl<RoomSale> implements RoomSaleService {
    @Autowired
    private RoomSaleMapper roomSaleMapper;

    // //根据房间编号分组查询消费情况
    @Override
    public Map<String, Object> findRoomSale() {
        //构建Map，返回到前端
        Map<String,Object> dataMap = new HashMap<>();
        //1.根据房间编号分组查询消费情况，返回房间号和消费情况的数据
        List<Map<String, Object>> list = roomSaleMapper.selRoomSaleFromGroupBy();
        //2.先设置图表的标记
        dataMap.put("legend","客房销售");
        //3.封装X轴的数据
        List<String> xAxis = new ArrayList<>();
        //4.封装series的数据
        List<Double> series = new ArrayList<>();
        //5.遍历list，把对应的数据封装到xAxis和series里面
        for (Map<String, Object> map : list) {
            xAxis.add(map.get("roomNum").toString());
            series.add(Double.valueOf(map.get("salePriceAll").toString()));
        }
        //6.把封装好的数据，放在dataMap里面
        dataMap.put("xAxis",xAxis);
        dataMap.put("series",series);
        return dataMap;
    }
}

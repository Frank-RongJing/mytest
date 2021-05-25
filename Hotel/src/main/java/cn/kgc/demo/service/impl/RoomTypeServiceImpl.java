package cn.kgc.demo.service.impl;

import cn.kgc.demo.pojo.RoomType;
import cn.kgc.demo.service.RoomTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author 童靖
 * @date 2021/05/16 19:47
 * @Created by 云上容景的MACHENIKE
 */
@Service
@Transactional(readOnly = false)
public class RoomTypeServiceImpl extends BaseServiceImpl<RoomType> implements RoomTypeService {
}

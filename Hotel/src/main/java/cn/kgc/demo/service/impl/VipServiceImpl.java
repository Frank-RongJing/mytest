package cn.kgc.demo.service.impl;

import cn.kgc.demo.pojo.Vip;
import cn.kgc.demo.service.VipService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName VipServiceImpl
 * @Description TODO  会员业务层实现类
 * @Author zhaojing
 * @Date 2021/5/8 10:08
 * @Version 1.0
 */
@Service
@Transactional(readOnly = false)
public class VipServiceImpl extends BaseServiceImpl<Vip> implements VipService {
}

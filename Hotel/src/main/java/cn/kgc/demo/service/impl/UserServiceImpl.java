package cn.kgc.demo.service.impl;

import cn.kgc.demo.dao.UserMapper;
import cn.kgc.demo.pojo.User;
import cn.kgc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author 童靖
 * @date 2021/05/20 12:28
 * @Created by 云上容景的MACHENIKE
 */
@Service
@Transactional(readOnly = false)
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

}

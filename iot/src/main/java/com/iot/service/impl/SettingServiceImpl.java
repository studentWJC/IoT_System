package com.iot.service.impl;

import com.iot.entity.Setting;
import com.iot.mapper.SettingMapper;
import com.iot.service.SettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wjc
 * @since 2023-03-24
 */
@Service
public class SettingServiceImpl extends ServiceImpl<SettingMapper, Setting> implements SettingService {

}

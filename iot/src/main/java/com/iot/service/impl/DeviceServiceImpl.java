package com.iot.service.impl;

import com.iot.entity.Device;
import com.iot.mapper.DeviceMapper;
import com.iot.service.DeviceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wjc
 * @since 2023-03-21
 */
@Service
public class DeviceServiceImpl extends ServiceImpl<DeviceMapper, Device> implements DeviceService {

    @Resource
    private DeviceMapper deviceMapper;

    @Override
    public List<Device> getLast1() {
        return deviceMapper.getLast1();
    }

    @Override
    public List<Device> getLast2() {
        return deviceMapper.getLast2();
    }

    @Override
    public List<Device> getLast11() {
        return deviceMapper.getLast11();
    }

    @Override
    public List<Device> getLast22() {
        return deviceMapper.getLast22();
    }
}

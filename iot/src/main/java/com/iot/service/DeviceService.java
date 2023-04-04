package com.iot.service;

import com.iot.entity.Device;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wjc
 * @since 2023-03-21
 */
public interface DeviceService extends IService<Device> {

    List<Device> getLast1();

    List<Device> getLast2();

    List<Device> getLast11();

    List<Device> getLast22();
}

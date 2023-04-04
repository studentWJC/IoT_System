package com.iot.mapper;

import com.iot.entity.Device;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wjc
 * @since 2023-03-21
 */
@Mapper
public interface DeviceMapper extends BaseMapper<Device> {

    List<Device> getLast1();

    List<Device> getLast2();

    List<Device> getLast11();

    List<Device> getLast22();
}

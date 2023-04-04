package com.iot.mapper;

import com.iot.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wjc
 * @since 2023-03-21
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}

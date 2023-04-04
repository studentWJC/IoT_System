package com.iot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author wjc
 * @since 2023-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Setting对象", description="")
public class Setting implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Float lowTemp;

    private Float highTemp;

    private Float lowHum;

    private Float highHum;

    private Integer userId;


}

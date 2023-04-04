package com.iot.controller;


import com.iot.common.Result;
import com.iot.entity.Device;
import com.iot.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wjc
 * @since 2023-03-21
 */
@RestController
@RequestMapping("/device")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;

    @GetMapping("/list")
    public Result list(){
        List<Device> result = deviceService.list();
        return Result.suc(result);
    }

    @GetMapping("/getLast1")
    public Result getLast1(){
        List<Device> result = deviceService.getLast1();
        if(result.size()==0){
            return Result.fail();
        }else {
            return Result.suc(result);
        }
    }

    @GetMapping("/getLast2")
    public Result getLast2(){
        List<Device> result = deviceService.getLast2();
        if(result.size()==0){
            return Result.fail();
        }else {
            return Result.suc(result);
        }
    }

    @GetMapping("/getLast11")
    public Result getLast11(){
        List<Device> result = deviceService.getLast11();
        if(result.size()==0){
            return Result.fail();
        }else {
            return Result.suc(result);
        }
    }

    @GetMapping("/getLast22")
    public Result getLast22(){
        List<Device> result = deviceService.getLast22();
        if(result.size()==0){
            return Result.fail();
        }else {
            return Result.suc(result);
        }
    }
}

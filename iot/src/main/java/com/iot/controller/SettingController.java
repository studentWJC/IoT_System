package com.iot.controller;


import com.iot.common.Result;
import com.iot.entity.Setting;
import com.iot.entity.User;
import com.iot.service.SettingService;
import com.iot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wjc
 * @since 2023-03-24
 */
@RestController
@RequestMapping("/setting")
public class SettingController {
    @Autowired
    private SettingService settingService;

    @GetMapping("/list")
    public Result list(){
        List<Setting> result = settingService.list();
        return Result.suc(result);
    }

    @PostMapping("/update")
    public Result update(@RequestBody Setting setting){
        return settingService.updateById(setting)?Result.suc():Result.fail();
    }

}

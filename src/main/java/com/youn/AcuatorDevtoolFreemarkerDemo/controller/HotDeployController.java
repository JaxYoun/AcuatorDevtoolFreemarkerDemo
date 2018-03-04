package com.youn.AcuatorDevtoolFreemarkerDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：YangJx
 * @Description：
 * @DateTime：2018/3/4 20:46
 */
@RestController
@RequestMapping("/hotDeploy")
public class HotDeployController {

    /**
     * 热部署测试接口
     *
     * @return
     */
    @GetMapping("/hotDeployTest")
    public String hotDeployTest(String id) {
        System.out.println(id);
        return "14774rrr";
    }

}

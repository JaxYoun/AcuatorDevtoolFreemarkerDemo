package com.youn.AcuatorDevtoolFreemarkerDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author：YangJx
 * @Description：
 * @DateTime：2018/3/4 19:21
 */
@RestController
@RequestMapping("/freemarker")
public class FreemarkerController {

    /**
     * Freemarker支持从三种路径加载模板：
     * 1.工程静态资源目录（最常见）
     * 2.从本地文件系统，必须配置为【file:D:\\】,模板完整路径为“D:\remoteTemplate.ftl”，后半截在Mode名中动态拼接
     * 3.远程ftp服务器或nginx目录等静态路径，鼻祖配置为【http://10.0.20.151:81/api/web/agreement/showAgreementDetail?attachPath=/test/20180130/myHome0】
     * 加载freemarker模板并渲染，并将页面展现给请求者
     * <p>
     * //     * @param paramMap
     *
     * @param modelAndView
     * @return
     */
    @GetMapping("/loadRemoteTemplate")
    public ModelAndView loadRemoteTemplate(ModelAndView modelAndView) {
        modelAndView.addObject("id", "75");
        modelAndView.addObject("name", "young");
        modelAndView.setViewName("remoteTemplate");  //此处配置模板的路径后半截（但不包括扩展名）
        return modelAndView;
    }

}

package cn.itfxq.auth.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Author: itfxq码仔项目分享圈
 * @Decription:
 * @Date: Created on 2021/7/22 14:52
 * @Email: 2579692606@qq.com
 */
@Controller
public class RouteController {



    /**
     * 登录失败
     */
    @RequestMapping("/error403")
    public String loginError() {
        return "error403";
    }

    /**
     * 后台主页
     * @return
     */
    @RequestMapping("/main")
    public String main() {
        return "views/main";
    }

    /**
     * 跳转注册页面
     */
    @RequestMapping("/goRegPage")
    public String goRegPage(Model model) {

        return "views/reg";
    }




}

package cn.itfxq.auth.web.controller;

import cn.itfxq.auth.entity.Menu;
import cn.itfxq.auth.serivce.IMenuService;
import cn.itfxq.auth.util.CommonUtils;
import cn.itfxq.common.result.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: itfxq-项目分享圈
 * @Decription: LoginController登录处理类
 * @Date: Created on 2021/7/22 10:38
 * @Email: 2579692606@qq.com
 */
@Controller
public class LoginController {

    @Autowired
    private IMenuService menuService;

    //跳转登录页面
    @RequestMapping("/toLogin")
    public String userLogin() {
        return "views/login";
    }
    //登录成功
    @RequestMapping("/index")
    public String index(HttpSession session) {
        System.out.println("登录成功进入");
        if(session == null){
            return "redirect:/toLogin";
        }
        //根据登录用户的角色 确定菜单
        Long userId = CommonUtils.getLoginUser().getId();
        List<Menu> menus = menuService.findAll(userId);
        if (menus != null) {
            session.setAttribute("menuList", menus);
        }
        return "views/index";
    }



}

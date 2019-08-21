package cn.ljf.time.controller;

import cn.ljf.time.model.User;
import cn.ljf.time.service.LoginService;
import cn.ljf.time.service.UserService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    private static Logger logger = Logger.getLogger("onelogger");


    @RequestMapping(value = "/userLogin",method={RequestMethod.GET,RequestMethod.POST})
    public String Login(String email, String password, HttpSession session){
        Subject subject = SecurityUtils.getSubject();
        //存放用户登录信息
        UsernamePasswordToken token=new UsernamePasswordToken(email,password);
        User user;
        try {
            //利用异常操作
            //需要开始调用到Realm中
            System.out.println("========================================");
            System.out.println("1、用户登陆验证");
            subject.login(token);
//          subject.checkRole("sys_user");
//          user = (User)subject.getPrincipal();
//          session.setAttribute("email",subject);
            System.out.println("登录完成");
            return "index";
        } catch (UnknownAccountException e) {
            //登陆失败
            return "login";
        }
    }
//用户注册
    @RequestMapping("/register")
    public String  register(@RequestParam("username") String username,
	       @RequestParam("email") String email,@RequestParam("password")String password){
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setUserPassword(password);
        userService.register(user);
        return "login";
    }

//获取用户数据
    @RequestMapping("/selectUserInfo")
    public @ResponseBody void register(Integer pageSize, Integer pageNumber, String searchText,HttpServletRequest request,
                            HttpServletResponse response) {
        if (null != searchText) {
            try {
                searchText = new String(searchText.getBytes("ISO-8859-1"), "UTF-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //在service通过条件查询获取指定页的数据的list
     /*   List<User> list = userService.page4List(pageSize, pageNumber, searchText);
        //根据查询条件，获取符合查询条件的数据总量
        int total = mwMsgQueueService.queryCountBySearchText(searchText);
        //自己封装的数据返回类型，bootstrap-table要求服务器返回的json数据必须包含：totlal，rows两个节点
        PageResultForBootstrap page = new PageResultForBootstrap();
        page.setTotal(total);
        page.setRows(list);*/

    }


    @RequestMapping(value="/test",method={RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody List<User> getUser(){
        System.out.println("hello Controller");
        logger.debug("hello bug");
        return userService.getUser();

    }
}

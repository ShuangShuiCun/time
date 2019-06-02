package cn.ljf.time.util;

import cn.ljf.time.model.User;
import cn.ljf.time.service.LoginService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

public class MyRealm extends AuthorizingRealm {
    @Resource
    private LoginService loginService;
    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    //不添加会报错non-static
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String userName=(String)principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        //进行授权角色
        authorizationInfo.setRoles(loginService.getRoleByEmail(userName));
        //进行授权权限
       // authorizationInfo.setStringPermissions(LoginService.getPermissions(userName));
        return authorizationInfo;
        /**
         *
         * 授权：角色授权，权限授权
         *

        //方法一：获得user对象
        User user = (User) pc.getPrimaryPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //获取permission
        if (user != null) {
            List<Permission> permissionsByUser = shiroService.getPermissionsByUser(user);
            if (permissionsByUser.size() != 0) {
                for (Permission p : permissionsByUser) {

                    info.addStringPermission(p.getUrl());
                }
                return info;
            }
        }*/
    }

//    登陆验证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        System.out.println("进来验证了");
        //验证账号密码
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        System.out.println("1:" + token.getUsername());
        User user = loginService.getUserByEmail(token.getUsername());
        System.out.println("2");
        if (user == null) {
            return null;
        }
        //最后的比对需要交给安全管理器
        //三个参数进行初步的简单认证信息对象的包装
        AuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getUserPassword(), this.getClass().getSimpleName());
        System.out.println(info);
        return info;
    }
}


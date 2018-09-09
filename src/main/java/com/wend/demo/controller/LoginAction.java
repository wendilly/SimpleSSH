package com.wend.demo.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.wend.demo.domain.User;
import com.wend.utils.EmptyUtil;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/8/21.
 * 岳文东
 */
public class LoginAction extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String doLogin(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String resultInfo=null;
        if (user==null){
            resultInfo="用户名密码不能为null";
            request.setAttribute("resultInfo",resultInfo);
            return "success";
        }
        if (EmptyUtil.isNotNull(user.getLoginpwd(),user.getLoginname())){
            if (user.getLoginpwd().equals("123456") && user.getLoginname().equals("wendong")){
                resultInfo="登陆成功";
            }else {
                resultInfo="用户名密码错误";
            }
        }else {
            resultInfo="用户名密码不能为null";
        }

        request.setAttribute("resultInfo",resultInfo);

        return "success";
    }

}

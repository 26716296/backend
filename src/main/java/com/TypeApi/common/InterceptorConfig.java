package com.TypeApi.common;

import com.TypeApi.common.JWTInterceptors;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JWTInterceptors())
                .addPathPatterns("/user/bind")
                .addPathPatterns("/user/SendCode")
                .addPathPatterns("/user/setClient")
                .addPathPatterns("/user/update")
                .addPathPatterns("/user/delete")
                .addPathPatterns("/user/edit")
                .addPathPatterns("/user/withdraw")
                .addPathPatterns("/user/withdrawList")
                .addPathPatterns("/user/withdrawAduit")
                .addPathPatterns("/user/madeCode")
                .addPathPatterns("/user/charge")
                .addPathPatterns("/user/codeList")
                .addPathPatterns("/user/codeExcel")
                .addPathPatterns("/user/inbox")
                .addPathPatterns("/user/noticeNum")
                .addPathPatterns("/user/clearNum")
                .addPathPatterns("/user/sendMsg")
                .addPathPatterns("/user/follow")
                .addPathPatterns("/user/followList")
                .addPathPatterns("/user/ban")
                .addPathPatterns("/user/unban")
                .addPathPatterns("/user/banList")
                .addPathPatterns("/user/clean")
                .addPathPatterns("/user/giveVip")
                .addPathPatterns("/article/articleAdd")
                .addPathPatterns("/article/update")
                .addPathPatterns("/article/delete")
                .addPathPatterns("/article/audit")
                .addPathPatterns("/article/action")
                .addPathPatterns("/article/allData")
                .addPathPatterns("/article/follow")
                .addPathPatterns("/article/action")
                .addPathPatterns("/article/like")
                .addPathPatterns("/article/mark")
                .addPathPatterns("/article/markList")
                .addPathPatterns("/category/update")
                .addPathPatterns("/category/add")
                .addPathPatterns("/category/action")
                .addPathPatterns("/chat/sendMsg")
                .addPathPatterns("/chat/chatRecord")
                .addPathPatterns("/chat/chatList")
                .addPathPatterns("/comments/add")
                .addPathPatterns("/comments/delete")
                .addPathPatterns("/comments/edit")
                .addPathPatterns("/comments/like")
                .addPathPatterns("/headpicture/add")
                .addPathPatterns("/headpicture/delete")
                .addPathPatterns("/shop/add")
                .addPathPatterns("/shop/update")
                .addPathPatterns("/shop/delete")
                .addPathPatterns("/shop/order")
                .addPathPatterns("/shop/orderList")
                .addPathPatterns("/shop/vip")
                .addPathPatterns("/shop/typeAdd")
                .addPathPatterns("/shop/typeEdit")
                .addPathPatterns("/upload/full")
                .addPathPatterns("/pay/list")
                .excludePathPatterns("/article/buy")
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/user/userRegister")
                .excludePathPatterns("/user/userInfo")
                .excludePathPatterns("/user/userList")
                .excludePathPatterns("/user/RegSendCode")
                .excludePathPatterns("/article/info")
                .excludePathPatterns("/article/articleList")
                .excludePathPatterns("/category/list")
                .excludePathPatterns("/category/info");
    }
}

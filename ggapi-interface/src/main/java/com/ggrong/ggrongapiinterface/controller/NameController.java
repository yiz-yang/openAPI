package com.ggrong.ggrongapiinterface.controller;

import com.ggrong.ggrongclientsdk.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name, HttpServletRequest request){
        String yupi = request.getHeader("color");
        System.out.println(yupi);
        return "GET 你的名字是" + name;
    }

    @PostMapping("/")
    public String getNameByPost(@RequestParam String name){
        return "POST 你的名字是" + name;
    }


    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request){
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String body = request.getHeader("body");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
        //todo实际情况从数据库中查是否已分配给用户
//        if (!accessKey.equals("yupi")){
//            throw new RuntimeException("无权限");
//        }
//        todo 判断伪随机数
//        if (Long.parseLong(nonce)>10000){
//            throw new RuntimeException("无权限");
//        }
        //todo时间和当前时间不超过5分钟
        // 五分钟内的请求有效
//        if (System.currentTimeMillis()/1000 - Long.parseLong(timestamp) > 5 * 60) {
//            throw new RuntimeException("无权限");
//        }
        //todo从数据库查出secretKey
//        String serverSign = SignUtils.getSign(body,"abcdefgh");
//        if (!sign.equals(serverSign)){
//            throw new RuntimeException("无权限");
//        }
        //todo调用次数+1 invokeConut
        String result = "POST 你的名字是" + user.getUsername();

        return result;
    }


}

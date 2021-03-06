package com.ay.controller;

import com.ay.model.AyUser;
import com.ay.service.AyUserService;
import com.sun.tracing.dtrace.ModuleAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class AyUserController {
    @Resource
    private AyUserService ayUserService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<AyUser> ayUserList = ayUserService.findAll();
        for (AyUser ayUser : ayUserList) {
            System.out.println("id : "+ayUser.getId());
            System.out.println("name : "+ayUser.getName());
        }
        return "hello";
    }

    /*
        @ModelAttribute注解：会让使得这个controller中的每一个方法都会先执行
        用于做一些初始化操作
    */
    // 1.ModelAttribute没有返回值的情况
    @ModelAttribute
    public void init1(Model model){
        System.out.println("init1...");
        AyUser ayUser = new AyUser();
        ayUser.setName("wys");
        model.addAttribute("user", ayUser);
    }

    // 2.ModelAttribute有返回值的情况，相当于model.addAttribute第一种情况
    // 如果和RequestMapping一切用同这个情况，相当与在model中传值
    @ModelAttribute("name")
    public String init2(@RequestParam(value = "name", required = false) String name){
        System.out.println("init2...");
        return name;
    }

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message", "hello world");
        return "hello";
    }

    // 3.ModelAttribute有方法参数
    @ModelAttribute("ayUser")
    public AyUser init3(
            @RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "name", required = false) String name){
        System.out.println("init3...");
        AyUser ayUser = new AyUser();
        ayUser.setName(name);
        ayUser.setId(id);
        return ayUser;
    }

//    @RequestMapping(value = {
//            "",
//            "/page",
//            "page*",
//            "view/*,**/msg"
//    })
//    public String hello(Model model){
//        model.addAttribute("message", "hello ay");
//        return "hello";
//    }

    @RequestMapping(method = RequestMethod.GET)
    String get(){
        return "Hello from get";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    String delete(){
        return "Hello from delete";
    }

    @RequestMapping(method = RequestMethod.POST)
    String post(){
        return "Hello from post";
    }

    @RequestMapping(method = RequestMethod.PUT)
    String put(){
        return "Hello from put";
    }

    @RequestMapping(method = RequestMethod.PATCH)
    String patch(){
        return "Hello from patch";
    }

    @RequestMapping(value = "/produces", produces = {"application/json"})
    @ResponseBody
    public String getProduce(){
        return "Produces attribute";
    }

    @RequestMapping(value = "/consumes", consumes={"application/json"})
    @ResponseBody
    String getConsumes(){
        return "Consumes attribute";
    }

    @RequestMapping(value = "/header", headers = {
            "content-type=text/plain",
            "content-type=text/html"
    })
    @ResponseBody
    public String header(){
        return "header";
    }

    // 使用params来判断是使用fetch还是fetchDifferent方法
    @RequestMapping(value = "/fetch", params = {
            "personId=10"
    })
    @ResponseBody
    public String fetch(@RequestParam("personId") String id ){
        return "Fetched parameter using params attribute " + id;
    }

    @RequestMapping(value = "/fetch", params = {
            "personId=20"
    })
    @ResponseBody
    public String fetchDifferent(@RequestParam("personId") String id ){
        return "Fetched parameter using params attribute " + id;
    }

    @RequestMapping(value = "findById")
    public String findById(String id){
        AyUser ayUser = ayUserService.findById(id);
        System.out.println(ayUser);
        return "success";
    }

    // 获取路径上的值
    @RequestMapping("/pathVariable/{variable}")
    @ResponseBody
    public String pathVariable(@PathVariable String variable){
        return "Get PathVariable param is "+variable;
    }

    // 获取请求头上的参数
    @RequestMapping("/requestHeader")
    @ResponseBody
    public String requestHeader(
            @RequestHeader("Accept-Encoding") String[] encoding,
            @RequestHeader("Accept") String[] accept
    ){
        return "Get requestHeader encoding is "+ Arrays.toString(encoding)+System.lineSeparator()+
                "Get requestHeader accept is "+ Arrays.toString(accept);
    }

    // 获取cookie上的痣
    @RequestMapping("/cookieValue")
    @ResponseBody
    public String cookieValue(@CookieValue("JSESSIONID") String cookie){
        return "Get cookie param is "+cookie;
    }

    //
}

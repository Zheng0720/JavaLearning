package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.User;
import domain.VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ZhengXinchang
 * @create 2021-10-06-16:20
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/quick22")
    @ResponseBody()
    public void save22(String username, MultipartFile uploadFile, MultipartFile uploadFile2, MultipartFile uploadFile3) throws IOException {
        System.out.println(username);
        //获得上传文件名称
        String filename = uploadFile.getOriginalFilename();
        String filename2 = uploadFile2.getOriginalFilename();
        String filename3 = uploadFile3.getOriginalFilename();
        uploadFile.transferTo(new File("D:\\onedrive\\Desktop\\"+filename));
        uploadFile2.transferTo(new File("D:\\onedrive\\Desktop\\"+filename2));
        uploadFile3.transferTo(new File("D:\\onedrive\\Desktop\\"+filename3));


    }

    @RequestMapping(value = "/quick18")
    @ResponseBody()
    public void save18(Date date) {
        System.out.println(date);
    }

    @RequestMapping(value = "/quick17/{name}")
    @ResponseBody()
    public void save17(@PathVariable(value = "name", required = false) String name) {
        System.out.println(name);
    }

    @RequestMapping(value = "/quick16", produces = {"text/html;charset=utf-8"})
    @ResponseBody()
    public void save16(@RequestParam(value = "name", required = false, defaultValue = "周杰伦") String username) {
        System.out.println(username);
    }

    @RequestMapping(value = "/quick15", produces = {"text/html;charset=utf-8"})
    @ResponseBody()
    public void save15(@RequestBody List<User> users) {
        for (User user : users) {
            System.out.println(user);
        }
    }

    @RequestMapping(value = "/quick14", produces = {"text/html;charset=utf-8"})
    @ResponseBody()
    public void save14(VO vo) {
        System.out.println(vo);
    }


    @RequestMapping(value = "/quick13", produces = {"text/html;charset=utf-8"})
    @ResponseBody()
    public void save13(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    @RequestMapping(value = "/quick12", produces = {"text/html;charset=utf-8"})
    @ResponseBody()
    public void save12(User user) throws JsonProcessingException {
        System.out.println(user);
    }

    @RequestMapping(value = "/quick11", produces = {"text/html;charset=utf-8"})
    @ResponseBody()
    public void save11(String name, int age) throws JsonProcessingException {
        User user = new User(name, age);
        System.out.println(user);
    }

    @RequestMapping(value = "/quick10", produces = {"application/json;charset=utf-8"})
    @ResponseBody()
    public ArrayList<User> save10() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("李姝凝", 18));
        users.add(new User("郑鑫昌", 29));
        users.add(new User("周杰伦", 30));
        return users;
    }

    @RequestMapping(value = "/quick9", produces = {"text/html;charset=utf-8"})
    @ResponseBody()
    public String save9() throws JsonProcessingException {
        User user = new User("郑鑫昌", 18);
        //使用json转换工具将对象转换成json格式的字符串，然后返回
        ObjectMapper objectMapper = new ObjectMapper();
        String userJson = objectMapper.writeValueAsString(user);
        return userJson;
    }

    @RequestMapping(value = "/quick8", produces = {"text/html;charset=utf-8"})
    @ResponseBody()
    public String save8() {
        return "{\"username\":\"郑鑫昌\",\"age\":18}";
    }

    @RequestMapping(value = "/quick7", produces = {"text/html;charset=utf-8"})
    @ResponseBody()
    public String save7() {
        return "郑鑫昌";
    }


    @RequestMapping(value = "/quick6")
    public void save6(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("周杰伦");
    }

    @RequestMapping(value = "/quick5")
    public String save5(HttpServletRequest request) {
        request.setAttribute("name", "周杰伦");
        return "../index";
    }

    @RequestMapping(value = "/quick4")
    public String save4(Model model) {
        model.addAttribute("userName", "郑鑫昌");

        return "../index";
    }

    @RequestMapping(value = "/quick3")
    public ModelAndView save3(ModelAndView modelAndView) {
        //设置模型数据
        modelAndView.addObject("userName", "李姝凝");
        //设置视图
        modelAndView.setViewName("../index");
        return modelAndView;
    }

    @RequestMapping(value = "/quick2")
    public ModelAndView save2() {
        /**
         * model:模型 作用封装数据
         * view:视图 作用展示数据
         */
        System.out.println("UserController save2 running.....");
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("userName", "郑鑫昌");
        //设置视图
        modelAndView.setViewName("../index");
        return modelAndView;
    }


    @RequestMapping(value = "/quick", method = RequestMethod.GET)
    public String save() {
        System.out.println("UserController running.....");

        return "success";
    }
}

package com.telusko.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String home() {
        System.out.println("Home method called");
        return "index.jsp";
    }

    @RequestMapping("add")
//    public String add(HttpServletRequest req , HttpSession session){

        public String add(@RequestParam("num1") int num, int num2  , HttpSession session){

//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num + num2 + 7;

        session.setAttribute("result",result);

        System.out.println(result);

//        System.out.println("in add");
         return "result.jsp";
   }

}
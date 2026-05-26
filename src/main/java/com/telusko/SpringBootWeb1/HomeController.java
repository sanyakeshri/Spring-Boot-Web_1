//RUN THIS IN BROWSER TO GET ALIEN OUTPUT:
//http://localhost:8080/addAlien?aid=101&aname=Sanya

package com.telusko.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String home() {
        System.out.println("Home method called");
        return "index";
    }

    @RequestMapping("addAlien")
//    public String add(HttpServletRequest req , HttpSession session){

        public ModelAndView addAlien(@RequestParam("aid") int aid,@RequestParam("aname") String aname  , ModelAndView model){


//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//          int result = num + num2 + 12;

//        session.setAttribute("result",result);

//        model.addAttribute("result" , result);

        Alien alien = new Alien();
        alien.setAid(aid);
        alien.setAname(aname);

        // Create ModelAndView object
       ModelAndView mv = new ModelAndView();

        mv.addObject("alien" , alien);
        mv.setViewName("result");

//        System.out.println(result);

//        System.out.println("in add");
         return mv ;
   }

}
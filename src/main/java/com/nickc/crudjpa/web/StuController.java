package com.nickc.crudjpa.web;

import com.nickc.crudjpa.entity.Stu;
import com.nickc.crudjpa.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StuController {
    @Resource
    StuService stuService;

    @RequestMapping("/")
    public String index(){
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Model model){
        List<Stu> list=stuService.getUserList();
        model.addAttribute("stus",list);
        return "stu/list";
    }

    @RequestMapping("/toAdd")
    public String eoAdd(){
        return "stu/stuAdd";
    }

    @RequestMapping("/add")
    public String add(Stu stu){
        stuService.save(stu);
        return "redirect:/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id){
        Stu stu=stuService.findUserById(id);
        model.addAttribute("stu",stu);
        return "stu/stuEdit";
    }
    @RequestMapping("/edit")
    public String edit(Stu stu){
        stuService.edit(stu);
        return "redirect:/list";
    }

    @RequestMapping("/delete")
    public String list(Long id){
        System.out.println(id);
        stuService.delete(id);
        return "redirect:/list";
    }
}

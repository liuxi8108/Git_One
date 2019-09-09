package com.maven.controller;



import com.maven.pojo.Items;
import com.maven.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/select")
    public String findDetail(Model model){

        Items byId = itemsService.findById(1);
        model.addAttribute("item", byId);
        return "list";
    }
}

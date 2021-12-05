package com.example.basicwebshop.models;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Collectors;

@Controller
public class MainController{
    private String companyName = "EddieShop";
    private String euro="e";
    private String kc="Kč";
    private ListOfItems listOfItems= new ListOfItems();
    public MainController(){
        listOfItems.addItem(new Item("Running shoes","Nike running shoes for every day sport",1000.0,
                5));
        listOfItems.addItem(new Item("Printer","Some HP printer that will print pages",3000.0,
                2));
        listOfItems.addItem(new Item("Coca cola","0.5 coke",25.0,0));
        listOfItems.addItem(new Item("Wokin","Chicken with fried rice and WOKIN sauce",119.0,
                100));
        listOfItems.addItem(new Item("T-shirt","Blue with a cogi on a bike",300.0,1));
    }
    @GetMapping("/")
    public String getMainPage(Model model){
        model.addAttribute("companyName",companyName);
        model.addAttribute("listOfItems",listOfItems.getItems());
        return "index";
    }
    @GetMapping("/only")
    public String getOnlyAvailable(Model model){
        model.addAttribute("companyName",companyName);
        model.addAttribute("listOfItems",listOfItems.searchNotEmpty());
        return "index";
    }
    @GetMapping("/cheapest")
    public String getCheapestAvailable(Model model){
        model.addAttribute("companyName",companyName);
        model.addAttribute("listOfItems",listOfItems.getCheapest());
        return "index";
    }
    @GetMapping("/nike")
    public String getContainsNike(Model model){
        model.addAttribute("companyName",companyName);
        model.addAttribute("listOfItems",listOfItems.searchInDescription("Nike"));
        return "index";
    }
    @GetMapping("/average")
    public String getAverageStock(Model model){
        model.addAttribute("companyName",companyName);
        model.addAttribute("average",listOfItems.getAverageQuants());
        return "average";
    }
    @GetMapping("/expensive")
    public String getMostExpensive(Model model){
        model.addAttribute("companyName",companyName);
        model.addAttribute("listOfItems",listOfItems.getMostExpensive());
        return "index";
    }
    @PostMapping("/search")
    public String search(@RequestParam String searchCont,Model model){
        model.addAttribute("companyName",companyName);
        model.addAttribute("listOfItems",listOfItems.searchInDescription(searchCont));
        return "index";
    }

}

package com.example.bankofsimba.controllers;

import com.example.bankofsimba.model.Acounts;
import com.example.bankofsimba.model.BankAccount;
import jdk.jfr.BooleanFlag;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.stream.Collector;

@Controller
public class MainController {
    private Acounts acounts=new Acounts();
    private String htmlCeption="This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    public MainController(){
        acounts.addAcc(new BankAccount("Simba",2000.0,"lion",false,false));
        acounts.addAcc(new BankAccount("Zebra",2000.00,"zebra",false,false));
        acounts.addAcc(new BankAccount("Mustafa",900000.00,"lion",true,false));
        acounts.addAcc(new BankAccount("Scar",10.00,"lion",false,true));
        acounts.addAcc(new BankAccount("Pumba",500.00,"pig",false,false));
        acounts.addAcc(new BankAccount("Timon",500.00,"surikata",false,false));
        acounts.addAcc(new BankAccount("Rafiki",1500.00,"monkey",false,false));

    }
    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public String showAcount(Model model) {
        model.addAttribute("account",acounts.getBankAccounts().get(1));
        model.addAttribute("name",acounts.getBankAccounts().get(0).getName());
        model.addAttribute("balance",acounts.getBankAccounts().get(0).getBalance());
        model.addAttribute("animalType",acounts.getBankAccounts().get(0).getAnimalType());

        return "index";
    }
    @RequestMapping(path = "/htmlception", method = RequestMethod.GET)
    public String showHtmlception(Model model) {

        model.addAttribute("htmlCeption",htmlCeption);
        return "htmlception";
    }

    @GetMapping ("/accounts")
    public String getAccounts (@RequestParam(required =false) String bad, Model model) {
        if (bad==null ||bad.equals("null")){
            model.addAttribute("account", acounts.getBankAccounts());
        }else {
            model.addAttribute("account", acounts.getByBad(new Boolean(bad)));
        }


        return "showAll";
    }
    @GetMapping("/accounts2")
    public String addMoney (@RequestParam(required = false)String accRaise,Model model){

        acounts.getBankAccounts().stream().filter(acc->acc.getName().equals(accRaise)).forEach(acc->acc.addMoneyBy(acc.getKing()?100.0:10.0));
        model.addAttribute("account", acounts.getBankAccounts());
        return "showAll";
    }
    @GetMapping("/newAccount")
        public String addAcc (@RequestParam String name ,@RequestParam Double balance,@RequestParam String animalType
                ,@RequestParam String isKing,@RequestParam String isBad,Model model){
        acounts.addAcc(new BankAccount(name,balance,animalType,isKing.equals(isKing),isBad.equals(isBad)));
            model.addAttribute("account", acounts.getBankAccounts());
            return "showAll";
        }


}

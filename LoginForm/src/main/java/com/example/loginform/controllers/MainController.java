package com.example.loginform.controllers;

import com.example.loginform.models.Account;
import com.example.loginform.models.AccountList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
 AccountList accountList= new AccountList();
 public MainController(){
accountList.addAcc(new Account("edie","apple"));
 }

@GetMapping("/")
 public String index(Model model){
  return "index";
 }

 @GetMapping("/newAcc")
 public String login(@RequestParam String username, @RequestParam String password, Model model){
  if(accountList.getAccounts().stream().allMatch(acc->acc.getPassword().equals(password))&&
          (accountList.getAccounts().stream().allMatch(acc->acc.getUsername().equals(username)))){
   return "login";
  }else {
   return "badlogin";
  }


 }
}

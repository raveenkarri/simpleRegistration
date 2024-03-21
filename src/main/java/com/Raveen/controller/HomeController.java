package com.Raveen.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.Raveen.entity.User;
import com.Raveen.repo.UserRepo;

@Controller
public class HomeController {

	@Autowired
	public UserRepo repo;
	

	@GetMapping("/")
	public String showIndex() {
		return "index";
	}
	@GetMapping("/registerpage")
	public String showRegistration(User user) {
		return "registerpage";
	}
    @GetMapping("/loginpage")
	public String showLogin(User user) {
		return "login";
		}
	@PostMapping("/register")
	public String registration(@ModelAttribute("user") User user) {
		repo.save(user);
		return "index";
		}
	@GetMapping("/users")
	public String getAll(Model model){		
		List<User> user = repo.findAll();
		model.addAttribute("user",user);
		return "profile";
	}
	@PostMapping("/login")
	public String login(@ModelAttribute User user,Model model) {
	Optional<User> userdata = repo.findById(user.getUserName());
	//model.addAttribute("userd",user);
	//model.addAttribute("userlname",user.getLastName());
	//model.addAttribute("username",user.getUserName());
	if(user.getPassWord().equals(userdata.get().getPassWord())) {

		List<User> users = repo.findAll();
		model.addAttribute("user",users);
		return "profile";
	}else {
		return "error";
	}
		}
    
	}

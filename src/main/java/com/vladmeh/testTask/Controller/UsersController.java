package com.vladmeh.testTask.Controller;

import com.vladmeh.testTask.Entity.Users;
import com.vladmeh.testTask.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/users")
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;


    @RequestMapping("")
    public String users(Model model) {
        model.addAttribute("users", usersRepository.findAll());
        return "users";
    }

    @GetMapping(path = "/add")
    public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String password){
        Users users = new Users();
        users.setUsername(name);
        users.setPassword(password);
        usersRepository.save(users);

        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Page<Users> getAllUsers(@RequestParam(required = false, defaultValue = "0") String page){
        int pageNumber = Integer.parseInt(page);
        return usersRepository.findAll(new PageRequest(pageNumber,10));
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Users getUserById(@PathVariable("id") long id){
        return usersRepository.findOne(id);
    }
}

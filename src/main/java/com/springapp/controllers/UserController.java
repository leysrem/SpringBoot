package com.springapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapp.dtos.UserDto;

import com.springapp.entities.Role;
import com.springapp.entities.User;
import com.springapp.services.RoleService;
import com.springapp.services.UserService;



@Controller
@RequestMapping(UserController.BASE_ROUTE)
public class UserController extends BaseCrudController<User, UserDto> {

    public static final String TEMPLATE_NAME = "user";
    public static final String BASE_ROUTE = "user";

    public UserController() {
        super(TEMPLATE_NAME);
    }

    @Autowired
    private UserService service;

    @Autowired
    private RoleService roleService;
    
   /* @Autowired	
    private BookService bookService;*/
    

    @GetMapping("testgen")
    public void testGen() {
        this.service.generateUsers(20);
    }

    @Override
    protected void preCreateGet(final Model model) {
        model.addAttribute("roles", this.roleService.getTemplateList());
        /*model.addAttribute("book", this.bookService.getTemplateList());*/
    }

    @Override
    protected User preCreatePost(UserDto dto) throws Exception {
        User user = new User();
        user.setFirstname(dto.getFirstname());
        user.setLastname(dto.getLastname());

        if (dto.getRoleId() != null) {
            Role role = this.roleService.findRole(dto.getRoleId());
            if (role == null) {
                throw new Exception("Cannot find whished role");
            }
            user.setRole(role);
        }
        

     /*   if (dto.getBookId() != null) {
        	@SuppressWarnings("unchecked")
			List<Book> books = (List<Book>) this.bookService.findBook(dto.getBookId());
            if (books == null) {
                throw new Exception("Cannot find whished role");
            }
            user.setBooks(books);
        }*/

        
		return user;
    }     
       
}

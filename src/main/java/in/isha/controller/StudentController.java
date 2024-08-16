package in.isha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.ui.Model;
import in.isha.binding.Student;

public class StudentController {
	@GetMapping("/")
	private String loadIndexPage(Model model) {
        Student sobj=new Student();
        model.addAttribute("student", sobj);
		return "index";
	}
	
            
}

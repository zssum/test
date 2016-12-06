package edu.iss.caps.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.iss.caps.model.LecturerDetails;
import edu.iss.caps.service.CourseService;
import edu.iss.caps.service.LecturerService;

/*import edu.iss.cats.exception.CourseNotFound;
import edu.iss.cats.model.Course;
import edu.iss.cats.model.CourseEvent;
import edu.iss.cats.service.CourseEventService;
import edu.iss.cats.service.CourseService;
import edu.iss.cats.validator.CourseValidator;*/

@Controller
@RequestMapping(value = "/test")
public class TestController {
	@Autowired
	private LecturerService lds;
	@Autowired
	private CourseService cs;

	@RequestMapping(value = "/1")
	@ResponseBody
	public String test() {//lollol
		
		String s="";
		ArrayList<LecturerDetails> l = lds.findAllLecturers();
		for (LecturerDetails ldetails : l){
			s=s+ldetails.toString();
		}
		return s;

	}
	
	@RequestMapping(value = "/2")
	@ResponseBody
	public String test2() {
		
		return cs.findCourse(1).toString();
	}
	
	

}

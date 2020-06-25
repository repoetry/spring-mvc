package info.rue.web.example.exam01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import info.rue.web.example.exam01.service.Exam01Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/example/exam01")
public class Exam01Controller {

    @Autowired
    Exam01Service exam01Service;

    @RequestMapping(value="/hello")
	public ModelAndView hello(@RequestParam(required=false, defaultValue="World") String name) {
		ModelAndView ret = new ModelAndView("example/exam01/hello");
		// Adds an objet to be used in home.jsp
		ret.addObject("name", name);
		return ret;
	}

    @RequestMapping(value="/dbTest")
    public ModelAndView dbTest(@RequestParam(required=false, defaultValue="World") String name) {
        ModelAndView ret = new ModelAndView("example/exam01/hello");

        ret.addObject("time", exam01Service.dbTest());
        return ret;
    }
}

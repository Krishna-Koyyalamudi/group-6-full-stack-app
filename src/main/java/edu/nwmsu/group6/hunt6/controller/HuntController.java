package edu.nwmsu.group6.hunt6.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import edu.nwmsu.group6.hunt6.repository.LocationRepository;

@Controller
public class HuntController {

	@Resource
	private LocationRepository locationRepository;

	ModelAndView mv = new ModelAndView();

	@RequestMapping("/")
	@ResponseBody
	public ModelAndView show() {
		System.out.println("Entering Home");
		mv.setViewName("index");
		return mv;
	}

	@GetMapping
	public String huntDemo() {
		return "serviceUp";
	}
}

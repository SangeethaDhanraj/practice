package com.abc.travels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@SessionAttributes({ "destination", "hotel", "noofdays", "cab", "name" })
public class MainController {
	String name, address, contactno, password, loginId;

	@Autowired
	UserDB userDBObj;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		model.addAttribute("message", "Welcome to ABC Travels!");
		return "index1";
	}

	@RequestMapping(value = "/Error", method = RequestMethod.GET)
	public String errorpage() {
		return "ErrorPage";
	}

	@RequestMapping(value = "/Logout", method = RequestMethod.GET)
	public String logout() {
		return "index1";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signUppage() {
		return "SignUp";
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcomepage() {
		return "welcome";
	}

	@RequestMapping(value = "/MainPage", method = RequestMethod.GET)
	public String mainPage() {
		return "Mainpage";
	}

	@RequestMapping(value = "/TourPackagePage", method = RequestMethod.GET)
	public String tourPackagePage() {
		return "TourPackagePage";
	}

	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	@ResponseBody
	public String loginuser(@RequestBody String jsonData, Model model) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		String result = null, response = null;

		try {
			UserDetails userObject = objectMapper.readValue(jsonData, UserDetails.class);

			loginId = userObject.getLoginId();
			password = userObject.getPassword();

			model.addAttribute("name", loginId);

			result = userDBObj.verifyUser(loginId, password);
		} catch (Exception e) {
			System.out.println("Sorry error occured while sign in, please sign in again with valid credentials");
		}
		if (result == "success") {
			response = objectMapper.writeValueAsString("success");
		} else {
			response = objectMapper.writeValueAsString("Error");
		}
		return response;
	}

	@RequestMapping("/HotelBooking")
	public ModelAndView hotelBooking(@RequestParam String destionation) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("destination", destionation);
		modelAndView.setViewName("HotelBooking");
		return modelAndView;

	}

	@RequestMapping("/CabBooking")
	public ModelAndView cabBooking(@RequestParam String hotel, @RequestParam String noofdays) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("hotel", hotel);
		modelAndView.addObject("noofdays", noofdays);
		modelAndView.setViewName("CabBooking");
		return modelAndView;

	}

	@RequestMapping("/TourPackage")
	public ModelAndView tourPackage(@RequestParam String cab, Model model) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("cab", cab);
		modelAndView.setViewName("Display");
		return modelAndView;

	}

	@RequestMapping(value = "/Registration", method = RequestMethod.POST)
	@ResponseBody
	public String registerUser(@RequestBody String jsonData) {
		ObjectMapper objectMapper = new ObjectMapper();

		try {

			UserDetails userObj = objectMapper.readValue(jsonData, UserDetails.class);

			name = userObj.getName();
			address = userObj.getAddress();
			contactno = userObj.getContactno();
			loginId = userObj.getLoginId();
			password = userObj.getPassword();

			String result = userDBObj.addUser(name, address, contactno, loginId, password);
			if (result == "success") {
				return objectMapper.writeValueAsString("success");
			} else {
				return objectMapper.writeValueAsString("Error");
			}
		} catch (Exception e) {
			System.out.println(
					"Some error had occured while sign up, please sign up again with valid informations or try again later! ");
		}
		return "";
	}

}

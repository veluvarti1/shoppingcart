package com.example.shopping.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.ShoppingBackend.dao.CategoryDAO;
import com.example.ShoppingBackend.dto.Category;

@Controller
public class PageController {

	@Autowired
	CategoryDAO categoryDAO;

	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView home() {
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome",true);

		List<Category> categorys = categoryDAO.list();
		System.out.println(categorys.size());
		mv.addObject("categorys",categorys);


		return mv;
	}

	@RequestMapping(value= "/about")
	public ModelAndView about() {
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}

	@RequestMapping(value= "/contact")
	public ModelAndView contact() {
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
	}


	/*
	 * Methods to load all the products based on category
	 */
	@RequestMapping(value = { "/show/all/products" })
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		// passing the list of categories
		mv.addObject("categorys", categoryDAO.list());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}


	/*
	 * Methods to load all the products based on category
	 */
	@RequestMapping(value = { "/show/category/{id}/products" })
	public ModelAndView showProductsByCategory(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		Category category = categoryDAO.get(id);

		mv.addObject("title", category.getName());
		// passing the list of categories
		mv.addObject("categorys", categoryDAO.list());
		mv.addObject("category", category);
		mv.addObject("userClickCategory", true);
		return mv;
	}
}

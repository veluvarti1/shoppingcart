package com.example.ShoppingBackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.ShoppingBackend.dao.CategoryDAO;
import com.example.ShoppingBackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {


	public static List<Category> categories = new ArrayList<Category>();

	 static {
 // adding first category
 Category category = new Category();
 category.setId(1);
  category.setName("Television");
 category.setDescription("Description for television");
 category.setImageUrl("CAT_1.png");

	 categories.add(category);

	 // adding second category
	 category = new Category();
	 category.setId(2);
	 category.setName("Mobile");
	 category.setDescription("Description for mobile");
	 category.setImageUrl("CAT_2.png");

	 categories.add(category);

	 // adding third category
	 category = new Category();
	 category.setId(3);
	 category.setName("Laptop");
	 category.setDescription("Description for laptop");
	 category.setImageUrl("CAT_3.png");

	 categories.add(category);
	 }

	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		for (Category category: categories){
			if(id== category.getId()) return category;
		}
		return null;
	}

}

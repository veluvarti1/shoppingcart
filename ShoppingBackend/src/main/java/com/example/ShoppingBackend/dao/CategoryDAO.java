package com.example.ShoppingBackend.dao;

import java.util.List;

import com.example.ShoppingBackend.dto.Category;

public interface CategoryDAO {

	public List<Category> list();

	public Category get(int id);
}

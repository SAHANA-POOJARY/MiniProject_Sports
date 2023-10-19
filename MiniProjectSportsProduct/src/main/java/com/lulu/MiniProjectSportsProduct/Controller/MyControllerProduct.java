package com.lulu.MiniProjectSportsProduct.Controller;

import java.util.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lulu.MiniProjectSportsProduct.Entity.SportsProduct;
import com.lulu.MiniProjectSportsProduct.Repository.Repository;

import jakarta.persistence.EntityNotFoundException;
@RequestMapping("/pps")
@RestController
public class MyControllerProduct {
	
	@Autowired
	Repository repo;
	
	@GetMapping("/getProduct")
	public List<SportsProduct> getJPQL(){
		return repo.findAll();
	}
	
	@PostMapping("/postProduct")
	public SportsProduct createuser(@RequestBody SportsProduct pd)
	{
		return repo.save(pd);
	}
	
	@DeleteMapping("/deleteProduct/{SportsProductid}")
	public void deleteProduct(@PathVariable("SportsProductid") Integer  SportsProductid ) {
		repo.deleteById(SportsProductid);
	}
	
	

	@PutMapping("/updatesport/{SportsProductid}")

	 

			public SportsProduct updatePurchase(@PathVariable int SportsProductid, @RequestBody SportsProduct updatedProduct) {

	 

			    Optional<SportsProduct> existingProduct = repo.findById(SportsProductid);

	 

		

	 

			    if (existingProduct.isPresent()) {

	 

			        SportsProduct productToUpdate = existingProduct.get();

	 

			        

	 

			        // Update the fields of the existing product with the new data

	 

			        if (updatedProduct.getSportsProductname() != null) {

	 

			            productToUpdate.setSportsProductname(updatedProduct.getSportsProductname());

	 

			        }

	 

	 

			        if (updatedProduct.getSportsProductcost() != 0.0) {

	 

			            productToUpdate.setSportsProductcost(updatedProduct.getSportsProductcost());

	 

			        }

	 
			        if (updatedProduct.getPhonenumber() != 0.0) {

			       	 

			            productToUpdate.setPhonenumber(updatedProduct.getPhonenumber());

	 

			        }
		

	 

			        // Save the updated product to the repository

	 

			        return repo.save(productToUpdate);

	 

			    } else {

	 

			        // Handle the case where the product with the given ID doesn't exist

	 

			        throw new EntityNotFoundException("Sports Product with ID " + SportsProductid + " not found");

	 

			    }

	 

			}
//	
//	@PutMapping("/ students/{id}")
//	public ResponseEntity<Object> updatestudent (@RequestBody SportsProduct student, @Pathvariable int id) {
//	Optional<SportsProduct> studentoptional = repo.findById(id);
//	
//	if (studentoptional.isEmpty())
//	return ResponseEntity.notFound().build();
//	student.setId(id);
//	studentRepository. save(student);
//	return ResponseEntity.noContent().build();
//}
}
package com.lulu.MiniProjectSportsProduct.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulu.MiniProjectSportsProduct.Entity.SportsProduct;

public interface Repository extends JpaRepository<SportsProduct, Integer>
{

}

package com.aa.repository;



import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.aa.model.User;




public interface HomeRpository extends  PagingAndSortingRepository<User, Integer> {

}

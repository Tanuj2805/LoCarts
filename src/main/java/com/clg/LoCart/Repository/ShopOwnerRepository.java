package com.clg.LoCart.Repository;

import com.clg.LoCart.Model.User;
import com.clg.LoCart.Model.shopowner;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.Query;


@Repository
public interface ShopOwnerRepository extends MongoRepository<shopowner,String> {




    shopowner findByemail(String email);
}

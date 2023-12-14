package com.api.chillmood.user.persistence;

import com.api.chillmood.user.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {

    Account findByName(String name);

}

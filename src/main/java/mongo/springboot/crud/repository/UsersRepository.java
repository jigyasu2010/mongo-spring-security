package mongo.springboot.crud.repository;

import mongo.springboot.crud.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users,String> {
    Users findByUserName(String username);
}

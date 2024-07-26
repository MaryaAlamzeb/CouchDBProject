package org.project.repository;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;
import org.ektorp.support.GenerateView;
import org.project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserRepository extends CouchDbRepositorySupport<User> {

    @Autowired
    public UserRepository(CouchDbConnector db) {
        super(User.class, db);
        try {
            initStandardDesignDocument();
            System.out.println("UserRepository bean created with db: " + db);
        } catch (Exception e) {
            System.err.println("Error creating UserRepository bean: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }


}


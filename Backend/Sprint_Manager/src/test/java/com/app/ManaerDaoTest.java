package com.app;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.app.dao.ManagerDao;
import com.app.entities.Manager;
import java.util.Optional;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class ManaerDaoTest {

    @Autowired
    private ManagerDao managerRepository;

    @Test
    public void testFindByEmail() {
        // Create a manager entity
        Manager manager = new Manager();
        manager.setEmail("john.doe@example.com");
        // Set other properties as needed

        // Save the manager
        managerRepository.save(manager);

        // Retrieve the manager by email
        Optional<Manager> foundManager = managerRepository.findByEmail("john.doe@example.com");

        // Assert that the retrieved manager is not null
        assertNotNull(foundManager);
        // Add more assertions based on your specific use case
    }
}

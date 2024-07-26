package org.project.service;

import org.project.entity.User;
import org.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

    @Service
    public class UserService {

        @Autowired
        private UserRepository userRepository;

        public List<User> getAllUsers() {
            return userRepository.getAll();
        }

        public User getUserById(String id) {
            return userRepository.get(id);
        }

        public void createUser(User user) {
            userRepository.add(user);
        }

        public void updateUser(User user) {
            userRepository.update(user);
        }

        public void deleteUser(String id) {
            User user = userRepository.get(id);
            userRepository.remove(user);
        }
    }


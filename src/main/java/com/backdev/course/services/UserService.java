package com.backdev.course.services;

import com.backdev.course.entities.User;
import com.backdev.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backdev.course.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id)); //se nao conseguir dar o get throw erro
    }
    public User insert(User obj){
        repository.save(obj);
        return obj;
    }
    public void delete(Long id){
        repository.deleteById(id);
    }
    public User update(Long id, User obj) {
        User entity = repository.getReferenceById(id); //apenas prepara e deixa pronto para voce mexer na entidade - diferente do get id que traz o elemento
        updateData(entity, obj);
        return repository.save(entity);
    }
    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

}

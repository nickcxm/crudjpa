package com.nickc.crudjpa.service.impl;

import com.nickc.crudjpa.entity.Stu;
import com.nickc.crudjpa.repository.StuRepository;
import com.nickc.crudjpa.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceImpl implements StuService{
    @Autowired
    private StuRepository stuRepository;
    @Override
    public List<Stu> getUserList() {
        return stuRepository.findAll();
    }

    @Override
    public Stu findUserById(long id) {
        return stuRepository.findById(id);
    }

    @Override
    public void save(Stu stu) {
        stuRepository.save(stu);
    }

    @Override
    public void edit(Stu stu) {
        stuRepository.save(stu);
    }

    @Override
    public void delete(Long id) {
        stuRepository.deleteById(id);
    }
}

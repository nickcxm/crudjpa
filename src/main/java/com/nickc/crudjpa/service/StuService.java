package com.nickc.crudjpa.service;

import com.nickc.crudjpa.entity.Stu;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.util.List;

public interface StuService {
    public List<Stu> getUserList();
    public Stu findUserById(long id);
    public void save(Stu stu);
    public void edit(Stu stu);

    public void delete(Long id);
}

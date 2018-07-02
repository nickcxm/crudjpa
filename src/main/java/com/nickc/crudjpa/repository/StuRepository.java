package com.nickc.crudjpa.repository;

import com.nickc.crudjpa.entity.Stu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;

public interface StuRepository extends JpaRepository<Stu,Long>{
    Stu findById(long id);

    @Modifying
    @Transactional
    Long deleteById(Long id);
}

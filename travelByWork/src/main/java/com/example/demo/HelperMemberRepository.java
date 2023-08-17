package com.example.demo;

import com.example.demo.model.HelperMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface HelperMemberRepository extends JpaRepository<HelperMember,Integer> {
    HelperMember findHelperMemberByAccount(String account);


}

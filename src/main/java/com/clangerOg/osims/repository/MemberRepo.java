package com.clangerOg.osims.repository;

import com.clangerOg.osims.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Repository is an interface that provides access to data in a database
 */
public interface MemberRepo extends JpaRepository<Member, Integer> {
}

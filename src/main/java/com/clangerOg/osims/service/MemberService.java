package com.clangerOg.osims.service;

import com.clangerOg.osims.entity.Member;
import com.clangerOg.osims.repository.MemberRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Service layer is where all the business logic lies
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {

    private final MemberRepo memberRepo;

    public List<Member> getAllMembers(){
        return memberRepo.findAll();
    }

    public Member getMemberById(Integer id){
        Optional<Member> optionalMember = memberRepo.findById(id);
        if(optionalMember.isPresent()){
            return optionalMember.get();
        }
        log.info("Member with id: {} doesn't exist", id);
        return null;
    }

    public Member saveMember (Member Member){
        Member.setCreatedAt(LocalDateTime.now());
        Member.setUpdatedAt(LocalDateTime.now());
        Member savedMember = memberRepo.save(Member);

        log.info("Member with id: {} saved successfully", Member.getId());
        return savedMember;
    }

    public Member updateMember (Member Member) {
        Optional<Member> existingMember = memberRepo.findById(Member.getId());
        Member.setCreatedAt(existingMember.get().getCreatedAt());
        Member.setUpdatedAt(LocalDateTime.now());

        Member updatedMember = memberRepo.save(Member);

        log.info("Member with id: {} updated successfully", Member.getId());
        return updatedMember;
    }

    public void deleteMemberById (Integer id) {
        memberRepo.deleteById(id);
    }

}
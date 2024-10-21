package com.clangerOg.osims.controller;

import com.clangerOg.osims.entity.Member;
import com.clangerOg.osims.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class is where all the user requests are handled and required/appropriate
 * responses are sent
 */
@RestController
@RequestMapping("/member/v1")
@RequiredArgsConstructor
@Validated
public class MemberController {

    private final MemberService memberService;

    /**
     * This method is called when a GET request is made
     * URL: localhost:8080/Member/v1/
     * Purpose: Fetches all the Members in the Member table
     * @return List of Members
     */
    @GetMapping("/")
    public ResponseEntity<List<Member>> getAllMembers(){
        System.out.println("Fetching all");
        return ResponseEntity.ok().body(memberService.getAllMembers());
    }

    /**
     * This method is called when a GET request is made
     * URL: localhost:8080/Member/v1/1 (or any other id)
     * Purpose: Fetches Member with the given id
     * @param id - Member id
     * @return Member with the given id
     */
    @GetMapping("/{id}")
    public ResponseEntity<Member> getMemberById(@PathVariable Integer id)
    {
        return ResponseEntity.ok().body(memberService.getMemberById(id));
    }

    /**
     * This method is called when a POST request is made
     * URL: localhost:8080/Member/v1/
     * Purpose: Save an Member entity
     * @param Member - Request body is an Member entity
     * @return Saved Member entity
     */
    @PostMapping("/")
    public ResponseEntity<Member> saveMember(@RequestBody Member Member)
    {
        return ResponseEntity.ok().body(memberService.saveMember(Member));
    }

    /**
     * This method is called when a PUT request is made
     * URL: localhost:8080/Member/v1/
     * Purpose: Update an Member entity
     * @param Member - Member entity to be updated
     * @return Updated Member
     */
    @PutMapping("/")
    public ResponseEntity<Member> updateMember(@RequestBody Member Member)
    {
        return ResponseEntity.ok().body(memberService.updateMember(Member));
    }

    /**
     * This method is called when a PUT request is made
     * URL: localhost:8080/Member/v1/1 (or any other id)
     * Purpose: Delete an Member entity
     * @param id - Member's id to be deleted
     * @return a String message indicating Member record has been deleted successfully
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMemberById(@PathVariable Integer id)
    {
        memberService.deleteMemberById(id);
        return ResponseEntity.ok().body("Deleted Member successfully");
    }


}
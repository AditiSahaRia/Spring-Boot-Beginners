package com.projects.beginners.controller;

import com.projects.beginners.model.Member;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {

    Member member;

    @GetMapping("{id}")
    public Member getMember(String id) {
        return member;
    }

    @PostMapping
    public String addMember(@RequestBody Member member) {
        this.member = member;
        return "success";
    }

    @PutMapping
    public String updateMember(@RequestBody Member member) {
        this.member = member;
        return "success";
    }

    @DeleteMapping("{id}")
    public String deleteMember(String id) {
        this.member = null;
        return "success";
    }
}

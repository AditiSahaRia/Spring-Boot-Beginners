package com.projects.beginners.controller;

import com.projects.beginners.model.Member;
import com.projects.beginners.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("{id}")
    public Member getMember(@PathVariable("id") String id) {
        return memberService.getMember(id);
    }

    @GetMapping
    public List<Member> getMembers() {
        return memberService.getAllMembers();
    }

    @PostMapping
    public String addMember(@RequestBody Member member) {
        memberService.addMember(member);
        return "added successfully";
    }

    @PutMapping
    public String updateMember(@RequestBody Member member) {
        memberService.updateMember(member);
        return "updated successfully";
    }

    @DeleteMapping("{id}")
    public String deleteMember(@PathVariable("id") String id) {
        memberService.deleteMember(id);
        return "deleted successfully";
    }
}

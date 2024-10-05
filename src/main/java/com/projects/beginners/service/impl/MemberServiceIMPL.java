package com.projects.beginners.service.impl;

import com.projects.beginners.model.Member;
import com.projects.beginners.repository.MemberRepository;
import com.projects.beginners.service.MemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceIMPL implements MemberService {

    MemberRepository memberRepository;

    public MemberServiceIMPL(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public String addMember(Member member) {
        memberRepository.save(member);
        return "success";
    }

    @Override
    public String updateMember(Member member) {
        memberRepository.save(member);
        return "success";
    }

    @Override
    public String deleteMember(String id) {
        memberRepository.deleteById(id);
        return "success";
    }

    @Override
    public Member getMember(String id) {
        return memberRepository.findById(id).get();
    }

    @Override
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}

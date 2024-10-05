package com.projects.beginners.service;

import com.projects.beginners.model.Member;

import java.util.List;

public interface MemberService {
    String addMember(Member member);
    String updateMember(Member member);
    String deleteMember(String id);
    Member getMember(String id);
    List<Member> getAllMembers();
}

package com.example.demo.domain.member.member.service

import com.example.demo.domain.member.member.entity.Member
import com.example.demo.domain.member.member.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {
    fun count(): Long {
        return memberRepository.count()
    }

    fun save(username: String, password: String, name: String): Member {
        return memberRepository.save(Member(username, password, name))
    }
}
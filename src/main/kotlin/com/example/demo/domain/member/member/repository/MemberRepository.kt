package com.example.demo.domain.member.member.repository

import com.example.demo.domain.member.member.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long>
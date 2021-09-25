package com.example.BorderCollie.repository;

import com.example.BorderCollie.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.lang.reflect.Member;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    //JpaRepository<T, ID> : 사용될 Entity class인 T와 ID가 들어간다.
    //우리는 ID를 Long Id로 설정해주었다. 여기서 꺽쇠안에 들어가는 것은, 형식지정(정확히는 클래스지정)이라고 생각하면 좋을 것 같다.
    //이 JpaRepositiry는 기본적으로 save, findOne, findAll, count, delete를 제공한다.
    //이외의 것은, 직접 설정해야한다.
    //이때도 규칙이 존재한다.
    //메소드가 findBy 로 시작 : 쿼리를 요청하는 메소드
    //메소드가 countBy로 시작 : 쿼리 결과 레코드 수를 요청하는 메소드
//    Member findByName(String name);
//    Page<Member> findByName(String name, Pageable pageable);
}

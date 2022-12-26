package com.example.persistence;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.BoardVO;

public interface SampleQueryRepository extends CrudRepository<BoardVO, Integer> {

	// 제목검색
//	List<BoardVO> findBoardVOByTitle(String title);
	
	List<BoardVO> findBoardVOByTitleContainingOrderByTitleDesc(String title);
	//전체검색을 페이징
	List<BoardVO> findAll(Pageable paging);
}

/*
 * 조건 검색 								==> 쿼리메소드
 * where title=?1							findBoardVOByTitle()
 * where lastname=?1						findByLastname()
 * where lastname<>?1						finByLastnameNot()
 * where lastname=?1 and firstname=?2		findByLastnameAndFirstname()
 * where startDate between ?1 and ?2		findByStartDateBetween()
 * where age < ?1							findByAgeLessThan()
 * where age <= ?1
 * where age > ?1
 * where age >= ?1
 * where age is null						findByAgeIsNull()
 * where age is not null
 * where firstname like '%'||?||'%'			findByFirstnameContaining()
 * where age = ?1 order by lastname desc 	finddByAgeOrderByLastnameDesc()
 * 				
 */

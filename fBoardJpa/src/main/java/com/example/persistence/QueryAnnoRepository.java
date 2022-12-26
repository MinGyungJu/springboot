package com.example.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.BoardVO;

public interface QueryAnnoRepository extends CrudRepository<BoardVO, Integer> {

	//[1] JPQL (복잡한 쿼리)
	@Query("SELECT b FROM BoardVO b WHERE b.title LIKE %?1% ORDER BY b.seq DESC")
	List<BoardVO> queryAnnotation(String word);

	//[2] SQL (복잡한 쿼리)
	@Query(value="SELECT * FROM board where title Like '%'||?1||'%' order by seq desc", nativeQuery=true)
	List<BoardVO> queryAnnotation2(String word);

	//[3] SQL(복잡한 쿼리), board2테이블과 board_file 테이블, 리턴값에 BoardVO대신 HashMap이나 Object[] 이용
	@Query(value="SELECT b.seq as seq, b.title title, b.writer , b.regdate, b.cnt, bf.filepath FROM BOARD b "
			+ "full outer join BOARD_FILE bf ON b.title = bf.filename "
			+ "where b.title like '%'||?1||'%' order by b.seq desc", nativeQuery=true)
	List<Object[]> queryAnnotation3(String word);


}

package kr.co.gsti.repository.interfaces;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import kr.co.gsti.repository.entity.User;

@Mapper
public interface UserRepository {
	// 사용자 단일 조회
	public User findByUserIdAndCompanyCode(@Param("userId") String userId, @Param("companyCode") String companyCode);
	//	수정
	public String selectPassword(String email);
	public User selectUser(String email);
	public int insertUser(User user);
	public User selectUserEmail(String email);
	public User selectUserSns(String sns);
	
	public Map findByNameAndPhone(@Param("userName") String userName, @Param("phoneNumber") String phoneNumber);
	public int updatePassword(@Param("password") String passowrd, @Param("email") String email);
}
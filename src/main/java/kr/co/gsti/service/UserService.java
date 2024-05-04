package kr.co.gsti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.gsti.dto.UserDTO;
import kr.co.gsti.repository.entity.User;
import kr.co.gsti.repository.interfaces.UserRepository;

@Service
public class UserService {
  @Autowired
  UserRepository userRepository;

  public User login(UserDTO.LoginDTO loginDTO) {
    User user = userRepository.findByUserIdAndCompanyCode(loginDTO.getUserId(), loginDTO.getCompanyCode());
    return user;
  }
}

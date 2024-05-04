package kr.co.gsti.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UserDTO {
  @Data
  @AllArgsConstructor
  @NoArgsConstructor  
  public static class LoginDTO {
      private String companyCode;
      private String userId;
      private String userPw;      
  }
}

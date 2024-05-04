package kr.co.gsti.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import kr.co.gsti.dto.UserDTO;
import kr.co.gsti.repository.entity.User;
import kr.co.gsti.service.UserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
 
    private final HttpSession session;
    private final UserService userService;

    // @GetMapping("/")
    // public String login() {

    // }
    @PostMapping("login")
    public void login(UserDTO.LoginDTO loginDTO, Model model, HttpServletRequest request) {
      User principal = (User) session.getAttribute("principal");
      if (principal == null) {
        principal = userService.login(loginDTO);
        session.setAttribute("principal", principal);
        session.setMaxInactiveInterval(60*60); // 18.04.24 기본 세션유지시간 1시간
      }
      // return user;
    }
}

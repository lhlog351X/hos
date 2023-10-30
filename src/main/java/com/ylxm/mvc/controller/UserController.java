package com.ylxm.mvc.controller;

import com.ylxm.mvc.common.R;
import com.ylxm.mvc.common.RException;
import com.ylxm.mvc.entity.User;
import com.ylxm.mvc.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author lhlog351X
 * com.ylxm.mvc.controller
 * 2023/10/30 18:58
 */
@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public R<User> login(@RequestBody User user){
        User user1 = userService.login(user.getAccount());
        if (user1.getPassword().equals(user.getPassword())){
            return R.success("YES");
        }
        throw new RException("NO");
    }
}

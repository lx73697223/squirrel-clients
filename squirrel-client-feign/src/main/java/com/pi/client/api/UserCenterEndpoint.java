package com.pi.client.api;

import com.pi.usercenter.endpoint.intf.UserAccountClient;
import com.pi.usercenter.endpoint.vo.UserAccountVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserCenterEndpoint {

    @Autowired
    @Qualifier("userAccountClient")
    private UserAccountClient userAccountClient;

    @GetMapping("/userAccounts")
    public List<UserAccountVo> getAllUserAccounts() {
        List<UserAccountVo> userAccounts = userAccountClient.getAllUserAccounts();
        return userAccounts;
    }

}

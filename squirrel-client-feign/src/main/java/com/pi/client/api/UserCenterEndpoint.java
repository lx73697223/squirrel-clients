package com.pi.client.api;

import com.pi.usercenter.endpoint.intf.UserAccountClient;
import com.pi.usercenter.endpoint.vo.UserAccountVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class UserCenterEndpoint {

    @Autowired
    @Qualifier("userAccountClient")
    private UserAccountClient userAccountClient;

    @GetMapping("/userAccounts")
    public ResponseEntity<List<UserAccountVo>> getAllUserAccounts(@RequestParam("ids") Set<String> ids) {
        return userAccountClient.getUserAccounts(ids);
    }

}

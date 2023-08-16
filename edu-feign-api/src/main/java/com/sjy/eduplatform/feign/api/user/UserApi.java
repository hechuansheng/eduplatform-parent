package com.sjy.eduplatform.feign.api.user;

import com.sjy.eduplatform.feign.domain.user.UserBO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author : hechuansheng
 * @date : 2023/8/16 15:11
 * @since : version-1.0
 */
public interface UserApi {

    @GetMapping("/user/{id}")
    UserBO getById(@PathVariable("id") Integer id);

}

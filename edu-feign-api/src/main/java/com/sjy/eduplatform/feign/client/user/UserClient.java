package com.sjy.eduplatform.feign.client.user;

import com.sjy.eduplatform.feign.api.user.UserApi;
import com.sjy.eduplatform.feign.domain.user.UserBO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author : hechuansheng
 * @date : 2023/8/16 15:11
 * @since : version-1.0
 */
@FeignClient(value = "edu-user-service")
public interface UserClient extends UserApi {

    @GetMapping("/user/{id}}")
    UserBO getById(@PathVariable("id") Integer id);

}

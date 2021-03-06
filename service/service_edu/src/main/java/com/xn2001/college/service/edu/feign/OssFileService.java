package com.xn2001.college.service.edu.feign;

import com.xn2001.college.common.base.result.R;
import com.xn2001.college.service.edu.feign.fallBack.OssFileServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 乐心湖
 * @date 2020/7/3 23:38
 **/
@Service
@FeignClient(value = "service-oss",fallback = OssFileServiceFallBack.class)
public interface OssFileService {

    @DeleteMapping("/admin/oss/file/remove")
    R removeFile(@RequestBody String url);

}

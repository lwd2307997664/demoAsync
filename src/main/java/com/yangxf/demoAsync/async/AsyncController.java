/**
 * FileName: AsyncController
 * Author:   linwd
 * Date:     2021/3/12 17:45
 * Description: 调用控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yangxf.demoAsync.async;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈调用控制器〉
 *
 * @author linwd
 * @create 2021/3/12
 * @since 1.0.0
 */
@RestController
public class AsyncController {
    @Resource
    AsyncService asyncService;
    @GetMapping("/hello")
    public String hello(){
        asyncService.asyncHello();
        return "hello world";
    }
}

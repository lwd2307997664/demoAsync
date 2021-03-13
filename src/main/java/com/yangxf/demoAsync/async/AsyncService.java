/**
 * FileName: ddd
 * Author:   linwd
 * Date:     2021/3/12 17:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yangxf.demoAsync.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
    //异步调用
    @Async
    public void asyncHello(){
        System.out.println("处理数据开始...");
        try {
            //休眠几秒
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("处理数据中...");
    }
}

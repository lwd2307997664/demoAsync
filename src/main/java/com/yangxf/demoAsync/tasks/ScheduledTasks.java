/**
 * FileName: ScheduledTasks
 * Author:   linwd
 * Date:     2021/3/12 17:50
 * Description: 异步定时任务
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yangxf.demoAsync.tasks;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈异步定时任务〉
 *
 * @author linwd
 * @create 2021/3/12
 * @since 1.0.0
 */
@Component
public class ScheduledTasks {

    //    开启一个异步任务
    @Async
    @Scheduled(cron = "0/1 * * * * *")
    public void ScheduledAsync(){
        System.out.println("异步定时任务"+System.currentTimeMillis());
    }
}

package com.study.util.queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.*;

@Component
public class WriteQueue {

    private Logger logger = LoggerFactory.getLogger(WriteQueue.class);
    private BlockingQueue<Runnable> workQueue;//任务队列

    @Autowired
    private ThreadPoolTaskExecutor taskExecutor;

    public WriteQueue() {
        workQueue = new LinkedBlockingQueue<>();//构造无界的任务队列，资源足够，理论可以支持无线个任务
        /*es = new ThreadPoolExecutor(2, 4, //2 core； 4 max
                30, TimeUnit.SECONDS, workQueue, //30s keep alive
                new ThreadPoolExecutor.CallerRunsPolicy()); //任务失败重试*/
    }

    public void send(Runnable task) {
        logger.error("WriteQueue start writing files...");
        taskExecutor.execute(task);//将任务放入线程池
    }

    public void close() {// 关闭
        taskExecutor.shutdown();
    }
}

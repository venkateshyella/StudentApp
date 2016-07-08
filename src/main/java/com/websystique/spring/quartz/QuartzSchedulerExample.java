/**
 * 
 */
package com.websystique.spring.quartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author venkateshy
 *
 */
public class QuartzSchedulerExample
{
   public static void main(String[] args) throws Exception
    {
            
        JobDetail job = JobBuilder.newJob(HelloJob.class)
        .withIdentity("job1", "group1").build();
 
        Trigger trigger = TriggerBuilder
        .newTrigger()
        .withIdentity("trigger1", "group1")
        .withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))
        .build();
 
        //schedule it
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        Thread.sleep(90L * 1000L);   
        scheduler.scheduleJob(job, trigger);
 
    }
}
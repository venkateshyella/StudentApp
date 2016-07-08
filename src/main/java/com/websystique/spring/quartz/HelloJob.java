/**
 * 
 */
package com.websystique.spring.quartz;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author venkateshy
 *
 */
public class HelloJob implements Job
{
    public void execute(JobExecutionContext context) throws JobExecutionException 
    {
        System.out.println("Hello Job! - "+ new Date());
    }
}


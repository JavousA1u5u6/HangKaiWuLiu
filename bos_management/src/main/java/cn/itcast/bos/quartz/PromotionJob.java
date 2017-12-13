package cn.itcast.bos.quartz;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.bos.service.take_delivery.PromotionService;

/**
 * 定时设置宣传任务 状态
 * 
 * @author itcast
 *
 */
public class PromotionJob implements Job {
	@Autowired
	private PromotionService promotionService;

	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		System.out.println("活动过期处理程序执行....");
		// 每分钟执行一次，当前时间 大于 promotion数据表 endDate， 活动已经过期，设置status='2'
		promotionService.updateStatus(new Date());
	}

}

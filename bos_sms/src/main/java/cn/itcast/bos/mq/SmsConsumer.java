package cn.itcast.bos.mq;

import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.springframework.stereotype.Service;

@Service("smsConsumer")
public class SmsConsumer implements MessageListener {

	@Override
	public void onMessage(Message message) {
		MapMessage mapMessage = (MapMessage) message;

		// 调用SMS服务发送短信
		try {
			// String result =
			// SmsUtils.sendSmsByHTTP(mapMessage.getString("telephone"),
			// mapMessage.getString("msg"));
			String result = "000/xxxx";
			if (result.startsWith("000")) {
				// 发送成功
				System.out.println(
						"发送短信成功,手机号：" + mapMessage.getString("telephone") + 
						"，短信内容：" + mapMessage.getString("msg"));
			} else {
				// 发送失败
				throw new RuntimeException("短信发送失败, 短信内容：" + result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

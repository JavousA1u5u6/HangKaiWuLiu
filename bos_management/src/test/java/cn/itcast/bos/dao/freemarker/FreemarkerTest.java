package cn.itcast.bos.dao.freemarker;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FreemarkerTest {
	@Test
	public void testOutput() throws IOException, TemplateException {
		// 配置对象， 配置模板位置
		Configuration configuration = new Configuration(
				Configuration.VERSION_2_3_22);
		configuration.setDirectoryForTemplateLoading(new File(
				"src/main/webapp/WEB-INF/templates"));

		// 获取模板对象
		Template template = configuration.getTemplate("hello.ftl");

		// 动态数据对象
		Map<String, Object> paramterMap = new HashMap<String, Object>();
		paramterMap.put("title", "黑马程序员");
		paramterMap.put("msg", "你好，这是第一个Freemarker案例！");

		// 合并输出
		template.process(paramterMap, new PrintWriter(System.out));
	}
}

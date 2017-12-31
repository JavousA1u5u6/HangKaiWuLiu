# 一、 航凯物流管理平台  整体概述#

## 1.项目背景 ##

	本项目是由多个项目小组,一起进行开发开发周期 1 年左右（编码 4 个月），开发工程师 20
	多人（每 4-5 人 组成一个小组，负责一个业务块）
	BOS 后台管理系统，分为七个部分 ：
	1、 基础设置 （物流业务管理 元数据 ）： 取派标准、取派时间管理、车辆管理、快
	递员管理、区域管理 …
	2、 取派： 下单管理、取件管理、配送管理 …
	3、 中转： 货物运输过程中，中转点 出入库操作 …
	4、 路由： 运输线路、运输交通工具 …
	5、 PDA ： 快递员无线通讯设备 通讯功能 …
	、 财务 ：快递费用处理
	7、 管理报表需求： 针对物流业务数据，产生报表

## 2.项目种类介绍 ##
OA、CRM、ERP 都是基于 MIS（信息管理）系统
BOS  Business Operating System 业务操作系统 (核心)


## 3.项目开发流程 ##	

--瀑布流开发模型

软件的开发流程:需求调研分析 设计(概要设计,详细设计) 编码 测试 实施与运维

个人主要职责:基础信息模块,权限管理模块等具体业务

## 4.项目整体架构和技术 ##

- 后台页面【新 待开发】
    - [ANT DESIGN PRO](https://pro.ant.design/index-cn)：蚂蚁金服开箱即用中台前端
    - React + dva + G2 + ANTD + ES2015+

- 后台页面【旧】
    - 感谢 [H-ui](http://www.h-ui.net/)、[FlatLab](https://github.com/Exrick/xmall/blob/master/study/FlatLab.md) 提供静态页面支持
    - [Ztree](http://www.treejs.cn/v3/main.php#_zTreeInfo)：jQuery树插件
    - [DataTables](http://www.datatables.club/)：jQuery表格插件
    - [Distpicker](https://github.com/fengyuanchen/distpicker)：中国省市区地址三级联动插件
    - [KindEditor](https://github.com/kindsoft/kindeditor)：富文本编辑器 简洁方便 没UEditor那么多坑
    - [百度地图开放平台](http://lbsyun.baidu.com/index.php?title=%E9%A6%96%E9%A1%B5)：百度地图,很强发,很好用.
    - 

Server 端架构： Struts2+ Spring + Spring Data(简化持久层) + JPA 接口+ Hibernate（JPA 显现）
后台管理系统 页面架构 ：jQuery Easyui 框架
前端互联网系统 页面架构 ：BootStrap 响应式 + AngularJS
Excel 解析、生成： POI 技术
远程调用： 基于 Restful 风格 CXF 编程
第三方短信平台、邮件平台 使用
Redis 缓存使用 、ActiveMQ 消息队列
搜索服务器 ElasticSearch 安装配送使用 ， Spring Data 操作 ElasticSearch 服务器
定时调度框架： Quartz
在线 HTML 编辑器： kindEditor 使用
权限管理框架： Apache Shiro

	- 其它开发工具
    - [阿里JAVA开发规约插件](https://github.com/alibaba/p3c)

### 文件说明
- `dependency` 文件夹提供部分依赖与sql文件
    - xmall.sql：数据库文件
    - dubbo.xsd：需手动配置避免报错
    - redis-3.0.0.gem：Redis集群搭建所需Ruby库
- `generatorSqlmapCustom` 文件夹为 [Mybatis Generator](http://www.mybatis.org/generator/) 逆向生成工具，且已配置好maven插件


### 技术疑问交流
- 给作者项目Star或捐赠后可加入交流群 `89812637`
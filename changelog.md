## API设计
1.REST API
    协议：https
    专有域名：https://example.org/api/
    将本API版本加入URL:https://example.org/api/v1/
    路径：在RESTful架构中，每个网址代表一种资源（resource），所以网址中不能有动词，只能有名词，而且所用的名词往往与数据库的表格名对应
    HTTP动词：GET（SELECT）：从服务器取出资源（一项或多项）。
           POST（CREATE）：在服务器新建一个资源。
           PUT（UPDATE）：在服务器更新资源（客户端提供改变后的完整资源）。
           PATCH（UPDATE）：在服务器更新资源（客户端提供改变的属性）。
           DELETE（DELETE）：从服务器删除资源。
    信息过滤：？id=100001
    错误出路：返回{error:"exception"}
    如果要实现内部交易重要操作时重新验证交易密码



**20150602**

* 第一版界面、功能、架构图
* 基础代码框架搭建

**20150603**

* 数据库结构设计

**20150604**

* 代码框架搭建
* mybatis generator生成代码
* 完成spring-mvc整合
* 计划任务整合

**20150605**
* spring mvc定义转换器错误
* 日志输出
* service
* 事务测试
* druid配置
jrebel集成


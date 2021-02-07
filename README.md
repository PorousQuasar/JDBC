# 2021/02/08 - 2021/02/10 任务安排
搞定开发环境的搭建，包括但不限于：

​		掌握如何使用自己的ide创建web项目并编写代码；

​		安装好git并掌握其用法；

​		安装部署好sql服务器，掌握增删改查等基本sql语句用法；

​		安装部署好tomcat服务，掌握如何通过tomcat部署web项目(当然SpringBoot也可以)；

搞定jdbc，实现在java中对数据库进行增删改查及对查询所得数据进行封装的操作；

## 要求完成该程序

要求将代码拉到本地，完成`com.qinli.puzzle02.util.JDBCUtil.getConnection()`方法和`com.qinli.puzzle02.dao.StudentDao.selectAll()`方法，实现运行`main()`方法将数据库内容打印到控制台。

注意：

​	**不允许修改其他方法**(其他方法出错了联系我，我改好重新传)；

​	须自行寻找合适的数据库驱动等jar包并存到合适的目录下；

​	数据库文件为`/database/student.idb`，文字编码为UTF-8。请自行导入自己的数据库。	

期望结果格式:

```java
Student{id='1903060221', name='高尧', gender=男, age=20}
Student{id='1903060221', name='高尧', gender=男, age=20}
Student{id='1903060221', name='高尧', gender=男, age=20}
Student{id='1903060221', name='高尧', gender=男, age=20}
Student{id='1903060221', name='高尧', gender=男, age=20}
Student{id='1903060221', name='高尧', gender=男, age=20}
Student{id='1903060221', name='高尧', gender=男, age=20}
Student{id='1903060221', name='高尧', gender=男, age=20}
Student{id='1903060221', name='高尧', gender=男, age=20}
```

完成后对我发起pull request，或者上传至自己的仓库中。*记得备注一下自己姓名啊。*

**截止至2021/02/11 04:00 a.m.**

**以git页面显示的提交时间为准**


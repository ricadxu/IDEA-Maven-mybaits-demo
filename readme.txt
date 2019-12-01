建立一个数据库 db
create database db;
需要首先建立一个表,表要带id，还有name.
然后使用工具，给ID 1注入数据。
CREATE TABLE `websites` (
  `id` tinyint(2) NOT NULL,
  `name` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
插入数据
INSERT INTO websites  values (1,'lisi');

参考的例子，网站  https://juejin.im/post/5b0f71e96fb9a00a031dfec1
具体的更加详细解释网站   c语言中文网 http://c.biancheng.net/view/4302.html

1 使用marven 的webapp 建立一个简单的项目。maven-archetype-webapp 模板
2 然后，在pom.xml文件中，添加需要的依赖，mybaties ,还有mysql 的连接依赖。具体见pom.xml
3 在main文件夹下面，建立java文件夹，还有resource 文件夹。
   注意要将文件夹设置好。 resouce 文件夹设置为Rescource Root java文件夹要设置为Source Root
   不过IDEA，会有提示，安装提示的建立就不用设置了。IDEA 2019.3版本
4 java文件夹主要放java代码用，resources 放xml文件用的。
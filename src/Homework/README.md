# homework

#### 2020-03-15

1、使用Reactor多线程模型，实现一个聊天程序，要求能够处理单聊请求和群聊请求。最低要求：使用java的基本数据结构存储上线用户的信息。有条件，有额外能力，可以使用redis、mysql等存储用户信息。

2、测试多Reactor服务的相关性能。方法：通过多线程并发调用一个多Reactor服务，来观察响应时间。在线程数量上，逐次递增。最后达到你的Reactor无法正常响应，终止实验。将上述代码，和测试数据形成文档。

3、两道leetcode题。标清题号


注：本次所有作业，全部提交到gitee。

#### 2020-03-22
1、使用maven新建一个project，推送到自己的git仓库。

2、探究netty httpServer为何在readcomplete会触发两次

3、完成一个简单的rpc模拟调用流程，要求，client、server均使用netty,并且，server注册的地址可以存在内存的某一个结构中。比如map中（可以两端copy同一份map数据），或在文件中。

4、两道leetcode


#### 2020-03-29
1、自己手写一个jdbc连接池，并且使用连接池，对数据库进行多线程操作（注意线程安全）。并且在同等条件下比较连接池和直接获取连接的数据库操作的时间差距，形成文档。

2、写一个demo，分别使用hikariCP、durid对数据库进行操作（建议大家使用java单元测试来进行相关操作）。

3、在单测中使用lettuce操作redis数据库，并且分别创建和使用五种不同的数据结构，要求有相关使用api的注释，必须包括每种数据结构的增删改查。

4、优化聊天程序，将相应加入聊天的nio socketChannel存入redis当中，使得当再有相关加入者时能够从redis当中获取对应用户的channel，并进行通信。并且使用连接池，操作mysql（mariaDB）将聊天记录保存到数据库，觉得Nio操作麻烦的同学，可以使用Netty搭建一个新体系。

5、两道leetcode
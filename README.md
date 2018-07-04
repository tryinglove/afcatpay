####pay-share
    公共方法：aop exception servieName vo
####pay-Dal
    数据库访问
####pay-mq
    mq
####pay-sercurity
    用户登录，用户权限，可以单独拿出来做
####pay-server
    服务端，提供业务服务
####pay-web
    web
    
   1.如果有视频或者图片等文件需要存储，需要使用HDFS或者FastDFS。
   2.在shiro集成之后会有session共享以及失效转移问题。shiro有提供存放session到redis的API，但是可能无法解决失效转移的问题。推荐
   自己设计策略，存session到redis，同时通过redis自带的数据失效时间也可以解决session超时问题。
   3.如果有遇到高并发的情况，可以使用消息队列减轻系统压力，推荐kafka，同时也可以达到解耦的作用。数据库如果读多写少。可以做读写分离，
    mysql有读写分离的代理客户端。配置主从库的时候，要确认偏移量。
   4.关于分布式锁和分布式事务的问题可以了解一下强一致性与最终一致性，更多的还是偏向业务进行选择。
   5.项目部署问题,目前采用的是maven+bat脚本，比较麻烦，可以使用springBoot+shell脚本或者py脚本进行优化，减少部署的复杂性。
# cola4.0开发流程

## 项目的结构

![image-20210624094818152](https://gitee.com/mxchen-team/figure-bed/raw/master/images/image-20210624094818152.png)

### demo-client:

api：存放的是对外暴露的接口
dto.domainmodel：用来做数据传输的轻量级领域对象。
to.domainevent: 用来做数据传输的领域事件。

### demo-app:

service：接口实现的facade，没有业务逻辑，可以包含对不同终端的adapter。
eventhandler：处理领域事件，包括本域的和外域的。
executor：用来处理命令（Command）和查询（Query），对复杂业务，可以包含Phase和Step。
interceptor: COLA提供的对所有请求的AOP处理机制。
validator：用来对传入的命令进行参数校验。

### demo-domain:

domain：领域实体。
domainservice: 领域服务，用来提供更粗粒度的领域能力。
gateway：对外依赖的网关接口，包括存储、RPC、Search等，可以认为是对infrastructure的依赖反转。

### demo-infrastructure:

config：配置信息相关
message：消息处理相关。
repository：存储相关，是gateway的特化，主要用来做本域的数据CRUD操作。
gateway：对外依赖的网关接口（demo-domain里的gateway）的实现。

### COLA中关于命名的规范

## 如何基于COLA架构实现一个CRUD

在COLA中，比如我们想创建一个User，一套完整的调用链大概如下图所示：

![COLA调用链](https://imgconvert.csdnimg.cn/aHR0cHM6Ly9ub3RlLnlvdWRhby5jb20veXdzL3B1YmxpYy9yZXNvdXJjZS9hMzg5YzJmYmUwYjYzYTRhZGFkOTU2OTIxODkxYTExMS94bWxub3RlLzE0MUMxRDY4NTJFNjQ0MDFBRkZFQjZFMjgwRDU3REUzLzQwNjQ?x-oss-process=image/format,png)

以上是一个经过简化版的调用链，实际的调用链还要更复杂，调用过程中可能还包含了多个不同的**扩展点（Extension）**。

## 扩展点



## 参考资料

- [COLA开发流程总结](https://blog.csdn.net/TheRainManFSA/article/details/106946534)
- [COLA发起者的博客](https://blog.csdn.net/significantfrank/article/details/85785565)
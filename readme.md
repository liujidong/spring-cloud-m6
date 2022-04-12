### 主要由6个微服务组成

| 6个微服务  |  |
|---| --- |
|UI|monitor|
|Person|Some|
|config|
|discovery|

**config:配置服务**：config
**discovery:服务发现**：consul
**UI:路由网关**：Zuul
**UI:负载均衡**：Ribbon/Feign
**UI:断路器**：Circuit Breaker

#### 设置
File->Project Structure->Project Setting->Modules->Source->Language Level=8

1.spring-cloud-starter-parent由Angel.SR3升级到Greenwich.SR6
2.eureka更换为consul
	https://www.consul.io/downloads.html

hsql?
webjars?
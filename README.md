# probe-agent
 Java Application ProbeService Demo By using Java Agent
 
## detail
This project contains two parts, one is agent directory, the other is main application.

the main application has a service which named is `ProbeService`, and the agent aims to
instrument this service and change the ability.

The Agent part contains `premain class` and a interceptor, which will instrument the probe
service by using bytebuddy.
 
 
 ## package
you should update pom.xml, and package main.jar and agent.jar by exec following command, 
```shell
mvn clean package -Dmaven.test.skip=true
```

## run
```shell
java -javaagent:agent.jar -jar main.jar
```

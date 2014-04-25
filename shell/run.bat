@echo off
echo hello

java -Djava.ext.dirs=D:\jboss-4.2.3.sdk\server\default\deploy\AxisDemo.war\WEB-INF\lib cn.com.Demo sss sss

set CLASSPATH=WebContent\WEB-INF\lib\*;build\classes
java com.axis.demo.client.Test 2
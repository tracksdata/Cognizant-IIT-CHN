@echo on

SET ANT_HOME=D:\CampusForce\Tools\apache-ant-1.7.1
SET BUILD="D:\WithAllDefects\WithAllDefects\bin"
SET JAVA_HOME="C:\Program Files\Java\jdk1.6.0_21"

SET classpath=%classpath%;%JAVA_HOME%\lib\tools.jar;%JAVA_HOME%\lib\dt.jar;
SET PATH = %PATH%;%JAVA_HOME%\bin;%ANT_HOME%\bin;

%ANT_HOME%\bin\ant -buildfile %BUILD%\build.xml %1
 
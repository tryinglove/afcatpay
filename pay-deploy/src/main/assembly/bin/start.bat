@echo off & setlocal enabledelayedexpansion

set LIB_JARS=""
cd ..\lib
for %%i in (*) do set LIB_JARS=!LIB_JARS!;..\lib\%%i
cd ..\bin

if ""%1"" == ""debug"" goto debug

java -Xms128m -Xmx1024m -XX:MaxPermSize=64M  -classpath ..\conf;%LIB_JARS% com.afcat.server.dubbo.Main
goto end

:debug
java -Xms128m -Xmx1024m -XX:MaxPermSize=64M -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=8000,server=y,suspend=n -classpath ..\conf;%LIB_JARS% com.afcat.server.dubbo.Main
goto end

:end
pause
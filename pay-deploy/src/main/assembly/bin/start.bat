@echo off & setlocal enabledelayedexpansion

set LIB_JARS=""
cd ..\lib
for %%i in (*) do set LIB_JARS=!LIB_JARS!;..\lib\%%i
cd ..\bin

java -Xms128m -Xmx1024m -XX:MaxPermSize=64M  -classpath ..\conf;%LIB_JARS% com.afcat.server.dubbo.Main
goto end

:end
pause
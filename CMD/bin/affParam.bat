@echo off
echo Version sans shift

echo %*

echo Version avec shift

:encore
if "%1"=="" goto fin
echo %1
shift /1
goto encore

:fin
@echo off
if "%1"=="" goto err

echo le parametre est : %1
goto fin

:err
REM echo Entrer un parametre
set /p param=Entrer un parametre :
call param1.bat %param%

:fin
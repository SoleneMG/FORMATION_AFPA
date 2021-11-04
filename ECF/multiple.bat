@echo off

set i=0

:loop
if "%i% EQU 10" ( goto end )
set /a number=i %%3
if %number%==0 ( echo %i%)

set /a i=%i%+1

goto loop

:end 
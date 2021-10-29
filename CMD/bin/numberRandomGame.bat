@echo off

echo "---------------- Welcome on the mystery number game ! ----------------"
echo.

:restart
set "yes"="yes"
set /a numberRandom=%random% %%100
set numberOfAttempt=1
set maxOfAttempt=5
set attemptLeft=5

echo %numberRandom%

:start
set /p number="Enter a number :  "

if %numberOfAttempt%==%maxOfAttempt% goto retry
if %number% LSS %numberRandom% goto lesser
if %number% GTR %numberRandom% goto greater

if %numberOfAttempt%==1 (
echo Congratulation you have found the number in %numberOfAttempt% attempt
) else (
echo Congratulation you have found the number in %numberOfAttempt% attempts
)
goto end

:equality
goto end

:lesser
set /a numberOfAttempt=%numberOfAttempt%+1
set /a attemptLeft=%attemptLeft%-1
echo Too low
echo You have only %attemptLeft% moves left
goto start

:greater
set /a numberOfAttempt=%numberOfAttempt%+1
set /a attemptLeft=%attemptLeft%-1
echo Too high
echo You have only %attemptLeft% moves left
goto start

:retry
echo.
echo Sorry %numberRandom% was the mystery number
goto end

:end 
set /p again="Do you want retry (yes or no) :    "
if "%again%"==%yes% (
goto restart 
) else (
echo Goodbye !
)


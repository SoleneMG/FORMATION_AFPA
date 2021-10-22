@echo off

if not "%1"=="bond" (
goto wrongParam1
) else ( 
if not "%2"=="007" (
echo Le premier paramètre est bien Bond mais le second devrait être 007 !
goto fin
)
)

echo Bonjour Mister Bond !
goto fin

:wrongParam1

if not "%2"=="007" (
echo Le premier paramètre devrait être Bond et le second 007
goto fin
) else (
echo Le premier paramètre devrait être Bond mais le second est bien 007 !

)

:fin
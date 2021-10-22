@echo off
set /a nombreAleatoire=((%random% * 9)/32768)+1
::set nombreAleatoire=5
set nombreEssai=0
set regex=^[0-9]$

echo Trouve un chiffre entre 1 et 9 :

:searchAgain
set /p nb=
if not %nb%=%regex% ( goto err)


if %nb%==%nombreAleatoire% (
set /a nombreEssai=%nombreEssai%+1
goto success
)

if %nb% lss %nombreAleatoire% (
set /a nombreEssai=%nombreEssai%+1
echo Trop bas !
goto searchAgain
)

if %nb% gtr %nombreAleatoire% (
set /a nombreEssai=%nombreEssai%+1
echo Trop haut !
goto searchAgain
)

:success
echo Gagne en %nombreEssai% coups !

:err
echo On a dit trouve un chiffre !
goto searchAgain


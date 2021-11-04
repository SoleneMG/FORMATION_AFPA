@echo off

echo Cherche et affiche le maximum de 4 valeurs

echo Entrez 4 chiffres :
set /p valeur1="1er chiffre : "
set /p valeur2="2nd chiffre : "
set /p valeur3="3eme chiffre : "
set /p valeur4="4eme chiffre : "

if %valeur1% GTR %valeur2% ( set /a numberMax1=%valeur1% ) else ( set /a numberMax1=%valeur2% )
if %valeur3% GTR %valeur4% ( set /a numberMax2=%valeur3% ) else ( set /a numberMax2=%valeur4% )
if %numberMax1% GTR %numberMax2% (set /a numberMax=%numberMax1%) else ( set /a numberMax=%numberMax2%)

if %valeur1% LSS %valeur2% ( set /a numberMin1=%valeur1% ) else ( set /a numberMin1=%valeur2% )
if %valeur3% LSS %valeur4% ( set /a numberMin2=%valeur3% ) else ( set /a numberMin2=%valeur4% )
if %numberMin1% LSS %numberMin2% (set /a numberMin=%numberMin1%) else ( set /a numberMin=%numberMin2%)

echo Le nombre maximum est %numberMax% et le nombre minimum est %numberMin%
pause




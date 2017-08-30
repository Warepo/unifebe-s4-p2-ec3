@echo off
title Building project!

cd .\src
mkdir ..\build
touch ./@sources
dir /s /B *.java > @sources
javac @sources -d ../build
rm ./@sources
cd ..
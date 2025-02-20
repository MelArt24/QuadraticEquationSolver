@echo off
if "%1"=="" (
    kotlinc Main.kt -include-runtime -d Main.jar
    java -jar Main.jar
) else (
    kotlinc Main.kt -include-runtime -d Main.jar
    java -jar Main.jar %1
)

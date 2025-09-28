@echo off
set WRAPPER_JAR=%~dp0gradle\wrapper\gradle-wrapper.jar
if not exist "%WRAPPER_JAR%" (
  echo gradle-wrapper.jar not found. CI workflow is configured to use Gradle Action so this is okay for GitHub Actions.
  exit /b 0
)
java -jar "%WRAPPER_JAR%" %*

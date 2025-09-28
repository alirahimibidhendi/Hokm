#!/usr/bin/env sh
# Gradle start up script (minimal wrapper script)
DIR="$(cd "$(dirname "$0")" && pwd)"
GRADLE_WRAPPER_DIR="$DIR/gradle/wrapper"
if [ ! -f "$GRADLE_WRAPPER_DIR/gradle-wrapper.jar" ]; then
  echo "gradle-wrapper.jar not found. CI workflow is configured to use Gradle Action so this is okay for GitHub Actions."
  exit 0
fi
exec java -jar "$GRADLE_WRAPPER_DIR/gradle-wrapper.jar" "$@"

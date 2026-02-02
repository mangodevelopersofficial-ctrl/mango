#!/usr/bin/env bash

# This is a wrapper script for the Gradle binary.
# It allows building the project without having Gradle installed.

APP_NAME="Gradle"
APP_BASE_NAME=$(basename "$0")

# Add default JVM options here.
DEFAULT_JVM_OPTS='"-Xmx64m" "-Xms64m"'

exec "$@"

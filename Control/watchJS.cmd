@echo off
REM This is a simple helper script used to start the webpack watch process
REM so that javascript files can be automatically reloaded when they are saved.
REM The version of node must match what's in gradle.
REM %~dp0%NODE_LOC% %~dp0%WEBPACK_LOC% --watch & %~dp0%NODE_LOC% & ...

SET NODE_VERSION=6.9.4
SET NODE_LOC=.gradle\nodejs\node-v%NODE_VERSION%-windows-x64\bin\node
SET WEBPACK_LOC=node_modules\webpack\bin\webpack.js
SET WEBPACK_DEV_LOC=node_modules\webpack-dev-server\bin\webpack-dev-server.js

%~dp0%NODE_LOC% %~dp0%WEBPACK_DEV_LOC% --progress --colors --inline --port 8081 & %~dp0%NODE_LOC% %~dp0%WEBPACK_LOC% --watch & %~dp0%NODE_LOC%

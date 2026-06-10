#!/bin/bash

echo "========== STEP 1: Starting deployment =========="

# STEP 2
echo "========== STEP 2: Moving to working directory =========="
cd /d/Devops/Server1 || exit

# STEP 3
echo "========== STEP 3: Unzipping e-commers-main.zip =========="
unzip -o e-commers-main.zip

# STEP 4
echo "========== STEP 4: Moving into project directory =========="
cd e-commers-main || exit

# STEP 5
echo "========== STEP 5: Initializing Git =========="
git init
git branch -M main

# STEP 6
echo "========== STEP 6: Setting Git remote =========="
git remote remove origin 2> /dev/null
git remote add origin https://github.com/LikhitVarma96/Devops_Test01.git

# STEP 7
echo "========== STEP 7: Pulling latest code =========="
git pull origin devops-pipeline

# STEP 8
echo "========== STEP 8: Building application =========="
./mvnw.cmd clean package -DskipTests

# STEP 9
echo "========== STEP 9: Stopping old application =========="
taskkill //F //IM java.exe 2>nul

# STEP 10
echo "========== STEP 10: Starting application =========="
java --add-opens java.base/java.lang=ALL-UNNAMED \
     --add-opens java.base/java.io=ALL-UNNAMED \
     -jar target/*.jar

echo "========== STEP 11: Deployment completed ✅ =========="

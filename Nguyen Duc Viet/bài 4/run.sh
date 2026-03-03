#!/bin/bash

SRC_DIR="src"

BIN_DIR="bin"

mkdir -p $BIN_DIR

javac -d $BIN_DIR $(find $SRC_DIR -name "Solution.java")

if [ $? -eq 0 ]; then
    echo "Compile thành công."

    java -cp $BIN_DIR Solution
else
    echo "Compile thất bại."
fi
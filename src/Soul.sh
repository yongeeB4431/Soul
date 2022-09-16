#!/bin/bash

javac -cp '.:../JARS/org.json-20130603.jar' Data.java
javac Colors.java
javac -cp '.:../JARS/org.json-20130603.jar' Files.java
clear
java -cp '.:../JARS/org.json-20130603.jar' Main.java



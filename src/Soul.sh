#!/bin/bash

javac -cp '.:../JARS/org.json-20130603.jar' Data.java
javac -cp '.:../JARS/org.json-20130603.jar' Files.java
java -cp '.:../JARS/org.json-20130603.jar' Main.java

chmod +x Soul.sh


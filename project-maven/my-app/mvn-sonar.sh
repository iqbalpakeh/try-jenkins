#!/bin/sh

mvn clean

mvn test

mvn sonar:sonar -Dsonar.host.url=http://localhost:9000  -Dsonar.login=352f531a57190c0eb6d8c0d3d15bd525edbff584
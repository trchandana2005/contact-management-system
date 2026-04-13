FROM tomcat:9.0
COPY target/payment-app.war /usr/local/tomcat/webapps/

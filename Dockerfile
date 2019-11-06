FROM open-liberty:19.0.0.9-webProfile8-java8-ibm
COPY --chown=1001:0  target/openshift1.war /config/dropins/


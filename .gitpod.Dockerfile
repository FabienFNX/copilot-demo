FROM gitpod/workspace-full

USER gitpod

RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && \
    sdk install java 17.0.10-amzn && \
    sdk default java 17.0.10-amzn"

RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && \
    sdk install maven 3.8.8 && \
    sdk default maven 3.8.8"
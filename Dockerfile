FROM ubuntu:latest
LABEL authors="chacha"

ENTRYPOINT ["top", "-b"]
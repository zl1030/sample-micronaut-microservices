## Quick Guide to Microservices with Micronaut Framework [![Twitter](https://img.shields.io/twitter/follow/piotr_minkowski.svg?style=social&logo=twitter&label=Follow%20Me)](https://twitter.com/piotr_minkowski)

[![CircleCI](https://circleci.com/gh/piomin/sample-micronaut-microservices.svg?style=svg)](https://circleci.com/gh/piomin/sample-micronaut-microservices)

[![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-black.svg)](https://sonarcloud.io/dashboard?id=piomin_sample-micronaut-microservices)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=piomin_sample-micronaut-microservices&metric=bugs)](https://sonarcloud.io/dashboard?id=piomin_sample-micronaut-microservices)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=piomin_sample-micronaut-microservices&metric=coverage)](https://sonarcloud.io/dashboard?id=piomin_sample-micronaut-microservices)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=piomin_sample-micronaut-microservices&metric=ncloc)](https://sonarcloud.io/dashboard?id=piomin_sample-micronaut-microservices)

1. Detailed description can be found here: [Quick Guide to Microservices with Micronaut Framework](https://piotrminkowski.com/2019/01/25/quick-guide-to-microservices-with-micronaut-framework/)

2. Detailed description can be found here: [Microservices with Micronaut, KrakenD and Consul](https://piotrminkowski.com/2021/02/23/microservices-with-micronaut-krakend-and-consul/)


依赖服务部署命令:
```bash
docker run -d --name=zipkin -p 9411:9411 openzipkin/zipkin
docker run -d --name=consul -p 8500:8500 -p 8600:8600/udp consul
docker run -d --name=krakend -p 8080:8080 -v $PWD:/etc/krakend/ devopsfaith/krakend run --config /etc/krakend/krakend.json
```
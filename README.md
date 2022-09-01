# OpenTelemetry-Quarkus-Java-Impl
Opentelementry Implementation using Quarkus(Java) and export into Jaeger(Distributed Tracing)

## Prerequisites:

<li>
JDK
</li>
<li>
Apache Maven
</li>
<li>
Docker and Docker Compose
</li>

## POC:
<li>
Configure Quarkus workload with Opentelemetry plugin (Refer, pom.xml and application.properties)
</li>
<li>
Export trace to Distributed tracing (Jaeger)
</li>

## Download the sample source code
```
git clone https://github.com/mosesalphonse/OpenTelemetry-Quarkus-Java-Impl.git

cd OpenTelemetry-Quarkus-Java-Impl

```

## Configure the OpenTelemetry Collector

```
cd docker-compose

docker-compose up

```

## Run the workload
(Open new terminal, as the previous command runs on interactive mode, get into the base directory)
```
mvn quarkus:dev

```

## verify (generate some traffic)
(Open new terminal, as the previous commands runs on interactive modes)
```
curl http://localhost:8080/hello

curl http://localhost:8080/hello/chain

```
Note: you may observe workload traces can be exported to Jaeger

## Access Jaeger UI 

open browser and access the below URL

http://localhost:16686

You can view the traces.

# InstrumentationTests
Testing Auto-Instrumentation of custom methods with OpenTelemetryJavaAgent

# *NOTE* the pom.xml will build this, however maven exec will NOT work. Currently working on current Pom.xml issue.

Smart Agent must be configured for Jaeger gRPC: 

https://docs.signalfx.com/en/latest/integrations/agent/monitors/jaeger-grpc.html

Verified to work with Java 8

Startup arguments as folows ( change locations to .jar files below as appropriate );

-javaagent:./opentelemetry-auto-0.2.2.jar
-Dota.exporter.jar=./opentelemetry-auto-exporters-jaeger-0.2.2.jar  
-Dota.exporter.jaeger.endpoint=192.168.255.154:14250
-Dota.exporter.jaeger.service.name=TestOpenTelemetry
-Dota.trace.methods=agents.tests.OpenTelemetryTestApm[total,start,countIt]

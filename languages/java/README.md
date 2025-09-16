# Noesis Protocol - Java

Generated Java classes for the Noesis Protocol Buffer definitions.

## Installation

### Maven

```xml
<dependency>
    <groupId>io.datapower</groupId>
    <artifactId>noesis-protocol</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Gradle

```gradle
implementation 'io.datapower:noesis-protocol:1.0.0'
```

## Usage

```java
import io.datapower.noesis.v1.ExtractionEvent;
import io.datapower.noesis.v1.StartExtraction;

// Use the generated types
ExtractionEvent event = ExtractionEvent.newBuilder()
    .setStart(StartExtraction.newBuilder()
        .setSessionId("session-123")
        .setTable("users")
        .build())
    .build();
```

## Package Structure

- `io.datapower.noesis.v1` - All protocol definitions under the unified v1 package

## Services

- `RawDataService` - Access to RAW zone data
- `EnrichmentService` - Business logic enrichment
- `FlinkEnrichmentService` - Flink-specific enrichment
- `FlinkRawDataService` - Flink-specific raw data access
- `Connector` - Standard connector interface

## Publishing

This artifact is published to:
- GitHub Packages: `https://maven.pkg.github.com/data-power-io/noesis-protocol`
- Maven Central: `https://central.sonatype.com/`
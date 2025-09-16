# Migration Guide

This guide helps you migrate existing projects to use the centralized `noesis-protocol` repository.

## Overview

The migration involves:
1. **Removing local proto files** from your projects
2. **Adding dependency** on the new `noesis-protocol` artifacts
3. **Updating imports** to use the new package structure
4. **Updating code** to use the unified `datapower.noesis.v1` package

## 🔄 Go Projects Migration

### 1. Update `noesis/go.mod`

**Before:**
```go
module github.com/data-power-io/noesis

go 1.24.0

require (
    // ... other dependencies
)
```

**After:**
```go
module github.com/data-power-io/noesis

go 1.24.0

require (
    github.com/data-power-io/noesis-protocol/languages/go v1.0.0
    // ... other dependencies
)
```

### 2. Update imports in Go files

**Before:**
```go
import "github.com/noesis/internal/models/pb"
```

**After:**
```go
import noesisv1 "github.com/data-power-io/noesis-protocol/languages/go/datapower/noesis/v1"
```

### 3. Update usage in Go code

**Before:**
```go
event := &pb.ExtractionEvent{
    Event: &pb.ExtractionEvent_Start{
        Start: &pb.StartExtraction{
            SessionId: "session-123",
            Table:     "users",
        },
    },
}
```

**After:**
```go
event := &noesisv1.ExtractionEvent{
    Event: &noesisv1.ExtractionEvent_Start{
        Start: &noesisv1.StartExtraction{
            SessionId: "session-123",
            Table:     "users",
        },
    },
}
```

### 4. Update `noesis-connectors/sdks/go/go.mod`

**Before:**
```go
module github.com/data-power-io/noesis-connectors/sdks/go

go 1.24.0

require (
    // ... dependencies
)
```

**After:**
```go
module github.com/data-power-io/noesis-connectors/sdks/go

go 1.24.0

require (
    github.com/data-power-io/noesis-protocol/languages/go v1.0.0
    // ... other dependencies
)
```

## ☕ Java Projects Migration

### 1. Update `noesis/flink-jobs/pom.xml`

**Add dependency:**
```xml
<dependencies>
    <!-- Add the new protocol dependency -->
    <dependency>
        <groupId>io.datapower</groupId>
        <artifactId>noesis-protocol</artifactId>
        <version>1.0.0</version>
    </dependency>

    <!-- Keep existing dependencies -->
    <dependency>
        <groupId>org.apache.flink</groupId>
        <artifactId>flink-streaming-java</artifactId>
        <version>${flink.version}</version>
        <scope>provided</scope>
    </dependency>
    <!-- ... other dependencies -->
</dependencies>
```

**Remove protobuf plugin configuration** (no longer needed):
```xml
<!-- REMOVE THIS SECTION -->
<plugin>
    <groupId>org.xolstice.maven.plugins</groupId>
    <artifactId>protobuf-maven-plugin</artifactId>
    <version>0.6.1</version>
    <!-- ... configuration -->
</plugin>
```

### 2. Update Java imports

**Before:**
```java
import com.noesis.proto.ExtractionEvent;
import com.noesis.proto.StartExtraction;
import com.noesis.flink.grpc.EnrichmentServiceGrpc;
```

**After:**
```java
import io.datapower.noesis.v1.ExtractionEvent;
import io.datapower.noesis.v1.StartExtraction;
import io.datapower.noesis.v1.FlinkEnrichmentServiceGrpc;
```

### 3. Update Java code usage

**Before:**
```java
ExtractionEvent event = ExtractionEvent.newBuilder()
    .setStart(StartExtraction.newBuilder()
        .setSessionId("session-123")
        .setTable("users")
        .build())
    .build();
```

**After:** (No change needed - same API)
```java
ExtractionEvent event = ExtractionEvent.newBuilder()
    .setStart(StartExtraction.newBuilder()
        .setSessionId("session-123")
        .setTable("users")
        .build())
    .build();
```

## 🗂️ File Cleanup

### Remove local proto files

**From `noesis/` project:**
```bash
rm -rf noesis/proto/
rm -rf noesis/flink-jobs/src/main/proto/
```

**From `noesis-connectors/` project:**
```bash
rm -rf noesis-connectors/api/connector/v1/
```

## 🔧 Build System Updates

### Update build scripts

If you have any build scripts that reference local proto files, update them to rely on the published artifacts instead.

### Update CI/CD

Make sure your CI/CD pipelines pull the new dependency instead of generating from local proto files.

## 📋 Migration Checklist

### For `noesis/` project:
- [ ] Add `noesis-protocol` Go dependency to `go.mod`
- [ ] Update Go imports from local `pb` package to `noesisv1`
- [ ] Update Java POM to include `noesis-protocol` JAR
- [ ] Update Java imports to `io.datapower.noesis.v1`
- [ ] Remove local `proto/` directory
- [ ] Remove local `flink-jobs/src/main/proto/` directory
- [ ] Remove protobuf plugin from `flink-jobs/pom.xml`
- [ ] Test build and functionality
- [ ] Update documentation

### For `noesis-connectors/` project:
- [ ] Add `noesis-protocol` Go dependency to `sdks/go/go.mod`
- [ ] Update Go imports to use new package
- [ ] Remove local `api/connector/v1/` directory
- [ ] Test build and functionality
- [ ] Update documentation

## 🚨 Breaking Changes

### Package Names
- `datamigration.v1` → `datapower.noesis.v1`
- `datamigration.cdc.v1` → `datapower.noesis.v1`
- `connector.v1` → `datapower.noesis.v1`
- `com.noesis.flink.grpc` → `datapower.noesis.v1`

### Service Names
- `EnrichmentService` → `FlinkEnrichmentService` (in enrichment_service.proto)
- `RawDataService` → `FlinkRawDataService` (in enrichment_service.proto)

### Go Package Paths
- All imports now use `github.com/data-power-io/noesis-protocol/languages/go/datapower/noesis/v1`

### Java Package Names
- All classes now in `io.datapower.noesis.v1` package

## 🆘 Troubleshooting

### "Package not found" errors
Make sure you've updated your dependencies:
```bash
# Go
go mod tidy

# Java
mvn clean compile
```

### Import errors
Double-check that you've updated all import statements to use the new package structure.

### Version conflicts
If you encounter version conflicts, make sure you're using compatible versions of the protocol and your project dependencies.

## 🔗 Resources

- [Protocol Repository](https://github.com/data-power-io/noesis-protocol)
- [Go Package Documentation](https://pkg.go.dev/github.com/data-power-io/noesis-protocol/languages/go)
- [Java JAR on GitHub Packages](https://github.com/data-power-io/noesis-protocol/packages)
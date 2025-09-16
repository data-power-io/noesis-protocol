# Changelog

All notable changes to the Noesis Protocol will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- Initial protocol consolidation from multiple repositories
- Unified package structure under `datapower.noesis.v1`
- Automated code generation for Go and Java
- CI/CD pipeline with Buf linting and breaking change detection
- Publishing automation for Go modules and Java JARs

## [1.0.0] - 2024-01-XX

### Added
- **Core Events** (`events.proto`)
  - `ExtractionEvent` for data extraction lifecycle
  - `TransformedEvent` for post-transformation events
  - `ImportResult` for import success/failure tracking

- **Services** (`services.proto`)
  - `RawDataService` for raw zone data access
  - `EnrichmentService` for business logic enrichment

- **CDC Events** (`cdc_events.proto`)
  - `CDCEvent` for Change Data Capture events
  - `CDCBatch` for batch processing
  - `CDCStats` for monitoring and statistics

- **Connector API** (`connector.proto`)
  - `Connector` service with discovery, read, and session management
  - Support for FullTable, ChangeStream, and Subgraph read modes
  - Comprehensive entity discovery with schema management

- **Flink Services** (`enrichment_service.proto`)
  - `FlinkEnrichmentService` for Flink-specific enrichment
  - `FlinkRawDataService` for Flink raw data access
  - Historical data retrieval capabilities

### Changed
- **Breaking**: Migrated from multiple package names to unified `datapower.noesis.v1`
- **Breaking**: Updated Go package paths to `github.com/data-power-io/noesis-protocol/languages/go`
- **Breaking**: Updated Java package names to `io.datapower.noesis.v1`

### Infrastructure
- Added Buf-based code generation and linting
- Implemented GitHub Actions for CI/CD
- Setup automated publishing to GitHub Packages and Maven Central
- Created comprehensive development tooling (Makefile, scripts)

## Migration Guide

### From Legacy Packages

#### Go Projects
```go
// Before
import "github.com/noesis/internal/models/pb"

// After
import "github.com/data-power-io/noesis-protocol/languages/go/datapower/noesis/v1"
```

#### Java Projects
```xml
<!-- Before -->
<dependency>
    <groupId>com.noesis</groupId>
    <artifactId>proto</artifactId>
</dependency>

<!-- After -->
<dependency>
    <groupId>io.datapower</groupId>
    <artifactId>noesis-protocol</artifactId>
    <version>1.0.0</version>
</dependency>
```

#### Package Name Changes
- `datamigration.v1` → `datapower.noesis.v1`
- `datamigration.cdc.v1` → `datapower.noesis.v1`
- `connector.v1` → `datapower.noesis.v1`
- `com.noesis.flink.grpc` → `datapower.noesis.v1`
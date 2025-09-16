# Noesis Protocol

A centralized Protocol Buffer repository for the Noesis data processing platform, providing standardized definitions for data migration, CDC events, connectors, and enrichment services.

## 🏗️ Structure

```
noesis-protocol/
├── proto/                           # Source of truth for all proto files
│   └── datapower/noesis/v1/         # Unified v1 package
│       ├── events.proto             # Core extraction and transformation events
│       ├── services.proto           # Raw data and enrichment services
│       ├── cdc_events.proto         # Change Data Capture events
│       ├── connector.proto          # Standard connector interface
│       └── enrichment_service.proto # Flink-specific enrichment services
│
├── languages/
│   ├── go/                          # Generated Go module
│   └── java/                        # Generated Java JAR
│
├── buf.yaml                         # Buf configuration
├── buf.gen.yaml                     # Code generation config
└── Makefile                         # Development commands
```

## 🚀 Quick Start

### Go

```bash
go get github.com/data-power-io/noesis-protocol/languages/go
```

```go
import "github.com/data-power-io/noesis-protocol/languages/go/datapower/noesis/v1"

event := &noesisv1.ExtractionEvent{
    Event: &noesisv1.ExtractionEvent_Start{
        Start: &noesisv1.StartExtraction{
            SessionId: "session-123",
            Table:     "users",
        },
    },
}
```

### Java

**Maven:**
```xml
<dependency>
    <groupId>io.datapower</groupId>
    <artifactId>noesis-protocol</artifactId>
    <version>1.0.0</version>
</dependency>
```

**Gradle:**
```gradle
implementation 'io.datapower:noesis-protocol:1.0.0'
```

```java
import io.datapower.noesis.v1.ExtractionEvent;
import io.datapower.noesis.v1.StartExtraction;

ExtractionEvent event = ExtractionEvent.newBuilder()
    .setStart(StartExtraction.newBuilder()
        .setSessionId("session-123")
        .setTable("users")
        .build())
    .build();
```

## 🔧 Development

### Prerequisites

- [Buf CLI](https://docs.buf.build/installation) - Protocol buffer management
- [Go 1.21+](https://golang.org/dl/) - For Go module
- [Java 17+](https://adoptium.net/) - For Java JAR
- [Maven 3.6+](https://maven.apache.org/download.cgi) - For Java builds

### Setup

```bash
# Clone the repository
git clone https://github.com/data-power-io/noesis-protocol.git
cd noesis-protocol

# Setup development environment
make dev-setup
```

### Common Commands

```bash
# Generate code from proto files
make generate

# Lint proto files
make lint

# Check for breaking changes
make breaking-check

# Build all artifacts
make build

# Run tests
make test

# Clean generated files
make clean

# See all available commands
make help
```

### Making Changes

1. **Edit proto files** in `proto/datapower/noesis/v1/`
2. **Lint your changes**: `make lint`
3. **Generate code**: `make generate`
4. **Build and test**: `make build test`
5. **Check for breaking changes**: `make breaking-check`

## 📦 Protocol Definitions

### Core Events (`events.proto`)
- **ExtractionEvent** - Data extraction lifecycle events
- **TransformedEvent** - Post-transformation events
- **ImportResult** - Import success/failure events

### Services (`services.proto`)
- **RawDataService** - Access to raw zone data
- **EnrichmentService** - Business logic enrichment

### CDC Events (`cdc_events.proto`)
- **CDCEvent** - Change Data Capture events
- **CDCBatch** - Batch processing for CDC events
- **CDCStats** - Monitoring and statistics

### Connector API (`connector.proto`)
- **Connector** - Standardized connector interface
- **Discovery** - Platform and entity discovery
- **Read modes** - FullTable, ChangeStream, Subgraph

### Flink Services (`enrichment_service.proto`)
- **FlinkEnrichmentService** - Flink-specific enrichment
- **FlinkRawDataService** - Flink raw data access

## 🔄 Versioning & Releases

### Go Module Releases

Go modules are released using semantic versioning with the `languages/go/` prefix:

```bash
# Create a new Go release
git tag languages/go/v1.0.0
git push origin languages/go/v1.0.0
```

This triggers automatic publishing via GitHub Actions.

### Java JAR Releases

Java JARs are released using semantic versioning with the `languages/java/` prefix:

```bash
# Create a new Java release
git tag languages/java/v1.0.0
git push origin languages/java/v1.0.0
```

This triggers automatic publishing to GitHub Packages (and optionally Maven Central).

## 🛠️ Integration

### Existing Projects

Update your existing projects to use the new centralized protocols:

#### Go Projects
Replace existing proto imports:
```go
// Old
import "github.com/noesis/internal/models/pb"

// New
import "github.com/data-power-io/noesis-protocol/languages/go/datapower/noesis/v1"
```

#### Java Projects (Maven)
Replace existing proto dependencies:
```xml
<!-- Old -->
<dependency>
    <groupId>com.noesis</groupId>
    <artifactId>proto</artifactId>
    <version>...</version>
</dependency>

<!-- New -->
<dependency>
    <groupId>io.datapower</groupId>
    <artifactId>noesis-protocol</artifactId>
    <version>1.0.0</version>
</dependency>
```

## 🤝 Contributing

1. **Fork** the repository
2. **Create** a feature branch: `git checkout -b feature/amazing-feature`
3. **Make** your changes following the [development guide](#development)
4. **Test** your changes: `make lint build test`
5. **Commit** your changes: `git commit -m 'Add amazing feature'`
6. **Push** to the branch: `git push origin feature/amazing-feature`
7. **Open** a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🆘 Support

- 📧 **Email**: support@data-power.io
- 🐛 **Issues**: [GitHub Issues](https://github.com/data-power-io/noesis-protocol/issues)
- 📖 **Documentation**: [Protocol Documentation](https://docs.data-power.io/protocol)

---

**Made with ❤️ by the Data Power team**
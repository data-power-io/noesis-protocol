# Noesis Protocol - Go

Generated Go code for the Noesis Protocol Buffer definitions.

## Installation

```bash
go get github.com/data-power-io/noesis-protocol/languages/go
```

## Usage

```go
import "github.com/data-power-io/noesis-protocol/languages/go/datapower/noesis/v1"

// Use the generated types
event := &noesisv1.ExtractionEvent{
    Event: &noesisv1.ExtractionEvent_Start{
        Start: &noesisv1.StartExtraction{
            SessionId: "session-123",
            Table:     "users",
        },
    },
}
```

## Package Structure

- `datapower/noesis/v1` - All protocol definitions under the unified v1 package

## Services

- `RawDataService` - Access to RAW zone data
- `EnrichmentService` - Business logic enrichment
- `FlinkEnrichmentService` - Flink-specific enrichment
- `FlinkRawDataService` - Flink-specific raw data access
- `Connector` - Standard connector interface
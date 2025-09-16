.PHONY: help generate lint breaking-check clean test build publish-go publish-java

help: ## Show this help message
	@echo 'Usage: make [target]'
	@echo ''
	@echo 'Targets:'
	@awk 'BEGIN {FS = ":.*?## "} /^[a-zA-Z_-]+:.*?## / {printf "  %-20s %s\n", $$1, $$2}' $(MAKEFILE_LIST)

# Prerequisites
check-buf:
	@which buf > /dev/null || (echo "buf is required. Install from https://docs.buf.build/installation" && exit 1)

# Development
generate: check-buf ## Generate code from proto files
	buf generate

lint: check-buf ## Lint proto files
	buf lint

breaking-check: check-buf ## Check for breaking changes
	buf breaking --against '.git#branch=main'

format: check-buf ## Format proto files
	buf format -w

# Dependencies
mod-update: ## Update buf dependencies
	buf mod update

# Build
build: generate ## Build all language artifacts
	@echo "Building Go module..."
	cd languages/go && go mod tidy && go build ./...
	@echo "Building Java JAR..."
	cd languages/java && mvn clean compile

test: build ## Run tests
	@echo "Testing Go module..."
	cd languages/go && go test ./...
	@echo "Testing Java compilation..."
	cd languages/java && mvn test-compile

# Clean
clean: ## Clean generated files and build artifacts
	rm -rf languages/go/datapower/
	rm -rf languages/java/src/
	rm -rf languages/java/target/
	cd languages/go && go clean
	cd languages/java && mvn clean

# Publishing
publish-go: ## Publish Go module (creates git tag)
	@read -p "Enter version (e.g., v1.0.0): " version; \
	git tag "languages/go/$$version" && \
	git push origin "languages/go/$$version" && \
	echo "Go module tagged and pushed: languages/go/$$version"

publish-java: ## Publish Java JAR to Maven Central
	cd languages/java && mvn clean deploy -P ossrh

publish-java-github: ## Publish Java JAR to GitHub Packages
	cd languages/java && mvn clean deploy -P github

# CI/CD helpers
ci-setup: check-buf ## Setup CI environment
	buf mod update

ci-lint: lint ## Run linting in CI

ci-breaking: breaking-check ## Run breaking change check in CI

ci-build: build ## Build in CI

ci-test: test ## Test in CI

# Development workflow
dev-setup: ci-setup generate ## Setup development environment
	@echo "Development environment ready!"
	@echo "Next steps:"
	@echo "  1. make lint      - Lint your proto files"
	@echo "  2. make generate  - Generate code"
	@echo "  3. make build     - Build artifacts"
	@echo "  4. make test      - Run tests"

# All-in-one
all: clean generate lint build test ## Clean, generate, lint, build, and test everything
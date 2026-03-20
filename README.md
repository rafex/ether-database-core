# ether-database-core

Minimal database abstractions for Ether built on the Java standard library.

## Scope

- SQL query and parameter model
- Row mappers and result set extractors
- Small SQL builder with placeholder support
- Transaction callback contracts
- JDBC-oriented helpers for common column mappings

## Notes

- This module is intentionally JDBC-first and framework-free.
- It does not create pools, manage migrations or generate SQL from annotations.
- The intended layering is `ether-database-core` -> `ether-jdbc` -> optional vendor modules such as `ether-database-postgres`.

## Maven

```xml
<dependency>
  <groupId>dev.rafex.ether.database</groupId>
  <artifactId>ether-database-core</artifactId>
  <version>8.0.0-SNAPSHOT</version>
</dependency>
```

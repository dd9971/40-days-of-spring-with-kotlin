# ✅ Day 3 Summary – Spring Boot & Kotlin

## 🔧 What was implemented?

### 1. Domain model (Entity)
- Created the `TransferJob` class with fields: `id`, `destination`, and `source`.
- Used `@Entity` annotation with `jakarta.persistence`.
- IDs are generated using `UUID`.

### 2. Business logic (Service layer)
- The `ThirdDay` service:
    - Generates a new `TransferJob` with dummy data,
    - Saves it to the repository,
    - Retrieves it by its ID.
    - List entities 
    - Delete entity by ID
    - Update entity with pessimistic lock

### 3. REST API (Controller)
- Created a controller `TransferJobController`.
- Exposed a simple endpoint:

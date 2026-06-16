# RecallRadar - Implementation Roadmap

## Purpose

This document defines the implementation order for RecallRadar.

Features should be implemented according to this roadmap to ensure:

- Stable architecture
- Incremental delivery
- Learning progression
- Reduced rework

---

# Phase 1 - Foundation

## Goal

Establish backend architecture and development workflow.

### Features

- Spring Boot Setup
- Layered Architecture
- DTOs
- Validation
- Global Exception Handling
- PostgreSQL Integration
- JPA Setup

### Status

✅ Completed

---

# Phase 2 - Topic Management

## Goal

Allow users to manage learning topics.

### Features

- Create Topic
- Get Topic By Id
- Get All Topics
- Update Topic
- Delete Topic

### Concepts Learned

- Controllers
- Services
- Repositories
- DTOs
- CRUD Operations
- JPA Repositories

### Status

✅ Completed

---

# Phase 3 - User Management & Authentication

## Goal

Introduce users and secure access.

### Features

- User Entity
- User Registration
- User Login
- Password Hashing (BCrypt)

### Concepts Learned

- Entity Relationships
- Spring Security
- Authentication
- BCrypt

### Status

⏳ Planned

---

# Phase 4 - JWT Security

## Goal

Secure API endpoints.

### Features

- JWT Generation
- JWT Validation
- Authentication Filter
- Protected Routes

### Concepts Learned

- JWT
- Authorization
- Security Filters
- Stateless Authentication

### Status

⏳ Planned

---

# Phase 5 - Revision Tracking

## Goal

Track learning and revision activity.

### Features

- RevisionLog Entity
- Log Revision Session
- Revision History
- Latest Revision Lookup

### Concepts Learned

- One-To-Many Relationships
- Many-To-One Relationships
- Foreign Keys
- Custom Queries

### Status

⏳ Planned

---

# Phase 6 - Retention Intelligence

## Goal

Calculate learning effectiveness metrics.

### Features

- Leak Score
- Revision Priority
- Retention Metrics
- Topic Analytics

### Concepts Learned

- Business Logic Design
- Service Layer Computations
- Analytics Modeling

### Status

⏳ Planned

---

# Phase 7 - Testing

## Goal

Ensure reliability and maintainability.

### Features

- Unit Tests
- Service Layer Tests
- Repository Tests
- Mocking Dependencies

### Concepts Learned

- JUnit
- Mockito
- Test Isolation

### Status

⏳ Planned

---

# Phase 8 - Frontend Integration

## Goal

Connect React frontend to backend.

### Features

- Authentication Flow
- Topic Management UI
- Revision Dashboard
- API Integration

### Concepts Learned

- Axios
- JWT Storage
- Protected Routes
- Frontend-Backend Communication

### Status

⏳ Planned

---

# Phase 9 - Deployment

## Goal

Deploy RecallRadar to production.

### Features

- Environment Variables
- Production Configuration
- Cloud Deployment
- Database Hosting

### Concepts Learned

- Railway / Render
- Production Security
- Configuration Management

### Status

⏳ Planned

---

# MVP Definition

RecallRadar MVP is complete when:

- Users can register and login
- Users can create and manage topics
- Users can log revision sessions
- Users can view revision history
- Users can identify topics needing revision

Everything after MVP is enhancement work.

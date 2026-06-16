# RecallRadar - API Specification

## Purpose

This document defines all public REST API endpoints exposed by RecallRadar.

It serves as the contract between:

- Frontend ↔ Backend
- Mobile ↔ Backend
- Future Integrations ↔ Backend

---

# Authentication APIs

## Register User

### Endpoint

```http
POST /api/v1/auth/register
```

### Request

```json
{
  "name": "Anas",
  "email": "anas@example.com",
  "password": "StrongPassword123"
}
```

### Success Response

```http
201 Created
```

```json
{
  "id": 1,
  "name": "Anas",
  "email": "anas@example.com"
}
```

---

## Login User

### Endpoint

```http
POST /api/v1/auth/login
```

### Request

```json
{
  "email": "anas@example.com",
  "password": "StrongPassword123"
}
```

### Success Response

```http
200 OK
```

```json
{
  "token": "jwt-token"
}
```

---

# Topic APIs

## Create Topic

### Endpoint

```http
POST /api/v1/topics
```

### Request

```json
{
  "name": "Spring Boot",
  "description": "Backend framework",
  "difficulty": "MEDIUM",
  "category": "Backend"
}
```

### Success Response

```http
201 Created
```

```json
{
  "id": 1,
  "name": "Spring Boot",
  "description": "Backend framework",
  "difficulty": "MEDIUM"
}
```

---

## Get All Topics

### Endpoint

```http
GET /api/v1/topics
```

### Success Response

```http
200 OK
```

```json
[
  {
    "id": 1,
    "name": "Spring Boot",
    "difficulty": "MEDIUM"
  }
]
```

---

## Get Topic By Id

### Endpoint

```http
GET /api/v1/topics/{id}
```

### Success Response

```http
200 OK
```

### Error Response

```http
404 Not Found
```

---

## Update Topic

### Endpoint

```http
PUT /api/v1/topics/{id}
```

### Request

```json
{
  "description": "Updated Description"
}
```

### Success Response

```http
200 OK
```

---

## Delete Topic

### Endpoint

```http
DELETE /api/v1/topics/{id}
```

### Success Response

```http
200 OK
```

---

# Revision APIs

## Log Revision Session

### Endpoint

```http
POST /api/v1/revisions
```

### Request

```json
{
  "topicId": 1,
  "durationMinutes": 30,
  "revisionMethod": "ACTIVE_RECALL",
  "confidenceLevel": 4,
  "notes": "Remembered most concepts."
}
```

### Success Response

```http
201 Created
```

---

## Get Revision History

### Endpoint

```http
GET /api/v1/revisions/topic/{topicId}
```

### Success Response

```http
200 OK
```

```json
[
  {
    "id": 1,
    "revisionDate": "2026-06-15T18:00:00",
    "confidenceLevel": 4
  }
]
```

---

## Get Latest Revision

### Endpoint

```http
GET /api/v1/revisions/topic/{topicId}/latest
```

### Success Response

```http
200 OK
```

---

# Analytics APIs (Future)

## Get Topic Metrics

### Endpoint

```http
GET /api/v1/topics/{id}/metrics
```

### Success Response

```json
{
  "leakScore": 35.4,
  "retrievalStrength": 71.2,
  "storageStrength": 64.8,
  "revisionPriority": 2
}
```

---

# Standard Error Response

All API errors should follow:

```json
{
  "success": false,
  "status": 404,
  "message": "Topic not found",
  "timestamp": "2026-06-15T18:00:00"
}
```

---

# API Versioning Strategy

Current Version:

```http
/api/v1
```

Future breaking changes should introduce:

```http
/api/v2
```

instead of modifying existing contracts.

# RecallRadar - Domain Model

## Purpose

This document defines the core business entities of RecallRadar, their responsibilities, and relationships before implementation.

The goal is to establish a stable business model that guides database design, API design, and implementation.

---

# Entity: User

## Purpose

Represents a learner using the system.

## Fields

```txt
id
name
email
password
createdAt
```

## Relationships

```txt
One User
    ↓
Many Topics
```

---

# Entity: Topic

## Purpose

Represents a learning topic being tracked for retention and revision.

## Fields

```txt
id
name
description
difficulty
category
createdAt
```

## Relationships

```txt
Belongs To:
- One User

Has:
- Many RevisionLogs
```

## Example

```txt
Spring Boot
Data Structures
Operating Systems
System Design
```

---

# Entity: RevisionLog

## Purpose

Represents a single revision session for a topic.

Each revision event is stored independently to allow historical analysis.

## Fields

```txt
id
revisionDate
durationMinutes
revisionMethod
confidenceLevel
notes
```

## Relationships

```txt
Belongs To:
- One Topic
```

## Revision Methods

```txt
READING
ACTIVE_RECALL
QUIZ
PROBLEM_SOLVING
TEACHING
```

---

# Entity: TopicMetrics (Future Phase)

## Purpose

Stores calculated learning intelligence metrics.

These values are derived from Topic and RevisionLog data.

## Fields

```txt
topicId
leakScore
retrievalStrength
storageStrength
illusionScore
revisionPriority
updatedAt
```

## Relationships

```txt
One Topic
    ↓
One TopicMetrics
```

---

# MVP Scope

Entities implemented in MVP:

```txt
User
Topic
RevisionLog
```

Deferred until analytics phase:

```txt
TopicMetrics
```

---

# Relationship Summary

```txt
User
  └── Topic
          └── RevisionLog

TopicMetrics
    (Future)
```

# RecallRadar Research References

## Purpose

This document contains the primary research sources that inform the design of RecallRadar.

These references provide the scientific foundation for:

- Forgetting & Memory Decay
- Retrieval Strength
- Storage Strength
- Active Recall
- Practice Testing
- Confidence Calibration
- Illusion of Competence
- Spaced Repetition
- Learning Analytics

---

# Citation Convention

Throughout RecallRadar documentation, references should be cited using:

```text
[REF-01]
[REF-02]
[REF-03]
...
```

Example:

```text
Leak Score is inspired by forgetting curve research [REF-01].
```

---

# Primary Research Papers

---

## [REF-01]

### Replication and Analysis of Ebbinghaus' Forgetting Curve

**Authors**

J. M. J. Murre, Joeri Dros

**Year**

2015

**Link**

https://doi.org/10.1002/acp.3088

**Research Area**

- Forgetting Curve
- Retention Decay
- Memory Accessibility

**Used In RecallRadar**

- Leak Score
- Retention Modeling
- Revision Scheduling

**Key Takeaway**

Memory accessibility decreases over time without reinforcement or retrieval.

---

## [REF-02]

### Making Things Hard on Yourself, But in a Good Way: Creating Desirable Difficulties to Enhance Learning

**Authors**

Elizabeth L. Bjork
Robert A. Bjork

**Year**

2011

**Link**

https://bjorklab.psych.ucla.edu/wp-content/uploads/sites/13/2016/04/EBjork_RBjork_2011.pdf

**Research Area**

- Retrieval Strength
- Storage Strength
- Desirable Difficulties

**Used In RecallRadar**

- Retrieval Strength Metric
- Storage Strength Metric
- Revision Quality Evaluation
- Learning Effectiveness Analysis

**Key Takeaway**

Difficult retrieval often produces stronger long-term learning than easy review.

---

## [REF-03]

### Rethinking the Use of Tests: A Meta-Analysis of Practice Testing

**Authors**

Olabisi O. Adesope
Daniel A. Trevisan
Nivethika Sundararajan

**Year**

2017

**Link**

https://gwern.net/doc/psychology/spaced-repetition/2017-adesope.pdf

**Research Area**

- Active Recall
- Practice Testing
- Retrieval Practice

**Used In RecallRadar**

- Revision Methods
- Performance Score Tracking
- Method Effectiveness Analytics

**Key Takeaway**

Practice testing consistently improves retention compared to passive review strategies.

---

## [REF-04]

### Enhancing Human Learning via Spaced Repetition Optimization

**Authors**

Behrooz Tabibian
Udit Upadhyay
Aditya De
Ali Zarezade
Bernhard Schölkopf
Manuel Gomez-Rodriguez

**Year**

2019

**Link**

https://www.semanticscholar.org/paper/Enhancing-human-learning-via-spaced-repetition-Tabibian-Upadhyay/cfaf45da78a2d51a8cc94f53b34eb3790329598d

**Research Area**

- Spaced Repetition
- Scheduling Optimization
- Memory Retention

**Used In RecallRadar**

- Revision Scheduler
- Due Topic Generation
- Priority Calculation
- Future Adaptive Scheduling

**Key Takeaway**

Review timing can be optimized mathematically to maximize long-term retention.

---

## [REF-05]

### A Trainable Spaced Repetition Model for Language Learning

**Authors**

Burr Settles
Brendan Meeder

**Year**

2016

**Link**

https://aclanthology.org/P16-1174.pdf

**Research Area**

- Memory Modeling
- Retention Prediction
- Adaptive Scheduling

**Used In RecallRadar**

- Future Personalized Retention Models
- Future Adaptive Leak Score Engine

**Key Takeaway**

Learner history can be used to predict future forgetting probability.

---

## [REF-06]

### Illusions of Competence in Monitoring One's Knowledge During Study

**Authors**

Asher Koriat
Robert A. Bjork

**Year**

2006

**Link**

https://bjorklab.psych.ucla.edu/wp-content/uploads/sites/13/2016/07/Koriat_Bjork_2006_JEP-LMC.pdf

**Research Area**

- Metacognition
- Confidence Calibration
- Illusion of Competence

**Used In RecallRadar**

- Illusion Score
- Confidence Accuracy
- Calibration Analytics

**Key Takeaway**

Learners frequently overestimate what they actually know.

---

# Educational Sources

These are not primary research papers but are useful explanatory resources.

---

## [REF-07]

### Retrieval Practice

**Organization**

The Learning Scientists

**Link**

https://www.learningscientists.org/blog/2016/5/10-1

**Used In RecallRadar**

- User Guidance
- Revision Recommendations
- Educational Content

---

## [REF-08]

### Practice Testing

**Organization**

The Learning Scientists

**Link**

https://www.learningscientists.org/blog/2017/2/9-1

**Used In RecallRadar**

- Revision Method Design
- Method Effectiveness Analytics

---

# Research Traceability Matrix

| RecallRadar Feature                    | Supporting References  |
| -------------------------------------- | ---------------------- |
| Leak Score                             | REF-01, REF-02, REF-04 |
| Revision Scheduler                     | REF-01, REF-04         |
| Due Topics Queue                       | REF-04                 |
| Retrieval Strength                     | REF-02                 |
| Storage Strength                       | REF-02                 |
| Active Recall Tracking                 | REF-03, REF-07         |
| Performance Score                      | REF-03                 |
| Method Effectiveness                   | REF-03, REF-08         |
| Illusion Score                         | REF-06                 |
| Confidence Accuracy                    | REF-06                 |
| Adaptive Scheduling (Future)           | REF-04, REF-05         |
| Personalized Retention Models (Future) | REF-05                 |

---

# Research-Derived vs RecallRadar-Derived Concepts

## Research-Derived

The following concepts originate directly from learning science research:

- Forgetting Curve
- Retrieval Strength
- Storage Strength
- Active Recall
- Practice Testing
- Confidence Calibration
- Illusion of Competence
- Spaced Repetition

Supported by:

```text
REF-01
REF-02
REF-03
REF-04
REF-05
REF-06
```

---

## RecallRadar-Derived

The following concepts are original RecallRadar product constructs inspired by research:

- Leak Score
- Revision Priority
- Topic Health
- Due Topics Queue
- Retention Dashboard
- Method Effectiveness Analytics

The cited papers do not define these metrics directly.

Instead, RecallRadar uses research findings as inspiration when designing these scoring systems and analytics models.

---

# Future Research Areas

Future versions of RecallRadar may incorporate research in:

- Adaptive Scheduling
- Personalized Forgetting Curves
- Machine Learning Retention Prediction
- Knowledge Tracing
- Educational Data Mining
- Learning Analytics
- Metacognitive Modeling
- Student Performance Prediction

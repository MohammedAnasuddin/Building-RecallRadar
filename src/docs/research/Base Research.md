# 

## Research Papers to Cite

Use these as the backbone of your project documentation and design rationale.[^2][^3][^4][^5][^1]

1. **Replication and Analysis of Ebbinghaus’ Forgetting Curve** — Murre \& Dros, 2015, PLOS One / PMC. This is a free full-text paper on forgetting-curve replication and savings-based retention measurement.[^4]
2. **Creating Desirable Difficulties to Enhance Learning** — Bjork \& Bjork, 2011. This is the key source for storage strength vs retrieval strength, spacing, interleaving, and testing effects.[^2]
3. **Rethinking the Use of Tests: A Meta-Analysis of Practice Testing** — Adesope, Trevisan, \& Sundararajan, 2017. This supports active recall / retrieval practice.[^1]
4. **Enhancing human learning via spaced repetition optimization** — Tabibian et al., PNAS 2019. This supports adaptive revision scheduling logic.[^3]
5. **Mending Metacognitive Illusions: A Comparison of Mnemonic-Based and Theory-Based Procedures** — Koriat \& Bjork, 2006. This supports illusion of competence / confidence calibration.[^5]

## Extraction Checklist

Use this as your research-to-implementation checklist.[^3][^4][^5][^1][^2]

### Forgetting Curve

- Definition: retention drops with time after learning, and the shape is often modeled as a decay curve.[^4]
- Variables: time since study, amount learned, prior repetitions, interference, and item difficulty.[^4]
- Formula: the paper discusses fitting forgetting with power/log-like functions, and Ebbinghaus-style decay can be approximated in practice with exponential or power decay.[^4]
- Retention decay rates: decay is steep early and slower later, which is the core implication of the curve.[^4]
- Scheduling implications: review sooner when the item is newly learned, then stretch intervals after successful recall.[^3][^4]

### Spaced Repetition

- Recommended intervals: common practical intervals include 1 day, 3 days, 7 days, 14 days, and 30 days, but research supports adapting intervals to recall probability rather than fixed rules.[^3]
- Interval expansion logic: if retrieval succeeds, increase the next interval; if retrieval fails, shorten it and review sooner.[^3]
- Failure recovery strategies: lower the interval, increase feedback, and return to active retrieval rather than passive rereading.[^1][^3]
- Business use: schedule the next review based on memory state, not just calendar spacing.[^3]

### Retrieval Strength Theory

- Definition: retrieval strength is current accessibility of a memory cue, not how permanently learned it is.[^2]
- Inputs: recency, cues, context match, and recent exposure.[^2]
- Outputs: ease of recall “now,” not deep long-term learning.[^2]
- Measurement approaches: use quiz success, response time, and recent recall performance as proxies.[^5][^2]

### Storage Strength Theory

- Definition: storage strength is how well-entrenched and interconnected the memory is.[^2]
- Growth factors: repeated successful retrieval, spaced practice, and durable encoding.[^2]
- Relationship with retrieval strength: high retrieval strength can happen with low storage strength, which is why students feel confident but forget later.[^2]
- Business use: store both metrics separately so your system can detect “feels familiar” versus “is actually durable.”[^2]

### Active Recall

- Benefits: retrieval practice is consistently better than restudy and supports retention and transfer.[^1]
- Measurement methods: quiz accuracy, free recall, cued recall, and problem solving.[^1]
- Impact on retention: retrieval practice produces durable gains, especially compared with passive rereading.[^1]
- Business use: weight quizzes and problem solving more than reading in your revision engine.[^1]

### Confidence Accuracy

- Confidence vs actual performance: metacognitive judgments can be inflated when learners confuse familiarity with mastery.[^5][^2]
- Calibration metrics: compare confidence ratings to actual quiz scores, then track overconfidence error and calibration gap.[^5]
- Business use: if confidence is high but performance is low, increase illusion score and revision priority.[^5]

### Illusion Of Competence

- Detection indicators: rereading-heavy behavior, high confidence, low retrieval accuracy, and poor delayed recall.[^5][^2]
- Causes: fluent re-exposure can create a false sense of learning.[^5][^2]
- Potential scoring approaches: combine confidence, quiz performance, and delay since last successful recall into a single overconfidence metric.[^5]

### Revision Scheduling

- Trigger conditions: schedule a review when recall probability drops below threshold or when leak score rises too high.[^4][^3]
- Optimal intervals: probabilistic scheduling is better than fixed intervals because it adapts to actual learner performance.[^3]
- Priority factors: low recall probability, long gap since study, hard topics, and prior failures should move a topic upward in the queue.[^3][^2]

### Retention Metrics

- Common metrics in research: recall rate, savings score, JOL confidence, calibration error, and delayed retention.[^4][^5]
- Mathematical formulas: savings score is used in Ebbinghaus-style retention work; in modern systems you can also use recall probability and exponential decay.[^4][^3]
- Scoring systems: keep separate metrics for immediate success and delayed success, because performance now is not equal to retention later.[^4][^2]

### Learning Analytics

- Visualization ideas: leak trend over time, revision success by method, weakest topics, and confidence-vs-performance scatter plots.[^5][^2]
- Trend indicators: increasing gap between confidence and performance, longer gaps between revisions, and recurring failures on the same topic.[^5]
- Performance indicators: retention gain after each revision, average interval length, and method effectiveness by topic.[^1][^3]

## Recommended Formula Set

These formulas are practical for your backend and are consistent with the papers above.[^3][^2][^4][^5]

1. **Forgetting / retention**

$$
R(t) = e^{-t/S}
$$

where $R$ is retention, $t$ is time since last review, and $S$ is storage strength. This is a practical implementation choice inspired by forgetting-curve research.[^4]
2. **Leak score**

$$
Leak = 100 \times (1 - R(t))
$$

This gives you a readable percentage-style risk score for the dashboard.[^4]
3. **Revision priority**

$$
Priority = a(L) + b(D) + c(F) - d(S)
$$

where $L$ = leak score, $D$ = difficulty, $F$ = failed attempts, and $S$ = storage strength. This matches the adaptive scheduling idea from spaced-repetition research.[^3]
4. **Illusion score**

$$
Illusion = Confidence - Performance
$$

A positive gap means the learner feels stronger than the actual result.[^5]
5. **Storage growth**

$$
S_{new} = S_{old} + \Delta
$$

where $\Delta$ is larger for active recall, problem solving, and successful delayed retrieval than for rereading.[^1][^2]

## Backend Requirements

These are the requirements your project should implement if you want it to look research-grounded.[^1][^2][^3][^4][^5]

- Track topic metadata: difficulty, category, created time, and user ownership.[^2]
- Store every revision log: method, confidence, duration, and outcome.[^1][^5]
- Maintain calculated metrics: leak score, retrieval strength, storage strength, illusion score, and revision priority.[^2][^5]
- Recalculate memory state periodically using scheduled jobs.[^3]
- Generate revision queues from current recall risk instead of simple due-date logic.[^3]
- Detect low-confidence/high-failure topics as illusion-of-competence candidates.[^5]
- Support analytics for weakest topics, strongest topics, method effectiveness, and trend lines.[^1][^3][^5]

## References List

You can paste this into your document as the reference section.[^2][^4][^1][^3][^5]

- Murre, J. M. J., \& Dros, J. (2015). *Replication and Analysis of Ebbinghaus’ Forgetting Curve*. PLOS One.[^4]
- Bjork, E. L., \& Bjork, R. A. (2011). *Creating Desirable Difficulties to Enhance Learning*.[^2]
- Adesope, O. O., Trevisan, D. A., \& Sundararajan, N. (2017). *Rethinking the Use of Tests: A Meta-Analysis of Practice Testing*.[^1]
- Tabibian, B., Upadhyay, U., et al. (2019). *Enhancing human learning via spaced repetition optimization*. PNAS.[^3]
- Koriat, A., \& Bjork, R. A. (2006). *Mending Metacognitive Illusions: A Comparison of Mnemonic-Based and Theory-Based Procedures*.[^5]

## Document Format

I can turn this into a proper **Markdown document** or a **Word-style structured report** with sections like Abstract, Literature Review, Model Design, and References. I can also make it into a clean downloadable file with a title page and bibliography.
<span style="display:none">[^10][^11][^12][^13][^14][^15][^16][^17][^18][^19][^20][^6][^7][^8][^9]</span>

<div align="center">⁂</div>

[^1]: https://journals.sagepub.com/doi/10.3102/0034654316689306?icid=int.sj-full-text.citing-articles.81

[^2]: https://bjorklab.psych.ucla.edu/wp-content/uploads/sites/13/2016/04/EBjork_RBjork_2011.pdf

[^3]: https://www.semanticscholar.org/paper/Enhancing-human-learning-via-spaced-repetition-Tabibian-Upadhyay/cfaf45da78a2d51a8cc94f53b34eb3790329598d

[^4]: https://pmc.ncbi.nlm.nih.gov/articles/PMC4492928/

[^5]: https://bjorklab.psych.ucla.edu/wp-content/uploads/sites/13/2016/07/Koriat_Bjork_2006_JEP-LMC.pdf

[^6]: https://github.com/Networks-Learning/memorize

[^7]: https://dl.acm.org/doi/10.1109/TKDE.2023.3251721

[^8]: https://www.learningscientists.org/blog/2017/2/9-1

[^9]: https://bjorklab.psych.ucla.edu/wp-content/uploads/sites/13/2021/01/RABjorkELBjorkJARMAC2020ForPostingSingleSpaced.pdf

[^10]: https://pmc.ncbi.nlm.nih.gov/articles/PMC5126970/

[^11]: https://my.chartered.college/impact_article/does-research-on-retrieval-practice-translate-into-classroom-practice/

[^12]: https://aethel.click/blog/the-forgetting-curve-is-a-feature-not-a-bug

[^13]: https://dl.acm.org/doi/full/10.1145/3483843

[^14]: https://journals.plos.org/plosone/article?id=10.1371%2Fjournal.pone.0120644

[^15]: https://dl.acm.org/doi/10.1145/3483843

[^16]: http://psychnet.wustl.edu/memory/wp-content/uploads/2018/04/Castel-et-al-2007_PBR.pdf

[^17]: https://arxiv.org/html/2506.12034v2

[^18]: https://pmc.ncbi.nlm.nih.gov/articles/PMC7482702/

[^19]: https://pubmed.ncbi.nlm.nih.gov/17546739/

[^20]: https://www.sciencedirect.com/science/article/abs/pii/S0749596X18300512

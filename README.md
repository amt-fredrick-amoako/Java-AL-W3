Exercise 2.1: Understanding Reactive Programming
Tasks:
Core Principles:

Research the core principles of Reactive Programming:
Observables: Data producers in RxJava that emit items over time.
Subscribers: Consumers that react to data emitted by observables.
Schedulers: Control the thread execution context for observables and subscribers.
Comparison to Imperative Programming:

Reactive programming focuses on asynchronous, event-driven processing using streams of data and is ideal for applications where responsiveness and scalability are crucial, like real-time data feeds.
Imperative programming is more sequential and may require complex threading or callback management for asynchronous handling.
Benefits of Reactive Programming for Stock Monitoring:
Asynchronous Data Flow: Allows real-time updates without blocking the main thread.
Event-Driven Architecture: Simplifies handling continuous data streams, such as stock price updates.
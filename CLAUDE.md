# Vortex

## Context
A mobile/desktop app for managing AI-driven workflows: users create tasks, the AI processes them automatically, asking follow-up questions (via push) or ending in an outcome, and the user can answer, cancel, or check status anytime.

## Stack
- Kotlin Multiplatform (KMM) + Ktor for mobile, desktop, and backend.
- Koog for the backend's interaction with Claude.
- Firebase Cloud Messaging for push notifications.

## Expensive decisions
- Single user for everyone (multi-tenant/auth deferred; Firebase Auth planned for later).
- No roles beyond task owner.
- In-memory storage only, no offline/sync.
- UI in English only; task content/AI responses may be in any language.

## Backlog
1. As a user, I want to create a task with a description and see it appear in my task list with its status, so that I know it was received.
2. As a user, I want my created task to be automatically sent to the AI for processing, so that I get a result without any extra action. Requires: #1
3. As a user, I want to get a push notification when the AI needs more information to continue a task, so that I don't have to keep checking the app. Requires: #2
4. As a user, I want to answer the AI's question from the app, so that the task keeps processing toward an outcome. Requires: #3
5. As a user, I want to cancel a task at any point while it's processing, so that I can stop one I no longer want. Requires: #2
6. As a user, I want to get a push notification when a task reaches its final outcome, so that I know it's done without checking the app. Requires: #2
7. As a user, I want to see the full exchange for a task (my description, the AI's questions, my answers, and the final outcome), so that I understand how the result was reached. Requires: #4

# 🚀 SocialBot Guardrail System

A Spring Boot backend system that manages posts, comments, and bot interactions with strict Redis-based guardrails.

---

## 🧠 Features

- Create Posts, Comments, Likes
- Real-time Virality Score (Redis)
- Bot Interaction Control:
  - Max 100 bot replies per post
  - Cooldown between bot-user interactions
  - Max depth limit for comments
- Smart Notification Batching
- High Concurrency Handling

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- PostgreSQL
- Redis

---

## ⚡ How It Works

1. User interacts with post
2. Redis checks rules (guardrails)
3. If allowed → save to DB
4. Update virality score in real-time

---

## 🔥 Key Highlight

Uses Redis atomic operations (INCR) to safely handle 200+ concurrent bot requests without breaking limits.

---

## 📌 Future Improvements

- Add authentication
- UI dashboard
- Deploy on cloud

---

## 👩‍💻 Author

Anshika Srivastava

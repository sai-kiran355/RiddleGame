# 🧩 Riddle Game

Welcome to the **Riddle Game** – a fun and interactive Java console-based game that challenges you with riddles based on difficulty levels: Easy, Medium, and Hard!

---

## 🎮 Features

- Choose from three difficulty levels
- Randomized riddles using `Collections.shuffle`
- Hint system for hard riddles
- Score tracking with points per riddle
- Option to continue playing or exit after each riddle

---

## 📂 Project Structure

RiddleGame/
├── RiddleGame.java
└── README.md

Concepts Applied

- 🎯 Object-Oriented Design (`Riddle` class with constructor & attributes)
- 🔁 Loops (`for`, `while`) for iterating riddles and attempts
- 🧪 Conditionals for answer checking and hint logic
- 💡 Hint system and scoring logic based on user input
- 🎲 Randomization with `Collections.shuffle()` for unpredictable riddles

🧩 How the Game Works

1. You start the game and select a difficulty: **Easy / Medium / Hard**.
2. A random riddle is shown.
3. You get **2 attempts** to answer.
4. After one wrong attempt, you are **offered a hint**.
5. Based on your answer, you earn points.
6. After each riddle, you're asked: *Do you want to continue?*
7. At the end, your **final score** is shown.


package ru.tutunnikov.unscramble.ui

data class GameUiState(
    val currentScrambledWord: String = "",
    val score: Int = 0,
    val currentWordCount: Int = 1,
    val isGuessedWordWrong: Boolean = false,
    val isGameOver: Boolean = false,
    val stepsToHint: Int = 1,
)
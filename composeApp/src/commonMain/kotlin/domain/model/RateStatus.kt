package domain.model

import androidx.compose.ui.graphics.Color
import staleColor

enum class RateStatus (
    val title: String,
    val color: Color
) {
    Idle(
        title = "Rates",
        color = Color.White
    ),
    Fresh(
        title = "Fresh rates",
        color = Color.White
    ),
    Stale(
        title = "Rates are not fresh",
        color = staleColor
    )

}
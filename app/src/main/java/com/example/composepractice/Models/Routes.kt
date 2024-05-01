package com.example.composepractice.Models

sealed class Routes(val route: String) {
    data object ParentNav : Routes("parentNav")
    data object MainScreenNav : Routes("mainScreenNav")

    data object LoginScreen : Routes("loginScreen")

    data object MainScreen : Routes("mainScreen")
    data object ExploreMainScreen : Routes("loginScreen")
    data object ReviewMainScreen : Routes("reviewMainScreen")
    data object AccountMainScreen : Routes("accountMainScreen")

    data object InsideExploreNav : Routes("insideExploreNav")
    data object InsideAccountNav : Routes("insideAccountNav")
    data object InsideReviewNav : Routes("insideReviewNav")

    data object InsideReviewScreen : Routes("insideReviewScreen")
    data object InsideExploreScreen : Routes("insideExploreScreen")
    data object InsideAccountScreen : Routes("insideAccountScreen")
}
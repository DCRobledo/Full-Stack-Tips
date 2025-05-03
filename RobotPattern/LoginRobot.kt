class LoginRobot {

    fun enterUsername(username: String) {
        composeTestRule.onNodeWithTag("username")
            .performTextInput(username)
    }

    fun enterPassword(password: String) {
        composeTestRule.onNodeWithTag("password")
            .performTextInput(password)
    }

    fun clickLogin() {
        composeTestRule.onNodeWithTag("login_button")
            .performClick()
    }
}

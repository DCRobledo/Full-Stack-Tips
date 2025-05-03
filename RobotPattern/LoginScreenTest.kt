class LoginRobotTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun successfulLogin_showsWelcomeMessage() {
        LoginRobot().perform {
            enterUsername("finn.mertens")
            enterPassword("ihavenodad")
            clickLogin()
        }

        composeTestRule.onNodeWithText("Welcome")
            .assertIsDisplayed()
    }

    @Test
    fun failedLogin_showsErrorMessage() {
        LoginRobot().perform {
            enterUsername("jake.thedog")
            enterPassword("bacon_pancakes")
            clickLogin()
        }

        composeTestRule.onNodeWithText("Invalid credentials")
            .assertIsDisplayed()
    }
}
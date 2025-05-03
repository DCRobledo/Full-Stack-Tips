fun LoginRobot.performLogin(username: String, password: String) {
    enterUsername(username)
    enterPassword(password)
    clickLogin()
}

fun LoginRobot.perform(block: LoginRobot.() -> Unit): LoginRobot {
    this.block()
    return this
}

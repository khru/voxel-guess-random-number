import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChangeMeTest {

  @Test
  public void win_when_the_player_guesses_the_number_on_the_first_attempt() {
    ChangeMe changeMe = new ChangeMe();

    assertTrue(changeMe.method());
  }
}

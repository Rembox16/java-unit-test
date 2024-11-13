import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class) // Аннотация для параметризованных тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
      this.age = age;
      this.result = result; // Инициализация полей
  }

  @Parameterized.Parameters // Аннотация для метода с параметрами
  public static Object[][] getTestData() {
      return new Object[][] {
          {16,false},  // Возраст меньше 18
          {17, false}, // Возраст меньше 18
          {18, true},  // Ровно 18 лет
          {21, true}   // Возраст больше 18
      };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
      Program program = new Program();
      boolean isAdult = program.checkIsAdult(age); // Передаем возраст как аргумент
      assertEquals("Ожидалось: " + result + " для возраста " + age, result, isAdult);
  }
}

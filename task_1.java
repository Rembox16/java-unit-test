@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Пользователь меньше 18 лет", true ,isAdult );// Напиши код здесь
}

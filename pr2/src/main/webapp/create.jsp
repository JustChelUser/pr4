<%@ page contentType="text/html;charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Подключение к интернету</title>
</head>
<body>
<h3>Оформить заявку на подключение к интернету</h3>
<form method="post">
	<label>Имя</label><br>
	<input name="name"/><br><br>
	<label>Фамилия</label><br>
	<input name="surname"/><br><br>
	<label>Отчество</label><br>
	<input name="patronymic"/><br><br>
	<label>Город</label><br>
	<input name="city"/><br><br>
	<label>Улица</label><br>
	<input name="street"/><br><br>
	<label>Телефонный номер (логин)</label><br>
	<input name="telnumb" type="number"/><br><br>
	<label>Email</label><br>
	<textarea name="email"></textarea><br><br>
	<label>Необходим wi-fi роутер ? 
	 <input type="checkbox" name="wifi" value="1">
	 Да
	</label><br>
	<label>Необходим мобильный интернет ? 
	  <input type="checkbox" name="mobileint" value="1">
	  Да
	  </label><br>
	<label>Необходимы дополнительные TV каналы ? 
	 <input type="checkbox" name="tv" value="1">
	  Да
	  </label><br>
	  <label>Пароль</label><br>
	<input name="password" type="password"/><br><br>
	 <p><select size="3"  name="tarif">
    <option disabled>Выберите тариф</option>
    <option value="1">Тариф 1</option>
    <option selected value="2">Тариф 2</option>
    <option value="3">Тариф 3</option>
    <option value="4">Тариф 4</option>
   </select></p>
   <label>Перезвонить прямо сейчас</label><br>  
   <div>
  <input type="radio"  id="da"  name="call" value="da" checked>
  <label for="da">Да</label>
</div>

<div>
  <input type="radio"  id="net" name="call" value="net">
  <label for="net">Нет</label>
</div>  
   <br><br>
	 <input type="reset"> 
	<input type="submit" value="Отправить">
</form>
</body>
</html>
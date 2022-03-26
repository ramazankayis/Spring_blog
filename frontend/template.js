//templatem js
/* */

//Form Register
$(function () {
  $('#btnSubmit2').click(function () {
    // alert("Tıkladı")

    //input değerlerini almak
    let emailInput, passwordInput;

    emailInput = $('#emailLogin').val();
    emailInput = jQuery.trim(emailInput);

    passwordInput = $('#passwordLogin').val();
    passwordInput = jQuery.trim(passwordInput);

    //validata data
    //validation_name , validation_email  , validation_password , validation_number
    let validationEmail, validationPassword;

    validationEmail = $('#validation_email');
    validationPassword = $('#validation_password');

    //EMAİL
    if (emailInput == '') {
      $(validationEmail).html('Email boş geçilemez ...');
    } else if (!validateEmail(emailInput)) {
      $(validationEmail).html('Email uygun formatta yazmadınız ...');
    }

    //PASSWORD
    if (passwordInput == '') {
      $(validationPassword).html('Şifre boş geçilemez ...');
    } else if (!validatePhone(passwordInput)) {
      $(validationPassword).html('Şifreyi uygun formatta yazmadınız ...');
    }

    //regex Email
    function validateEmail(email) {
      var regex44 = new RegExp('^[A-Z0-9._%+-]+@[A-Z0-9.-]+.[A-Z]{2,4}$');
      return regex44.test(email);
    }

    //regex number
    //https://regexr.com/3c53v
    function validatePhone(telephone) {
      let regex3 = new RegExp(
        '^[+]?[(]?[0-9]{3}[)]?[-s.]?[0-9]{3}[-s.]?[0-9]{4,6}$'
      );

      //let deneme=regex.test(telephone);
      return regex3.test(telephone);
    }
  });

  $('#btnSubmit').click(function () {
    // alert("Tıkladı")

    //input değerlerini almak
    let nameInput, emailInput, passwordInput, telNumberInput;
    nameInput = $('#name_surname').val();
    nameInput = jQuery.trim(nameInput);

    emailInput = $('#email').val();
    emailInput = jQuery.trim(emailInput);

    passwordInput = $('#password').val();
    passwordInput = jQuery.trim(passwordInput);

    telNumberInput = $('#tel_number').val();
    telNumberInput = jQuery.trim(telNumberInput);

    //validata data
    //validation_name , validation_email  , validation_password , validation_number
    let validationName, validationEmail, validationPassword, validationNumber;
    validationName = $('#validation_name');
    validationEmail = $('#validation_email');
    validationPassword = $('#validation_password');
    validationNumber = $('#validation_number');

    //validation control
    //NAME SURNAME
    if (nameInput == '') {
      $(validationName).html('Adı veya Soyadı boş geçilemez ...');
    }

    //NUMBER
    if (telNumberInput == '') {
      $(validationNumber).html('Telefon Boş geçilemez ...');
    }

    //EMAİL
    if (emailInput == '') {
      $(validationEmail).html('Email boş geçilemez ...');
    } else if (!validateEmail(emailInput)) {
      $(validationEmail).html('Email uygun formatta yazmadınız ...');
    }

    //PASSWORD
    if (passwordInput == '') {
      $(validationPassword).html('Şifre boş geçilemez ...');
    } else if (!validatePhone(passwordInput)) {
      $(validationPassword).html('Şifreyi uygun formatta yazmadınız ...');
    }

    //regex Email
    function validateEmail(email) {
      var regex44 = new RegExp('^[A-Z0-9._%+-]+@[A-Z0-9.-]+.[A-Z]{2,4}$');
      return regex44.test(email);
    }

    //regex number
    //https://regexr.com/3c53v
    function validatePhone(telephone) {
      let regex3 = new RegExp(
        '^[+]?[(]?[0-9]{3}[)]?[-s.]?[0-9]{3}[-s.]?[0-9]{4,6}$'
      );

      //let deneme=regex.test(telephone);
      return regex3.test(telephone);
    }
  });
});

// var valor1 = $("#val1");
// var valor2 = $("#val2");

// $("#calcular").click(function () {
//     var op = document.getElementById("operacao").value;

//     if (op == "+") {
//         var resultado = parseInt(valor1.val()) + parseInt(valor2.val());
//     } else if (op == "-") {
//         var resultado = parseInt(valor1.val()) - parseInt(valor2.val());
//     } else if (op == "/") {
//         var resultado = parseInt(valor1.val()) / parseInt(valor2.val());
//     } else if (op == "*") {
//         var resultado = parseInt(valor1.val()) * parseInt(valor2.val());
//     }

//     $("#resultado").html(resultado);
// });

$(document).ready(function () {

    $("#frmCalcular").submit(function (event) {
        event.preventDefault();
        ajax();
    });

    function ajax() {
        if ($("#val1").val() == '' || $("#val2").val() == '') {
            addMensagem("Os campos não podem ser nulos!", "danger");
        } else {
            var formData = {
                valor1: $("#val1").val(),
                valor2: $("#val2").val()
            }
            alert(JSON.stringify(formData))
            $.ajax({
                type: "post",
                contentType: "application/json",
                url: "./calculo",
                data: JSON.stringify(formData),
                dataType: 'json',
                success: function (data) {
                    alert(JSON.stringify(data));
                    $("#corpoTabela").append(corpo);
                },
                error: function (e) {
                    alert(JSON.stringify(e));
                }
            });
        }
    }
});
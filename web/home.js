var valor1 = $("#val1");
var valor2 = $("#val2");

$("#calcular").click(function () {
    var op = document.getElementById("operacao").value;

    if (op == "+") {
        var resultado = parseInt(valor1.val()) + parseInt(valor2.val());
    } else if (op == "-") {
        var resultado = parseInt(valor1.val()) - parseInt(valor2.val());
    } else if (op == "/") {
        var resultado = parseInt(valor1.val()) / parseInt(valor2.val());
    } else if (op == "*") {
        var resultado = parseInt(valor1.val()) * parseInt(valor2.val());
    }

    $("#resultado").html(resultado);
});

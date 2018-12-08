<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Produto</title>
    </head>
    <body>
        <h1>Cadastro Produto</h1>
        <form id="frmCadProduto"  method="post" action="inserirProduto" >
            <table>

                <tr>
                    <td>Codigo</td>
                    <td>
                        <input type="text" name="codigo" id="codigo">  
                    </td>
                </tr>

                <tr>
                    <td>Descrição</td>
                    <td> 
                        <input type="text" name="descricao" id="descricao">  
                    </td>             
                </tr>

                <tr>
                    <td>Valor</td>
                    <td> 
                        <input type="money" name="valor" id="valor">  
                    </td>            
                </tr>
                <tr>
                    <td colspan="2"> <input type="submit" value="Gravar"> </td>
                </tr>
            </table>
        </form>
    </body>
</html>

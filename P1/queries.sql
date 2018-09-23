DELIMITER $
    create procedure sp_depositar(in pIdCliente int, in pValor double)
	begin 
		update cliente set saldo = (saldo + pValor)
        where id = pIdCliente;
    end $    
    DELIMITER;
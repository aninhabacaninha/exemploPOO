package controller;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CompromissoController {
	private Date formatarData(String data) throws ParseException {
        DateFormat datformat = new SimpleDateFormat("dd/MM/yyyy");
        return new Date(datformat.parse(data).getTime());
    }
	
	private Date formatarHora(String hora) throws ParseException {
        DateFormat horformat = new SimpleDateFormat("dd/MM/yyyy");
        return new Date(horformat.parse(hora).getTime());
    }
}

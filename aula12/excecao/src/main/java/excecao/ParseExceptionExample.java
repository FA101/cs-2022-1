package excecao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseExceptionExample {

    public static Date converteData(String dt) throws ParseException
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date;
        date = dateFormat.parse(dt);

        return date;
    }

    public static void main(String[] args) {

        String dateStr = "2011/11/19";

        try{
            Date date = converteData(dateStr);
            System.out.println(date);
        }catch(ParseException pe){
            pe.printStackTrace();
        }
    }
}
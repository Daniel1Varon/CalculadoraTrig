package edu.eci.escuelaing.arep;

import edu.eci.escuelaing.arep.recursos.Calculadora;
import org.json.JSONObject;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        port(getPort());
        get("/calc",(req,res)->{
            String op = req.queryParams("op");
            String num = req.queryParams("num");
            JSONObject jsonObject = new JSONObject();
            double valorARetornar = Calculadora.calculadora(op,num);
            jsonObject.put("operación",op);
            jsonObject.put("valor",valorARetornar);
            return jsonObject;

        });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}

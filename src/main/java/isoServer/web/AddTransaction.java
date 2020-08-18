package isoServer.web;

import com.google.gson.Gson;
import isoServer.model.IsoMessage;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;


@WebServlet(urlPatterns = {"/add"})
public class AddTransaction extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        StringBuffer jb = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                jb.append(line);
            }
        } catch (Exception e) {
        }

        try {
            IsoMessage iso = new Gson().fromJson(String.valueOf(jb), IsoMessage.class);
            System.out.println(iso.getMessage());
        } catch (Exception e) {
        }

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifsp;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author aluno
 */
public class calculo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        response.setContentType("text/html;charset=UTF-8");
        String valor1 = request.getParameter("valor1");
        String valor2 = request.getParameter("valor2");
        String op = request.getParameter("operacao");
        Float resultado = Float.parseFloat("0");
        System.out.println("println");

        StringBuilder json = new StringBuilder();
        BufferedReader reader = request.getReader();
        String linha;
        while ((linha = reader.readLine()) != null) {
            json.append(linha);
        }
        JSONObject req33 = new JSONObject(json);
        System.out.println("json " + req33.getString("valor1"));

//        Float vF1 = Float.parseFloat(valor1);
//        Float vF2 = Float.parseFloat(valor2);
//
//        switch (op) {
//            case "+":
//                resultado = vF1 + vF2;
//                break;
//            case "-":
//                resultado = vF1 - vF2;
//                break;
//            case "/":
//                resultado = vF1 / vF2;
//                break;
//            case "*":
//                resultado = vF1 * vF2;
//                break;
//            default:
//                break;
//        };
        PrintWriter out = response.getWriter();
        try {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json");

            JSONArray jsonArray = new JSONArray();

            JSONObject jsonObject = new JSONObject();

            jsonObject.put("result", resultado);

            jsonArray.put(jsonObject);

            out.print(jsonArray);
        } catch (JSONException ex) {
            Logger.getLogger(calculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

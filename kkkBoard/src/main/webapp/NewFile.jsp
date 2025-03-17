<%@ page import="java.sql.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    Connection conn = null;
    try {
        // DB 연결 정보
        String user = "kcy";
        String pass = "1234";
        String url = "jdbc:mysql://localhost:3306/kcy";
        
        // 드라이버 로드 & 연결 시도
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, pass);
        
        if (conn != null) {
            out.println("<h1>✅ DB 연결 성공!</h1>");
        } else {
            out.println("❌ DB 연결 실패!");
        }
    } catch (Exception e) {
        e.printStackTrace();
        out.println("❌ 에러 발생: " + e.getMessage());
    } finally {
        if (conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
    }
%>
